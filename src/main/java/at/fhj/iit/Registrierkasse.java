package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

//TODO: commenting and testing
public class Registrierkasse implements RegisterInterface{
    static List<SellingData> sellingDataList = new ArrayList<>();

    public Registrierkasse() {
    }
    /**
     * Total sales for each category:
     * non alcoholic drinks
     * "light" drinks (alcoholic <= 16%)
     * "hard" drinks (alcoholic > 16%)
     */
    //Calculate sales per drink, differences in liquids
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
    //Calculate sales for one day
    @Override
    public double salesPerDay(SellingDay day) {
        double timePrice = 0.0;
        for(SellingData data : sellingDataList){
            if(data.getSellingDay().equals(day)){
                timePrice += data.getPrice();
            }
        }
        return timePrice ;          //TODO: in main nothing return!!!
    }
    //Calculate sales per selling person
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
    //calculate sales for one day made by one selling person
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
    public void addData(SellingData data){
        sellingDataList.add(data);
    }
}
