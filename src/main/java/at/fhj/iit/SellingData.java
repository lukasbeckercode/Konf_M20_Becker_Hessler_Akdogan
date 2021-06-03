package at.fhj.iit;
//TODO: Comment and test, more implementation
public class SellingData {
    private final Drink drink;
    private final Seller seller;
    private final SellingDay sellingDay;
    private double price = 0.0;

    /**
     * Constructor
     * @param drink which drink was sold
     * @param seller which seller sold the drink
     * @param sellingDay when the drink was sold
     */
    public SellingData(Drink drink, Seller seller, SellingDay sellingDay) {
        this.drink = drink;
        this.seller = seller;
        this.sellingDay = sellingDay;
        calcPrice();
    }

    /**
     * Calculates the price of a Drink based on the prices of the liquids
     */
    private void calcPrice(){
        for(Liquid l: drink.getLiquids()){
            price += l.getPrice();
        }
    }

    /**
     * Getter for the Price
     * @return the price of a Liquid
     */
    public double getPrice() {
        return price;
    }

    /**
     * getter for the Drink
     * @return a Drink object or any of it's subclasses
     */
    public Drink getDrink() {
        return drink;
    }

    /**
     * Getter for the Seller
     * @return the Seller Object
     */
    public Seller getSeller() {
        return seller;
    }

    /**
     * getter for the selling Day
     * @return the selling day
     */
    public SellingDay getSellingDay() {
        return sellingDay;
    }
}
