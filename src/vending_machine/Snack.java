package vending_machine;
public class Snack {
    String name;
    int caloriesPerHundredGrams;
    double weight;

    public Snack() {
        name = "snack";
        caloriesPerHundredGrams = 150;
        weight = 50;
    }

    public Snack(String name, int caloriesPerHundredGrams, double weight) {
        this.name = name;
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCaloriesPerHundredGrams() {
        return caloriesPerHundredGrams;
    }

    public void setCaloriesPerHundredGrams(int caloriesPerHundredGrams) {
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

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
