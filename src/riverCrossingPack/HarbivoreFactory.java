package riverCrossingPack;
public class HarbivoreFactory extends AbstractFactory {

    @Override
    public Harbivore getHarbivoire(String hname) {
        if (hname.equals("Goat")) {
            return new Goat();
        }
        return null;
    }

    @Override
    public Carnivore getCarnivoire(String cname) {
        return null;
    }



}
