package at.fhj.iit;

/**
 * Cocktail consisting of multiple Liquids
 * @see Drink
 * @author Lukas Becker
 * last change: 24.04.2021
 */
public class Cocktail extends Drink {

    /**
     * Creates a Drink object with given name, e.g. juice or orange juice
     *
     * @param name name of the drink
     */
    public Cocktail(String name) {
        super(name);
    }


    /**
     * @return the name of the cocktail
     */
    public String getName(){
        return super.name;
    }

    /**
     * adds the Volumes of the Liquids together
     * @return the calculated volume of all Liquids together
     */
    @Override
    public double getVolume() {
        //returns the average volume
        double sum = 0;
        for(Liquid l:getLiquids()){
            sum += l.getVolume();
        }
        return sum;
    }

    /**
     * Averages the alcohol percent of each Liquid
     * @return the average alcohol percentage
     */
    @Override
    public double getAlcoholPercent() {
        //returns average alcohol percent
        double sum = 0;
        for(Liquid l: getLiquids()){
           sum += l.getAlcoholPercent();
        }
        return sum/ getLiquids().size();
    }

    /**
     * checks if any Liquid in the cocktail is alcoholic
     * @return true if there is alcohol, false if not
     */
    @Override
    public boolean isAlcoholic() {

        for(Liquid l:getLiquids()){
            if(l.getAlcoholPercent()>0){
                return true;
            }
        }
        return false;
    }

    /**
     * gets all the Liquids names
     * @return a String array containing all the Liquid names
     */
    public String[] getLiquidsString(){
        String[] liquidsStr = new String[getLiquids().size()];
        for(int i = 0; i< getLiquids().size();i++){
            liquidsStr[i]= getLiquids().get(i).getName();
        }
        return liquidsStr;
    }



}
