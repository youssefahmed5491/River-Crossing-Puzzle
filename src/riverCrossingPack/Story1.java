package riverCrossingPack;

import java.util.ArrayList;
import java.util.List;



public class Story1 implements IcrossingStrategy {
	private static Story1 instance;
	
	private Story1(){
		
	}

	public static Story1 getInstance (){

		if (instance == null)

		instance = new Story1();

		return instance;

		}
    @Override
    public boolean isValid(List<ICrosser> right, List<ICrosser> left, List<ICrosser> boatRiders) {
        boolean valid = false;
        for (int i = 0; i < boatRiders.size(); i++) {
            ICrosser x = boatRiders.get(i);
            if (x.canSail()) {
                valid = true;
                break;
            }
        }
        if (valid == false) {
            return false;
        }
        if (left.size() == 3) {
            return false;
        } else if (left.size() == 2) {
            int diff=left.get(0).getEatingRank()-left.get(1).getEatingRank();
            //diff right*****************************************************************************************************************
        if(diff==1 ||diff==-1)
            return false;
        }
        if (right.size() == 3) {
            return false;
        } else if (right.size() == 2) {
            int diff=right.get(0).getEatingRank()-right.get(1).getEatingRank();
            //diff right*****************************************************************************************************************
        if(diff==1 ||diff==-1)
            return false;
        }
        return true;
    }

    @Override
    public List<ICrosser> getInitialCrossers() {
        List<ICrosser> c = new ArrayList<>();
        Factory f = new Factory();
        c.add(new Farmer(100));
        c.add(new Plant());
        c.add(f.getCrosser("Fox"));
        c.add(f.getCrosser("Goat"));

        return c;
    }
    
    public List<ICrosser> listreturner(boolean x , boolean y , boolean z , boolean v) {
   	 List<ICrosser> c = new ArrayList<>();
   	 Factory f = new Factory();
   	if(x) {
   		c.add(new Farmer(100));
   	}
   	if(y) {
   		c.add(new Plant());
   	}
   	if(z) {
   		c.add(f.getCrosser("Fox"));
   	}
   	if(v) {
   		c.add(f.getCrosser("Goat"));
   	}
		return c;
   	
   }

    @Override
    public String[] getInstructions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public boolean stackCheck(boolean y , boolean z , boolean v) {
      	
      	if(y||z||v) {
      		return false;
      	}
      	
      return true;
    }
    
   
    
    
}
