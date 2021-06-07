package at.fhj.iit;

/**
 * Coffee consisting of multiple Liquids
 * @see Drink
 * @author David Akdogan
 * last change: 24.04.2021
 * @deprecated 
 */

public class Coffee extends Drink {

    protected Liquid l;

    /**
     * get the name of the cocktail
     * @param name name of the drink
     * get any Liquid
     */

    public Coffee(String name, Liquid l) {
        super(name);
        this.l = l;
    }

    /**
     * @return the volume of all Liquids
     */

    @Override
    public double getVolume() {
             return l.getVolume();
    }

    /**
     * @return the AlcoholPercent
     */

    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * checks if any Liquid in the cocktail is alcoholic
     * @return true if it contains alcohol
     */

    @Override
    public boolean isAlcoholic() {
        return l.getAlcoholPercent() > 0;
    }

}
