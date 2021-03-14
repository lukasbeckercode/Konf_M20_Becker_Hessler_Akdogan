package at.fhj.iit;

public class Coffee extends Drink {

    protected Liquid l;

    public Coffee(String name, Liquid l) {
        super(name);
        this.l = l;
    }

    @Override
    public double getVolume() {
             return l.getVolume();
    }

    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    @Override
    public boolean isAlcoholic() {
        return l.getAlcoholPercent() > 0;
    }


}
