package vending_machine;

public class Beverage {
    String name;
    boolean isHot;
    boolean isSparkling;

    public Beverage(){
        name = "beverage";
        isHot = false;
        isSparkling = false;
    }

    public Beverage(String beverageName, boolean isBeverageHot, boolean isBeverageSparkling){
        name = beverageName;
        isHot = isBeverageHot;
        isSparkling = isBeverageSparkling;
    }

    Beverage(String beverageName){
        name = beverageName;
        isHot = false;
        isSparkling = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public boolean isSparkling() {
        return isSparkling;
    }

    public void setSparkling(boolean sparkling) {
        isSparkling = sparkling;
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
