
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            String name = scan.nextLine();
            String[] first = name.split(" ");
            if (name.equals("")) {
                break;

            } int x = first.length; 
            System.out.println(first[x-1]);
        }
    }
}