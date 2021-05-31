package at.fhj.iit;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * Tea is a special SimpleDrink
 * Tea with Alcohol is possible (exp. Tea with Rum)
 * @author      Andrea Hessler
 * Last Change: 25.04.2021
 */
public class Tea extends Drink{
        /**
     * Creates a Tea object with given name and liquid
     * @param name name of Tea
     */
    Tea(String name){
        super(name);
    }
    /**
     * @return name of the tea
     */
    public String getName(){
        return super.name;
    }
    /**
     * Returns volume of all liquids in a tea
     * @return the volume of Tea in litre
     */
    @Override
    public double getVolume() {
        double volAll = 0.0;
        for(Liquid l:getLiquids()){
            volAll += l.getVolume();
        }
        return volAll;
    }

    /**
     * Returns alcohol volume percent of the tea, consider all liquids in the tea
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        double alcPercentAll = 0.0;
        for(Liquid l: getLiquids()){
            alcPercentAll += l.getAlcoholPercent()*l.getVolume();
        }
        return (alcPercentAll/getLiquids().size());
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise (OLD: false) --> NEW: throw Exception for Test
     */
    public boolean isAlcoholic() {
        for(Liquid l:getLiquids()){
            if(l.getAlcoholPercent()>0){
                return true;
            }
//            else throw new RuntimeException("It isn't an alcoholic tea."); --> now water is a liquid too
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

//    NOT used in part of Registrierkasse:
//    protected liquid l;
//    public String toString() {
//      return "Tea called " + name + " with " + l.getAlcoholPercent() + " percent alcohol by volume";
//    }
//    /**
//     * NEW: validate Input of Tea-Name
//     **/
//    public void hasName(String name) {
//        this.name = name;
//        if (this.name.isBlank()) throw new RuntimeException("There is no Input for the name of the tea.");
//    }
//    /**
//     * NEW: Map-List with alcoholic Teas
//     */
//    Map<String, Tea> teaList = new ConcurrentHashMap<>();
//    public void addTea(String name, Liquid l){
//        Tea tea = new Tea(name, l);
//        hasName(name);
//        tea.isAlcoholic();
//        teaList.put(key(), tea);
//    }
//    protected Collection<Tea> getAllTeas(){
//        return teaList.values();
//    }
//    private String key(){
//        return String.format("%s", name);
//    }
}
