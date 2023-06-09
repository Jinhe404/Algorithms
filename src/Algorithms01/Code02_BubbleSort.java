package Algorithms01;

public class Code02_BubbleSort {
    // 交换函数
    public static void swap(int[] arr,int i,int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }


    public static void bubbleSort(int[] arr) {
        if(arr == null || arr.length <2) {
            return;
        }
        // 0 ~ n-1;
        // 0 ~ n-2;
        // 0 ~ n-3;
        // 0 ~ end;
        int N = arr.length;
        for(int end = N-1;end >=0;end--) {
            // 0 ~ end 之间干事情
            for(int second = 1;second <= end;second++) {
                // 如果后边的一个数大于前边的数交换
                if(arr[second - 1] > arr[second]) {
                    swap(arr,second - 1,second);
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for(int i =0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4,1,3,5,1,6,8,1,3,5,7,5,6};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);

    }
}
