package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract base class for concrete drink classes
 */
public abstract class Drink {
    /**
     * name of the drink, so it's easier to identify drink
     */
    protected String name;


    protected final List<Liquid> liquids = new ArrayList<>();

    /**
     * Creates a Drink object with given name, e.g. juice or orange juice
     *
     * @param name name of the drink
     *
     */

    public Drink(String name) {
        this.name = name;
    }


    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    public abstract double getVolume();

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    public abstract double getAlcoholPercent();

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    public abstract boolean isAlcoholic();

    /**
     * adds a Liquid to the Cocktail
     * @param liquid any alcoholic or non-alcoholic Liquid
     */
    public void addLiquid(Liquid liquid){
        liquids.add(liquid);
    }

    public List<Liquid> getLiquids() {
        return liquids;
    }
}
