package Array;

public class ValidMountain {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        boolean answer = true;
        int max = arr[0];
        int idx = 0;

        for (int i = 1; i < arr.length; i++) {
            // 최대값 찾기.
            if(max < arr[i]){
                max = arr[i];
                idx = i;
            }
        }

        if(idx == 0 || idx == arr.length - 1) answer = false;

        //1. 증가 확인.
        for (int i = 0; i < idx-1; i++) {
            if(arr[i] >= arr[i+1]) answer = false;
        }

        //2. 감소 확인
        for (int i = idx; i < arr.length - 1; i++) {
            if(arr[i] <= arr[i+1]) answer = false;
        }

        System.out.println(answer);

    }
}
