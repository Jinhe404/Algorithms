package Algorithms01;

public class Code01_SelectSort {
    public static void selectSort(int[] arr) {
        //先想边界条件，判断
        if(arr == null || arr.length <2 ) {
            return ;
        }
        int N = arr.length;
        // 0~n-1
        // 1~n-1
        // 2~n-1
        for(int i =0;i<N;i++) {
            // 0~n-1
            // 1~n-1
            // 2~n-1
            // i~n-1
            int minValueIndex = i;
            for(int j = i+1;j < N;j++) {
                minValueIndex = arr[j] <arr[minValueIndex] ? j:minValueIndex;
            }
            swap(arr,i ,minValueIndex);
        }
    }
    // 交换方法
    public static void swap(int[] arr,int i,int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    public static void printArray(int[]  arr) {
        for(int i= 0;i <arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {7,1,3,5,1,6,8,1,3,5,7,5,6};
        printArray(arr);
        selectSort(arr);
        printArray(arr);

    }
}
