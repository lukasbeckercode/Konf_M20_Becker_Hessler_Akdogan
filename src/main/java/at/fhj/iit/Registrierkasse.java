package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

//TODO: commenting and testing
public class Registrierkasse implements RegisterInterface{
    private Liquid l;                                                   //ggf. löschen, wenn unten anders gelöst
    private SellingDay day;
    private Seller seller;
    static List<SellingData> sellingDataList = new ArrayList<>();

    public Registrierkasse(SellingData sellingData) {
        sellingDataList.add(sellingData);
    }
    /**
     * Total sales for each category:
     *  - non alcoholic drinks
     *  - "light" drinks (alcoholic <= 16%)
     *  - "hard" drinks (alcoholic > 16%)
     */
    @Override
    public double[] salesPerDrink() {
        double sumNonAlc = 0.0;
        double sumLight = 0.0;
        double sumHard = 0.0;
        if (l.getAlcoholPercent()==0) sumNonAlc += l.getPrice();        //ggf.: drink.getLiquids().getPrice() ODER: SellingData.getPrice()
        else if (l.getAlcoholPercent()<=16) sumLight += l.getPrice();
        else if (l.getAlcoholPercent()>16) sumHard += l.getPrice();
        else System.out.println("Error - Alc < 0%");
        double[] sum = new double[3];
        sum[0] = sumNonAlc;
        sum[1] = sumLight;
        sum[2] = sumHard;
        return sum;
    }
    @Override
    public double salesPerDay() {
        //TODO: Calculate sales for one day
        return 0;
    }
    @Override
    public double salesPerCapita() {
        //TODO: Calculate sales per selling person
        return 0;
    }
    @Override
    public double salesPerCapitaAndDay() {
        //TODO: calculate sales for one day made by one selling person
        salesPerDay();
        salesPerCapita();
        return 0;
    }

}
