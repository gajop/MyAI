package myai.economymanager;

import com.springrts.ai.oo.Resource;

public interface ResourcePredictor {
	public void update(int frame);
	/**
	 * gives a prediction of total amount of specified resource, at given frame
	 */
	public double guessResourceAmount(Resource resource, int frame);
	/**
	 * gives a prediction of the derivateive : d(resource/frame) at given frame
	 */
	public double guessResourceIncome(Resource resource, int frame);
}
