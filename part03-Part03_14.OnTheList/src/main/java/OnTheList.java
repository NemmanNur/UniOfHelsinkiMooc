
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(6);
        list.add (339);
       PrintinInRange(list,4 ,6);
                
        }
    
    public static void PrintinInRange(ArrayList<Integer>Numbers,int lowerLimit,
                                                                int upperLimit){
          for (int number:Numbers){
            if (number>=lowerLimit&&number<=upperLimit){
                System.out.println(number);
            }
              
            }
                
                
            
    }
    
}
