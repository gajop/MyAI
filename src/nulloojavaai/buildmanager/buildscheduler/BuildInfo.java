package nulloojavaai.buildmanager.buildscheduler;

import com.springrts.ai.AIFloat3;
import com.springrts.ai.oo.UnitDef;

public class BuildInfo {
	public BuildInfo(UnitDef def, AIFloat3 pos, int facing) {
		this.def = def;
		this.pos = pos;
		this.buildFacing = facing;
	}
	
	int GetXSize() { 
		return (buildFacing&1)==0 ? def.getXSize() : def.getZSize(); 
	}
	int GetZSize() { 
		return (buildFacing&1)==1 ? def.getXSize() : def.getZSize(); 
	}
	
	public UnitDef def;
	public AIFloat3 pos;
	public int buildFacing;
}
