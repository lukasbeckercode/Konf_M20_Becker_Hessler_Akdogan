package at.fhj.iit;

/**
 * Interface for the Registrierkasse.java class and every similar class to follow
 * @see Registrierkasse
 */
public interface RegisterInterface {
    double salesPerCapitaAndDay(Seller seller, SellingDay day);
    double salesPerCapita(Seller seller);
    double salesPerDay(SellingDay day);
    double[] salesPerDrink() ;

}
