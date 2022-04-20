
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String gang = scanner.nextLine();
            String[] hang = gang.split(" ");
            if (gang.equals("")) {
               
                break;
            }
            for (String hang1 : hang) {
                System.out.println(hang1);
            }

        }
    }
}
