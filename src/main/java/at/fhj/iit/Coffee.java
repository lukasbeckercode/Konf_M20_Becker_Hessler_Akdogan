package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class Coffee extends Drink {
    List<Liquid> liquids = new ArrayList<>();

    public Coffee(String name) {
        super(name);
    }
    public void addMilk(Liquid milk){
        liquids.add(milk);
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }




}
