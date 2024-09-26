package Array;

public class InsertArray {
    public static void main(String[] args) {
        //배열 삽입 유형

        //1. 배열의 마지막에 요소 삽입
        // Declare an integer array of 6 elements
        int[] intArray = new int[6];
        int length = 0;

        // Add 3 elements to the Array
        for (int i = 0; i < 3; i++) {
            intArray[length] = i;
            length++;
        }

        //Let's define a function, printArray, to help us visualise what's happening.
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }

        //Java fills unused int Array slots with 0s.

        // Insert a new element at the end of the Array. Again,
        // it's important to ensure that there is enough space
        // in the array for inserting a new element.
        intArray[length] = 10;
        length++;

        //2. 배열의 처음에 요소 삽입(time complexity: O(N))
        // each of the existing elements has to be shifted one step to the right.

        // First, we will have to create space for a new element.
        // We do that by shifting each element one index to the right.
        // This will firstly move the element at index 3, then 2, then 1, then finally 0.
        // We need to go backwards to avoid overwriting any elements.
        for (int i = 3; i >= 0; i--) {
            intArray[i + 1] = intArray[i];
        }

        // Now that we have created space for the new element,
        // we can insert it at the beginning.
        intArray[0] = 20;

        //3. 배열의 중간에 요소 삽입
        // we first need to shift all the elements from that index onwards one position to the right.

        // Say we want to insert the element at index 2.
        // First, we will have to create space for the new element.
        for (int i = 4; i >= 2; i--)
        {
            // Shift each element one position to the right.
            intArray[i + 1] = intArray[i];
        }

        // Now that we have created space for the new element,
        // we can insert it at the required index.
        intArray[2] = 30;
    }
}
