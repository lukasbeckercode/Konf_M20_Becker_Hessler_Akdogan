package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

/**
 * Total sales for each category:
 * non alcoholic drinks
 * "light" drinks (alcoholic <= 16%)
 * "hard" drinks (alcoholic > 16%)
 */
public class Registrierkasse implements RegisterInterface{
    static List<SellingData> sellingDataList = new ArrayList<>();

    /**
     * Default Constructor
     */
    public Registrierkasse() {
    }

    /**
     * Calculate sales per drink, differences in liquids
     * @return money made from selling all drinks on one day
     */
    @Override
    public double[] salesPerDrink() {
        double drinkPriceSoft = 0.0;
        double drinkPriceLight = 0.0;
        double drinkPriceHard = 0.0;
        Drink drink;
        for (SellingData data : sellingDataList) {
            drink = data.getDrink();
            //difference in AlcoholPercent of drink
            double alc = drink.getAlcoholPercent();
            if (alc == 0) drinkPriceSoft += data.getPrice();
            else if (alc <= 16) drinkPriceLight += data.getPrice();
            else if (alc > 16) drinkPriceHard += data.getPrice();
            else System.out.println("Error - Alc < 0%");
        }
        double[] sumDrinkPrice = new double[3];
        sumDrinkPrice[0] = drinkPriceSoft;
        sumDrinkPrice[1] = drinkPriceLight;
        sumDrinkPrice[2] = drinkPriceHard;
        return sumDrinkPrice;
    }

    /**
     * Calculates sales per day
     * @param day the day that is looked at
     * @return the complete revenue made on that day as a double
     */
    @Override
    public double salesPerDay(SellingDay day) {
        double timePrice = 0.0;
        for(SellingData data : sellingDataList){
            if(data.getSellingDay().getDayTitle().equals(day.getDayTitle())){
                timePrice += data.getPrice();
            }
        }
        return timePrice ;          //TODO: in main nothing return!!!
    }


    /**
     * Calculate sales per selling person
     * @param seller the seller that is looked at
     * @return the revenue made by one seller over time
     */
    @Override
    public double salesPerCapita(Seller seller) {
        double capitaPrice = 0.0;
        for (SellingData data : sellingDataList){
            if(data.getSeller() == seller){
                capitaPrice += data.getPrice();
            }
        }
        return capitaPrice;
    }

    /**
     * calculate sales for one day made by one selling person
     * @param seller the seller that is looked at
     * @param day the day that is looked at
     * @return the revenue made by one seller on one day
     */
    @Override
    public double salesPerCapitaAndDay(Seller seller, SellingDay day) {
        double capitaDayPrice = 0.0;
        for (SellingData data : sellingDataList){
            if(data.getSeller() == seller && data.getSellingDay() == day){
                capitaDayPrice += data.getPrice();
            }
        }
        return capitaDayPrice;
    }

    /**
     * Add something to the dataList
     * @param data the data to be added
     */
    public void addData(SellingData data){
        sellingDataList.add(data);
    }

    public SellingData getData(int index){
        return sellingDataList.get(index);
    }
}
