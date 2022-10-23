package riverCrossingPack;



public class Harbivore implements ICrosser{

    @Override
    public boolean canSail() {
       return false;
    }

    @Override
    public int getEatingRank() {
       return 4;
    }

	@Override
	public int getWeight() {
		
		return 20;
	}

    
}
