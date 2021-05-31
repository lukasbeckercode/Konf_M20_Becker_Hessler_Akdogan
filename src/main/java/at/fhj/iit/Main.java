
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
        Liquid lt = new Liquid("Rum", 0.125, 43);
        System.out.println("Alcohol: "+ lt.getName());
        System.out.println("Volume: " + lt.getVolume());

        Drink t = new Tea("Black Tea with Rum",lt);
        System.out.println(t);

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
        counter.addData(new SellingData(martini,seller1,new SellingDay("1.1.21")));

    }
}
