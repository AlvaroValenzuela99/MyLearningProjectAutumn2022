public class Main {
    public static void main(String[] args) {

        int dayOfWeek = 3;

        switch (dayOfWeek){
            case 1:
                System.out.println("Its Monday!");
                break;
            case 2:
                System.out.println("Its Tuesday!");
                break;
            case 3:
                System.out.println("Its Wednesday!");
                break;
            case 4:
                System.out.println("Its Thursday!");
                break;
            case 5:
                System.out.println("Its Friday!");
                break;
            case 6:
                System.out.println("Its Saturday!");
                break;
            case 7:
                System.out.println("Its Sunday!");
                break;
            default:
                System.out.println("We have only 7 daus in a week");
        }
    }
}
