public class Main {
    public static void main(String[] args) {

        int x = 4;
        int y = 5;

        int sum;

        sum = x + y;

        System.out.println(sum);
        System.out.println("Sum of " + x + " and " + y + " equals " + sum);

        if (sum == 9 || y == 5){
            System.out.println("Sum is 9");
        }
        else if (sum <= 8){
            System.out.println("Sum is less than or equal to 8");
        }
        else {
            System.out.println("We're not so good. :(");
        }

        System.out.println("The new value of the sum is " + sum);
    }
}
