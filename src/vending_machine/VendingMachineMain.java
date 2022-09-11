package vending_machine;

public class VendingMachineMain {
    public static void main(String[] args) {

        Beverage defaultBeverage = new Beverage();
        defaultBeverage.print();

        Beverage coffee = new Beverage("Coffee", true, false);
        coffee.print();

        Beverage drink = new Beverage("water");
        drink.print();

        Beverage evianSparkling = new Beverage("water", false, true);
        evianSparkling.print();

        Snack defaultSnack = new Snack();
        defaultSnack.print();

        Snack chocolateBar = new Snack("Twix", 300, 70);
        chocolateBar.print();
    }
}
