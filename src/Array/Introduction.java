package Array;

public class Introduction {
    public static void main(String[] args) {
        //Array Capacity VS Length

        //1. Array Capacity
        // The number of DVDs the box could hold, if it was full.
        // The Array's capacity must be decided when the Array is created.
        // The capacity cannot be changed later.
        int[] arr = new int[6];
        int capacity = arr.length;
        System.out.println("The Array has a capacity of " + capacity);


        //2. Array Length
        // The number of DVDs currently in the box.
        // Create a new array with a capacity of 6.
        int[] array = new int[6];

        // Current length is 0, because it has 0 elements.
        int length = 0;

        // Add 3 items into it.
        for (int i = 0; i < 3; i++) {
            array[i] = i * i;
            // Each time we add an element, the length goes up by one.
            length++;
        }

        System.out.println("The Array has a capacity of " + array.length);
        System.out.println("The Array has a length of " + length);
    }
}
