
package at.fhj.iit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Drink> allDrinks = new ArrayList<>();
        System.out.println("------ ROTWEIN ------");
        Liquid l = new Liquid("Wein", 0.125, 13);
        System.out.println("Alcohol: "+ l.getName());
        System.out.println("Volume: " + l.getVolume());

        Drink d = new SimpleDrink("Rotwein",l);
        System.out.println(d+"\n");
        //allDrinks.add(d);

        //------------------------------Initialize 3 Seller-------------------------------------

        Seller seller1 = new Seller("Lukas",1);
        Seller seller2 = new Seller("Andrea",2);
        Seller seller3 = new Seller("David",3);

//-------------Cocktail Implementation----------------------------------------------------------
        Liquid dryGin = new Liquid("Dry Gin",0.060, 40,6.50);
        Liquid vermouth = new Liquid("Vermouth",0.010,16,8.70);

        Cocktail martini = new Cocktail("Martini");
        martini.addLiquid(dryGin);
        martini.addLiquid(vermouth);

        System.out.println("------ MARTINI ------");
        System.out.println("Contents of Martini:"+ Arrays.toString(martini.getLiquidsString()));
        System.out.printf("%s is Alcoholic: %b%n",martini.getName(),martini.isAlcoholic());
        System.out.printf("Alcohol percentage of %s: %.2f%n",martini.getName(),martini.getAlcoholPercent());
        System.out.printf("Volume of %s: %.2f%n",martini.getName(),martini.getVolume());
//------------------------------------------------------------------------------------------------

        System.out.println("\n------ BLACK TEA WITH RUM ------");
        Liquid rum = new Liquid("rum", 0.125, 43, 2.10);
        Liquid blackTea1 = new Liquid("hot water + black tea bag", 0.375, 0, 1.50);

        Tea teaRum = new Tea("Black Tea with Rum");
        teaRum.addLiquid(rum);
        teaRum.addLiquid(blackTea1);

        System.out.println("Contents of Black Tea with Rum:"+ Arrays.toString(teaRum.getLiquidsString()));
        System.out.printf("%s is Alcoholic: %b%n",teaRum.getName(),teaRum.isAlcoholic());
        System.out.printf("Alcohol percentage of %s: %.2f%n",teaRum.getName(),teaRum.getAlcoholPercent());
        System.out.printf("Volume of %s: %.2f%n",teaRum.getName(),teaRum.getVolume());

//------------------------------------------------------------------------------------------------

        System.out.println("\n------ SIMPLE BLACK TEA ------");
        Liquid blackTea2 = new Liquid("hot water + black tea bag", 0.5, 0, 2.10);

        Tea black = new Tea("Black Tea");
        black.addLiquid(blackTea2);

        System.out.println("Contents of Black Tea:"+ Arrays.toString(black.getLiquidsString()));
        System.out.printf("%s is Alcoholic: %b%n",black.getName(),black.isAlcoholic());
        System.out.printf("Alcohol percentage of %s: %.2f%n",black.getName(),black.getAlcoholPercent());
        System.out.printf("Volume of %s: %.2f%n",black.getName(),black.getVolume());

//------------------------------------------------------------------------------------------------

        System.out.println();
        Liquid whiskey = new Liquid("Whiskey", 0.03, 40);
        whiskey.setPrice(15.50);
        Coffee coffee = new Coffee("Irish Coffee", whiskey);
        System.out.println("------ IRISH COFFEE ------");
        System.out.println("Alcoholic: " + coffee.isAlcoholic());
        System.out.println("Percent: " + coffee.getAlcoholPercent());
        System.out.println("Volume: " + coffee.getVolume());
//------------------------------adding Stuff to selling data-------------------
        //TODO: add more things (or drinks) to the counter
        Registrierkasse counter = new Registrierkasse();
        SellingDay silvester = new SellingDay("31.12.20");
        SellingDay newyear = new SellingDay("1.1.21");
        counter.addData(new SellingData(martini,seller1,newyear));

        counter.addData(new SellingData(teaRum,seller2,silvester));
        counter.addData(new SellingData(teaRum,seller2,silvester));
        counter.addData(new SellingData(teaRum,seller2,silvester));
        counter.addData(new SellingData(teaRum,seller2,newyear));
        counter.addData(new SellingData(black,seller2,newyear));
        counter.addData(new SellingData(black,seller2,newyear));
        counter.addData(new SellingData(martini,seller2,silvester));
        counter.addData(new SellingData(martini,seller2,silvester));
        counter.addData(new SellingData(martini,seller2,silvester));
        counter.addData(new SellingData(martini,seller2,silvester));
        counter.addData(new SellingData(martini,seller2,silvester));
        counter.addData(new SellingData(martini,seller2,silvester));
        counter.addData(new SellingData(martini,seller2,silvester));
        counter.addData(new SellingData(martini,seller2,silvester));
        counter.addData(new SellingData(martini,seller2,silvester));
        counter.addData(new SellingData(martini,seller2,silvester));
        counter.addData(new SellingData(martini,seller2,silvester));
        counter.addData(new SellingData(martini,seller2,silvester));
        counter.addData(new SellingData(martini,seller2,newyear));
        counter.addData(new SellingData(martini,seller2,newyear));
        counter.addData(new SellingData(martini,seller2,newyear));
        counter.addData(new SellingData(martini,seller2,newyear));
        counter.addData(new SellingData(martini,seller2,newyear));
        counter.addData(new SellingData(martini,seller2,newyear));

// ------------------------------print data from Registrierkasse-------------------

        System.out.println("\n------ REGISTRIERKASSE ------");
        System.out.printf("Sales of all softdrinks: %.2f%n", counter.salesPerDrink()[0]);
        System.out.printf("Sales of all light alcoholic drinks: %.2f%n", counter.salesPerDrink()[1]);
        System.out.printf("Sales of all hard alcoholic drinks: %.2f%n", counter.salesPerDrink()[2]);
        System.out.printf("Sales per day - 31.12.2020: %.2f%n", counter.salesPerDay(silvester));
        System.out.printf("Sales per day - 01.01.2021: %.2f%n", counter.salesPerDay(newyear));
        System.out.printf("Sales per Lukas Becker: %.2f%n", counter.salesPerCapita(seller1));
        System.out.printf("Sales per Andrea Hessler: %.2f%n", counter.salesPerCapita(seller2));
        System.out.printf("Sales per Lukas Becker and day - 31.12.2020: %.2f%n", counter.salesPerCapitaAndDay(seller1, silvester));
        System.out.printf("Sales per Andrea Hessler and day - 31.12.2020: %.2f%n", counter.salesPerCapitaAndDay(seller2, silvester));
        System.out.printf("Sales per Lukas Becker and day - 01.01.2021: %.2f%n", counter.salesPerCapitaAndDay(seller1, newyear));
        System.out.printf("Sales per Andrea Hessler day - 01.01.2021: %.2f%n", counter.salesPerCapitaAndDay(seller2, newyear));

    }
}
