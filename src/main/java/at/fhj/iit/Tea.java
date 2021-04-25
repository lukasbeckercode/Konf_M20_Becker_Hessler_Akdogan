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
     * @return true when alcoholic liquids are present, otherwise (OLD: false) --> NEW: throw Exception for Test
     */
    public boolean isAlcoholic() {
        if(l.getAlcoholPercent() > 0) return true;
        else throw new RuntimeException("It isn't an alcoholic tea.");
    }
    public String toString() {
        return "Tea called " + name + " with " + l.getAlcoholPercent() + " percent alcohol by volume";
    }
    /**
     * NEW: validate Input of Tea-Name
     **/
    public void hasName(String name) {
        this.name = name;
        if (this.name.isBlank()) throw new RuntimeException("There is no Input for the name of the tea.");
    }
    /**
     * NEW: Map-List with alcoholic Teas
     */
    Map<String, Tea> teaList = new ConcurrentHashMap<>();
    public void addTea(String name, Liquid l){
        Tea tea = new Tea(name, l);
        hasName(name);
        tea.isAlcoholic();
        teaList.put(key(), tea);
    }
    protected Collection<Tea> getAllTeas(){
        return teaList.values();
    }
    private String key(){
        return String.format("%s", name);
    }
}
