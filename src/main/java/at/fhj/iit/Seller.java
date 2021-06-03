package at.fhj.iit;

/**
 * Person selling the Drinks
 */
public class Seller {
    private String name;
    private int id ;

    /**
     * @return the name of the Seller
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the name
     * @param name the name of the seller
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Constructor
     * @param name Seller name
     * @param id Seller id
     */
    public Seller(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Seller(){}
}

