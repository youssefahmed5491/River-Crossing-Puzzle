package riverCrossingPack;




public class Plant implements ICrosser{

    @Override
    public boolean canSail() {
      return false;
    }

    @Override
    public int getEatingRank() {
       return 3;
    }

	@Override
	public int getWeight() {
		return 0;
	}

   
    
}
