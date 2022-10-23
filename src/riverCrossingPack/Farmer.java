package riverCrossingPack;

public class Farmer implements ICrosser {
	int weight;
	
    public Farmer(int weight) {
		super();
		this.weight = weight;
	}

	@Override
    public boolean canSail() {
        return true;
    }

    @Override
    public int getEatingRank() {
       return 10000;
    }

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

    
}
