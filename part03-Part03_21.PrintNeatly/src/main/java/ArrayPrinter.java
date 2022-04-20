
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }
    public static void printNeatly(int[] array) {

        int y = 0;
        int x = 0;
        while (y < array.length - 1) {
            y++;
            System.out.print(array[x]);
            x++;
            System.out.print(", " );
        }
        int g = array.length;
        System.out.print(array[g - 1]);

    }
}
