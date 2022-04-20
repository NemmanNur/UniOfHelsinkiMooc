
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            String input = scan.nextLine();
            String [] split = input.split(" ");
            if(input.equals("")){
                break;
            }
        
        for( int x = 0 ; x<split.length;x++){
            if(split[x].contains("av")){
                System.out.println(split[x]);
            }

        }
        }
    }

}
