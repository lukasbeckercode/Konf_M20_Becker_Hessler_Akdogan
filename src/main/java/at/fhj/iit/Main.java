
package at.fhj.iit;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        Liquid l = new Liquid("Wein", 0.125, 13);
        System.out.println(l.getName());
        System.out.println(l.getVolume());

        Drink d = new SimpleDrink("Rotwein",l);
        System.out.println(d);
//-------------Cocktail Implementation----------------------------------------------------------
        Liquid dryGin = new Liquid("Dry Gin",0.060, 40);
        Liquid vermouth = new Liquid("Vermouth",0.010,16);

        Cocktail martini = new Cocktail("Martini");
        martini.addLiquid(dryGin);
        martini.addLiquid(vermouth);

        System.out.println("Contents of Martini:"+ Arrays.toString(martini.getLiquids()));
        System.out.printf("%s is Alcoholic: %b%n",martini.getName(),martini.isAlcoholic());
        System.out.printf("Alcohol percentage of %s: %.2f%n",martini.getName(),martini.getAlcoholPercent());
        System.out.printf("Volume of %s: %.2f%n",martini.getName(),martini.getVolume());
//------------------------------------------------------------------------------------------------

        Liquid lt = new Liquid("Rum", 0.125, 43);
        System.out.println(lt.getName());
        System.out.println(lt.getVolume());

        Drink t = new Tea("Black Tea with Rum",lt);
        System.out.println(t);

//------------------------------------------------------------------------------------------------

        System.out.println();
        Liquid whiskey = new Liquid("Whiskey", 0.03, 40);
        Coffee coffee = new Coffee("Irish Coffee", whiskey);
        System.out.println("------COFFEE------");
        System.out.println(coffee.getAlcoholPercent());
        System.out.println(coffee.getVolume());
        System.out.println(coffee.isAlcoholic());

    }
}
