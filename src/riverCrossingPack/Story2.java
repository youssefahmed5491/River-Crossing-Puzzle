package riverCrossingPack;

import java.util.ArrayList;
import java.util.List;



public class Story2 implements IcrossingStrategy {

private static Story2 instance;
	
	private Story2(){
		
	}

	public static Story2 getInstance (){

		if (instance == null)

		instance = new Story2();

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
        if (boatRiders.size() >2) {
            return false;
        } else if (boatRiders.size() == 2) {
            int weight = boatRiders.get(0).getWeight()+boatRiders.get(1).getWeight();
            //diff right*****************************************************************************************************************
        if(weight > 100)
            return false;
        else {
        	return true;
        }
        }
		return true;
       
    }

    public List<ICrosser> listreturner(boolean fat , boolean norm , boolean lady , boolean boy , boolean sheep) {
   	 List<ICrosser> c = new ArrayList<>();
   	 Factory f = new Factory();
   	if(fat) {
   		c.add(new Farmer(90));
   	}
	if(norm) {
   		c.add(new Farmer(80));
   	}
	if(lady) {
   		c.add(new Farmer(60));
   	}
	if(boy) {
   		c.add(new Farmer(40));
   	}
   	if(sheep) {
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

	@Override
	public List<ICrosser> getInitialCrossers() {
		// TODO Auto-generated method stub
		return null;
	}
}
