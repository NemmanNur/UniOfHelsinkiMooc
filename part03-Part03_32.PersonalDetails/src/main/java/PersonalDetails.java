
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum  = 0;
        int name = 0 ;
        int count = 0;
        String gang = "";
        while (true) {
            String age = scanner.nextLine();
            if (age.equals("")) {
                break;
            }   
            String[] oldest = age.split(",");
             sum = sum + Integer.valueOf(oldest[1]);
             count = count + 1;

            
        
           
            for (int x = 0 ; x<oldest.length;x++) {
                if (oldest[x].length() > name) {
                    name = oldest[x].length();
                    gang = oldest[x];
                }
            }
        }
        System.out.println(gang);
        System.out.println("Age average: " + (1.0 * sum / count));
    }
}
