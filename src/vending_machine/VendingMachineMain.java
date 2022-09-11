package vending_machine;

import java.util.ArrayList;

public class VendingMachineMain {
    public static void main(String[] args) {

        ArrayList<Beverage> beverages = new ArrayList<>();

        System.out.println("Number of elements in beverages array list: " + beverages.size());
        Beverage beverage = new Beverage();
        beverages.add(beverage);
        System.out.println("Number of elements in beverages array list: " + beverages.size());
    }

    static void printAmountOfBeverages(){
        System.out.println("Number of elements in beverages array list: " + beverages.size());
    }
}
