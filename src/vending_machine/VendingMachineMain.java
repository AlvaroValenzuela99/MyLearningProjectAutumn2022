package vending_machine;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachineMain {
    public static void main(String[] args) {

     ArrayList<Snack> snacks = new ArrayList<>();
     String name;
     int caloriesPerHundredGrams;
     double weight;
     int MAX_SNACKS = 5;
        for (int i = 0; i < MAX_SNACKS; i++) {
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter the name of the snack: ");
                name = scanner.nextLine();
                System.out.println("Please enter the calories per 100g of the snack: ");
                caloriesPerHundredGrams = scanner.nextInt();
                System.out.println("Please enter the weight of the snack: ");
                weight = scanner.nextDouble();
            }while(caloriesPerHundredGrams < 0 || weight <= 0);
            snacks.add(new Snack(name, caloriesPerHundredGrams, weight));
            System.out.println("Success...");

            // se pone la unidad que vamos a ir sacando (con el nombre que queramos a la unidad, en este caso s) : de donde lo sacamos iterando (el array completo)
            for (Snack s : snacks) {
                s.print();
            }
        }

    }
    static void printAmountOfArrayListElements(ArrayList list){
        System.out.println("Number of elements in beverages array list: " + list.size());
    }
}
