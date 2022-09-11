package vending_machine;

public class Beverage {
    String name;
    boolean isHot;
    boolean isSparkling;

    Beverage(){
        name = "beverage";
        isHot = false;
        isSparkling = false;
    }

    Beverage(String beverageName, boolean isBeverageHot, boolean isBeverageSparkling){
        name = beverageName;
        isHot = isBeverageHot;
        isSparkling = isBeverageSparkling;
    }

    Beverage(String beverageName){
        name = beverageName;
        isHot = false;
        isSparkling = false;
    }

    void print(){
        System.out.println("-------------------");
        System.out.println(name);
        if (isHot){
            System.out.println("CAUTION! The drink is hot");
        }
        if (isSparkling){
            System.out.println("Sparkling");
        }
        System.out.println("-------------------\n");
    }

}
