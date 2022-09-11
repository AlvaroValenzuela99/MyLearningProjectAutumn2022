package vending_machine;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachineMain {
    static final int MAX_BEVERAGES = 10;
    public static void main(String[] args) {

        ArrayList<Beverage> beverages = new ArrayList<>();
        ArrayList<Snack> snacks = new ArrayList<>();

        printAmountOfArrayListElements(beverages);

        for (int i = 0; i < MAX_BEVERAGES; i++) {
            Scanner scanner = new Scanner(System.in);
            String newName;
            boolean newIsHot, newIsSparkling;
            System.out.print("Please enter drink name: ");
            newName = scanner.nextLine();
            System.out.print("\nIs it hot?: ");
            newIsHot = scanner.nextBoolean();
            System.out.print("\nIs it sparkling?: ");
            newIsSparkling = scanner.nextBoolean();
            beverages.add(new Beverage(newName, newIsHot, newIsSparkling));
        }

        printAmountOfArrayListElements(beverages);

        for (Beverage beverage : beverages) {
            beverage.print();
        }


    }

    static void printAmountOfArrayListElements(ArrayList list){
        System.out.println("Number of elements in beverages array list: " + list.size());
    }
}
