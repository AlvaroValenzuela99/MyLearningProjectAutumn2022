public class Main {
    public static void main(String[] args) {

        String[] artists = {"Raphael", "da Vinci", "Picasso", "Meonet", "Hopper", "Munch"};
        int newNumber = 6;

        printMyName();

        newNumber += incrementOne();
        System.out.println(newNumber);

        for (String nameOfArtist : artists) {
            printAnyName(nameOfArtist);
        }

        System.out.println("The sum of two numbers is " + addNumbers(5, 9));
        System.out.println("The sum of two numbers is " + addNumbers(3));
        System.out.println("The sum of two numbers is " + addNumbers(11.34f, 23.45f));

    }

    static void printMyName(){
        System.out.println("----------------------");
        System.out.println("My name is Alvaro");
        System.out.println("----------------------");
    }

    static int incrementOne(){
        int number = 0;
        number++;
        System.out.println("Incrementing...");
        return number;
    }

    static void printAnyName(String name){
        System.out.println("-------------");
        System.out.println("My name is " + name);
        System.out.println("-------------");
    }

    static int addNumbers(int xInt, int yInt){
        return xInt + yInt;
    }

    static int addNumbers(int xInt){
        return xInt + 100;
    }

    static float addNumbers(float xFloat, float yFloat){
        return xFloat + yFloat;
    }
}
