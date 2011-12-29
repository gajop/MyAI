package myai.economy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import myai.utility.SpringCommunications;

import com.springrts.ai.oo.clb.Resource;

public class SimpleResourcePreditor implements ResourcePredictor {
	Map<Resource, LinkedList<Measurement>> resourceIncomes = new HashMap<Resource, LinkedList<Measurement>>();
	Map<Resource, LinkedList<Measurement>> resourceAmounts = new HashMap<Resource, LinkedList<Measurement>>();
	SpringCommunications spring;
	
	class Measurement {
		int frame;
		double value;
		public Measurement(int frame, double value) {
			super();
			this.frame = frame;
			this.value = value;
		}
		public int getFrame() {
			return frame;
		}
		public void setFrame(int frame) {
			this.frame = frame;
		}
		public double getValue() {
			return value;
		}
		public void setValue(double value) {
			this.value = value;
		}		
	}
    
    public SimpleResourcePreditor(SpringCommunications spring) {
		super();
		this.spring = spring;
		for (Resource resource : spring.getClb().getResources()) {
			LinkedList<Measurement> resourceIncome = new LinkedList<Measurement>();
			LinkedList<Measurement> resourceAmount = new LinkedList<Measurement>();
			resourceIncomes.put(resource, resourceIncome);
			resourceAmounts.put(resource, resourceAmount);
			for (int i = 0; i < 10; ++i) {			
				resourceIncome.push(new Measurement(0, this.spring.getClb().getEconomy().getIncome(resource) - this.spring.getClb().getEconomy().getUsage(resource)));
				resourceAmount.push(new Measurement(0, this.spring.getClb().getEconomy().getCurrent(resource)));
		    }
		}
	}

	@Override
	public void update(int frame) {
		for (Resource resource : this.spring.getClb().getResources()) {
            double deltaIncome = this.spring.getClb().getEconomy().getIncome(resource) - this.spring.getClb().getEconomy().getUsage(resource);
            resourceIncomes.get(resource).addLast(new Measurement(frame, deltaIncome));
            resourceIncomes.get(resource).removeFirst();            
            resourceAmounts.get(resource).addLast(new Measurement(frame, this.spring.getClb().getEconomy().getCurrent(resource)));
            resourceAmounts.get(resource).removeFirst();
        }
	}

	@Override
	public double guessResourceAmount(Resource resource, int frame) {
		return 0;
	}

	@Override
	public double guessResourceIncome(Resource resource, int frame) {
    	double totalIncome = 0;
    	double totalAmount = 0;
    	for (Measurement measurement : resourceIncomes.get(resource)) {
    		totalIncome += measurement.getValue();
    	}
    	for (Measurement measurement : resourceAmounts.get(resource)) {
    		totalAmount += measurement.getValue();
    	}
    	return totalIncome /= resourceIncomes.get(resource).size();
	}

}
