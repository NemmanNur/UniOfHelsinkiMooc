
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum, n = 0;
        String gang="";
        while (true) {
            String age = scanner.nextLine();

            if (age.equals("")) {
                break;
            }
            String[] oldest = age.split(",");

            sum = Integer.valueOf(oldest[1]);
            if (sum > n) {
                n = sum;
                gang = oldest[0];
            }

        }
        System.out.println(gang);

    }
}
