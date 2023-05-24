package Algorithms01;

public class Code05_Comp {


    //对数器的使用

    // 交换函数
    public static void swap(int[] arr,int i ,int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    // 选择排序
    public static void selectionSort(int[] arr) {
        if(arr == null || arr.length < 2) {
            return;
        }

        for(int i = 0;i<arr.length -1;i++) {
            int minIndex = i ;
            for(int j = i + 1; j < arr.length ;j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    // 插入排序
    public static void insertionSort(int[] arr) {
        if(arr == null || arr.length < 2) {
            return;
        }

        for(int i = 1; i <arr.length;  i++) {

            for(int j = i - 1; j >=0 && arr[j] > arr[j + 1];j--) {
                swap(arr,j,j+1);
            }
        }
    }


    // 返回一个数组arr，arr的长度[0,maxLen-1],arr中的每个值[0,maxValue-1]
    public static int[] lenRandomValueRandom(int maxLen,int maxValue) {
        int len = (int)(Math.random() * maxLen);
        int[] ans = new int[len];
        for(int i = 0;i <len;i++) {
            ans[i] = (int)(Math.random() * maxValue);
        }
        return ans;
    }










    // 打印
    public static void printArray(int[] arr) {
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 拷贝函数
    public static int[] copyArray(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i = 0;i < arr.length;i++) {
            ans[i] = arr[i];
        }
        return ans;
    }

    // 验证两个数组是否相等   arr1和arr2一定是等长的
    public static boolean isSorted(int[] arr) {
        if(arr.length < 2) {
            return true;
        }
        int max = arr[0];
        for(int i = 0;i < arr.length; i++) {
            if(max > arr[i]) {
                return false;
            }
            max = Math.max(max,arr[i]);
        }
        return true;

    }

    public static void main(String[] args) {
        int maxLen = 50;
        int maxValue= 1000;
        int testTime= 10000;
        for(int i = 0;i < testTime;i++) {
            int[] arr1 = lenRandomValueRandom(maxLen,maxValue);
            int[] arr2 = copyArray(arr1);
            selectionSort(arr1);
            insertionSort(arr2);
            if(!isSorted(arr1)) {
                System.out.print("选择排序错了" );
            }
        }

    }

}
