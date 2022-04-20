
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int d = 0; d < array.length; d++) {
            for (int x = 0; x < array[d]; x++) {
                System.out.print("*");

            } System.out.println();
        }
    }
}
