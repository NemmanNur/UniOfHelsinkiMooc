
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum, n, name, count = 0;
        String gang = "";
        while (true) {
            String age = scanner.nextLine();
            if (age.equals("")) {
                break;
            }
            String[] oldest = age.split(",");
            name= oldest[0].length();

            sum =  + Integer.valueOf(oldest[1]);
            count = count + 1;
            System.out.println(sum/count);
            for (int x = 0; x < oldest.length; x++) {
                if (oldest[x].length() > name) {
                    name = oldest[x].length();
                    gang = oldest[x];
                } n = sum / count;
            }
        }
        System.out.println(gang);
       
    }
}
