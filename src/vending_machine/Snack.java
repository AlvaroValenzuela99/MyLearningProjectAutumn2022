package vending_machine;

public class Snack {
    String name;
    int caloriesPerHundredGrams;
    double weight;

    void print(){
        System.out.println("-----------------");
        System.out.println(name);
        System.out.println(weight + " g");
        System.out.println(calculateCalories() + " calories");
        System.out.println("-----------------");
    }

    double calculateCalories(){
        return weight * caloriesPerHundredGrams / 100;
    }

}
