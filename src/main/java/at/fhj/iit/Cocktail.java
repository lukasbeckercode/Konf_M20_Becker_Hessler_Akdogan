package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class Cocktail extends Drink {
    List<Liquid> liquids = new ArrayList<>();
    /**
     * Creates a Drink object with given name, e.g. juice or orange juice
     *
     * @param name name of the drink
     */
    public Cocktail(String name) {
        super(name);
    }

    public void addLiquid(Liquid liquid){
        liquids.add(liquid);
    }

    @Override
    public double getVolume() {
        //returns the average volume
        double sum = 0;
        for(Liquid l:liquids){
            sum += l.getVolume();
        }
        return sum;
    }

    @Override
    public double getAlcoholPercent() {
        //returns average alcohol percent
        double sum = 0;
        for(Liquid l: liquids){
           sum += l.getAlcoholPercent();
        }
        return sum/ liquids.size();
    }

    @Override
    public boolean isAlcoholic() {

        for(Liquid l: liquids){
            if(l.getAlcoholPercent()>0){
                return true;
            }
        }
        return false;
    }


}
