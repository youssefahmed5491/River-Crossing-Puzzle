package riverCrossingPack;


public abstract class Carnivore implements ICrosser {

    @Override
    public boolean canSail() {
        return false;
    }

    @Override
    public int getEatingRank() {
        return 5;
    }
}
