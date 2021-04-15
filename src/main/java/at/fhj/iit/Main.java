
package at.fhj.iit;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        System.out.println("------ ROTWEIN ------");
        Liquid l = new Liquid("Wein", 0.125, 13);
        System.out.println("Alcohol: "+ l.getName());
        System.out.println("Volume: " + l.getVolume());

        Drink d = new SimpleDrink("Rotwein",l);
        System.out.println(d+"\n");

//-------------Cocktail Implementation----------------------------------------------------------
        Liquid dryGin = new Liquid("Dry Gin",0.060, 40);
        Liquid vermouth = new Liquid("Vermouth",0.010,16);

        Cocktail martini = new Cocktail("Martini");
        martini.addLiquid(dryGin);
        martini.addLiquid(vermouth);

        System.out.println("------ MARTINI ------");
        System.out.println("Contents of Martini:"+ Arrays.toString(martini.getLiquids()));
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
        Coffee coffee = new Coffee("Irish Coffee", whiskey);
        System.out.println("------ IRISH COFFEE ------");
        System.out.println("Alcoholic: " + coffee.isAlcoholic());
        System.out.println("Percent: " + coffee.getAlcoholPercent());
        System.out.println("Volume: " + coffee.getVolume());

    }
}
