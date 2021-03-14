/**
 * Tea is a special SimpleDrink
 * Tea with Alcohol is possible (exp. Tea with Rum)
 * Author:      Andrea Hessler
 * Last Change: 14.03.2021
 */

package at.fhj.iit;
public class Tea extends Drink{
    /**
     * uses only one liquid
     */
    protected Liquid l;

    /**
     * Creates a Tea object with given name and liquid
     *
     * @param name name of Tea
     * @param l only one liquid in Tea, because it's a simple drink an not e.g. a cocktail
     */
    Tea(String name, Liquid l){
        super(name);
        this.l = l;
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of Tea in litre
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(l.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }

    public String toString() {
        return "Tea called " + name + " with " + l.getAlcoholPercent() + " percent alcohol by volume";
    }
}
