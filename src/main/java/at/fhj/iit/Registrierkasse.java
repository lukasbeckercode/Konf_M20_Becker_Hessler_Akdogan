package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

//TODO: commenting and testing
public class Registrierkasse implements RegisterInterface{

    static List<SellingData> sellingDataList = new ArrayList<>();

    public Registrierkasse(SellingData sellingData) {
        sellingDataList.add(sellingData);

    }

    @Override
    public double salesPerCapitaAndDay() {
        //TODO: calculate sales for one day made by one selling person
        return 0;
    }

    @Override
    public double salesPerCapita() {
        //TODO: Calculate sales per selling person
        return 0;
    }

    @Override
    public double salesPerDay() {
        //TODO: Calculate sales for one day
        return 0;
    }

    @Override
    public double salesPerDrink() {
        //TODO: differentiate between hard, light and non-alcoholic beverages (here or in main?)
        return 0;
    }
}
