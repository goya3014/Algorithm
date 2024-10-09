package Array;

public class DeleteArray {
    public static void main(String[] args) {
        //배열 삭제 유형

        //1. 배열의 마지막 요소 삭제(the least time consuming)

            // 1-1. length의 의미 다시 생각해보기.

            // Declare an integer array of 10 elements.
            int[] intArray = new int[10];

            // The array currently contains 0 elements
            int length = 0;

            // Add elements at the first 6 indexes of the Array.
            for(int i = 0; i < 6; i++) {
                intArray[length] = i;
                length++;
            }

            // 1-2. 배열의 마지막 요소 삭제
            // Deletion from the end is as simple as reducing the length
            // of the array by 1.
                length--;


        //2. 배열의 첫번째 요소 삭제(time complexity: O(N))
        // Starting at index 1, we shift each element one position
        // to the left.
                for (int i = 1; i < length; i++) {
                    // Shift each element one position to the left
                    intArray[i - 1] = intArray[i];
                }

        // Note that it's important to reduce the length of the array by 1.
        // Otherwise, we'll lose consistency of the size. This length
        // variable is the only thing controlling where new elements might
        // get added.
                length--;


        //3. 배열의 중간 요소 삭제(time complexity: O(N))
        // Say we want to delete the element at index 1
        for (int i = 2; i < length; i++) {
            // Shift each element one position to the left
            intArray[i - 1] = intArray[i];
        }

        // Again, the length needs to be consistent with the current
        // state of the array.
                length--;

    }
}
