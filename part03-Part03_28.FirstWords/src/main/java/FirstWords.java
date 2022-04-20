
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String name = scan.nextLine();
            String[] first = name.split(" ");
            if (name.equals("")) {
                break;
 
            }System.out.println(first[0]);
        }
 

    }
}
