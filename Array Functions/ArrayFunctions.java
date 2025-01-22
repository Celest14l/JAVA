import java.util.ArrayList;
import java.util.Arrays;

class ArrayFunctions {
    // Method to display an array
    public void display(int[] array) {
        System.out.println("Array is: " + Arrays.toString(array));
    }

    // Method to display an ArrayList
    public void display(ArrayList<Integer> list) {
        System.out.println("ArrayList is: " + list);
    }

    // Method to separate odd and even numbers
    public void oddEven(int[] array) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int value : array) {
            if (value % 2 == 0) {
                even.add(value);
            } else {
                odd.add(value);
            }
        }

        System.out.println("Even numbers:");
        display(even);
        System.out.println("Odd numbers:");
        display(odd);
    }
}