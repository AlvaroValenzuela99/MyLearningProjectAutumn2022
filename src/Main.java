public class Main {
    public static void main(String[] args) {

        int [] numbers = {1, 3, 5, 7, 9};

        System.out.println(numbers[2]);

        String[] artists = {"Raphael", "da Vinci", "Picasso", "Meonet", "Hopper", "Munch"};
        boolean[] valid = {false, false, true, false, true, true};

        System.out.println("Length of artists array: " + artists.length);

        for (int i = 0; i < artists.length; i++){
            if (valid[i]){
                System.out.println(artists[i]);
            }
        }
    }
}
