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


        //2. 배열의 첫번째 요소 삭제
        //3. 배열의 중간 요소 삭제
    }
}
