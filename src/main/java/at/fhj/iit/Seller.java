package at.fhj.iit;

/**
 * Person selling the Drinks
 */
public class Seller {
    private String name;
    private int id ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Seller(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

