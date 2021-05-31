package at.fhj.iit;
//TODO: comment
public interface RegisterInterface {
    double salesPerCapitaAndDay(Seller seller, SellingDay day);
    double salesPerCapita(Seller seller);
    double salesPerDay(SellingDay day);
    double[] salesPerDrink();

}
