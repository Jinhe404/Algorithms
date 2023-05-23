package Algorithms01;

public class Code03_InsertSort {

    // 选择函数

    // 交换函数
    public static void swap(int[] arr,int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    // 写法1
    public static void insertSort(int[] arr) {
        // 与其他算法一致需要处理特殊情况
        if(arr == null || arr.length < 2) {
            return;
        }
        // 0 ~ 0 完成
        // 0 ~ 1
        // 0 ~ 2
        // 0 ~ n-1
        int N = arr.length;
        for(int end = 1;end < N;end++) {
            int newNumIndex = end;
            while(newNumIndex - 1 >=0 && arr[newNumIndex - 1] > arr[newNumIndex]) {
                swap(arr,newNumIndex -1,newNumIndex);
                newNumIndex--;
            }
        }
    }

    // 写法2
    public static void insertSort2(int[] arr) {
        if(arr == null || arr.length <2) {
            return;
        }

        int N = arr.length;
        for(int end = 1;end < N;end++) {
            for(int pre = end -1;pre >=0 && arr[pre] > arr[pre+1];pre--) {
                swap(arr,pre,pre+1);
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
        int[] arr = {7,1,3,5,1,6,8,1,3,5,7,5,6};
        printArray(arr);
        insertSort(arr);
        insertSort2(arr);
        printArray(arr);
    }
}
