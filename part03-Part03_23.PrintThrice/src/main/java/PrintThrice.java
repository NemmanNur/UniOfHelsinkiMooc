
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String g = scanner.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.print(g);
        }

    }
}
