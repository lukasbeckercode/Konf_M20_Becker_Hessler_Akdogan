package at.fhj.iit;
//TODO: Comment and test, more implementation
public class SellingData {
    private Drink drink;
    private Seller seller;
    private SellingDay sellingDay;
    private double price = 0;

    public SellingData(Drink drink, Seller seller, SellingDay sellingDay) {
        this.drink = drink;
        this.seller = seller;
        this.sellingDay = sellingDay;
        calcPrice();
    }

    private void calcPrice(){

        for(Liquid l: drink.getLiquids()){
            price += l.getPrice();
        }
    }

    public double getPrice() {
        return price;
    }
}
