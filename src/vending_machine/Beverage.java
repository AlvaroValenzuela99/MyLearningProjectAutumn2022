package vending_machine;

public class Beverage {
    String name;
    boolean isHot;
    boolean isSparkling;

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
