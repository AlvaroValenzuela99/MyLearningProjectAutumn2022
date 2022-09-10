public class Main {
    public static void main(String[] args) {

        int [] numbers = {1, 3, 5, 7, 9};

        System.out.println(numbers[2]);

        String[] artists = {"Raphael", "da Vinci", "Picasso", "Meonet", "Hopper", "Munch"};
        boolean[] valid = {false, false, true, false, true, true};

        double[][] prices = {{11.11, 12.12, 13.13, 14.14},
                            {21.21, 22.22, 23.23, 24.24},
                            {31.31, 32.32, 33.33, 34.34}};

        System.out.println("The price of 2nd row 3rd column is " + prices[1][2]);

        for (int i = 0; i < artists.length; i++){
            for (int j = 0; j < prices[i].length; j++){
                System.out.print(prices[i][j] + " ");
            }
            System.out.println();
        }
    }
}
