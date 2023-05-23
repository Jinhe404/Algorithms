package Algorithms01;

public class Code04_RandToRand {
    // 介绍随机函数
    // 从1~5随机到1~7随机


    // 假定不能改
    public static int f1() {
        //Math.random()   [0 ~ 1)   [1~5]
        return  (int)(Math.random() * 5) + 1;
    }
    // 随机机制，只能用f1
    // 等概率返回0和1
    public static int f2() {
        int ans = 0;
        do {
            ans = f1();
        }while(ans ==  3);
        // 12的时候返回0，45的时候返回1
        return ans < 3 ? 0 : 1 ;
    }

    // 得到000 ~ 111做到等概率   该函数做到0~7等概率贩返回一个
    public static int f3() {
        return (f2() << 2) + (f2() << 1) + (f2() << 0);

    }

    // 要做到0~6等概率返回一个
    public static int f4() {
        int ans = 0;
        do {
            ans = f3();
        }while(ans == 7);
        return ans;
    }


    public static int g() {
        return f4() + 1;
    }




    public static void main(String[] args) {
        int testTimes = 10000000;
        int count = 0;
        for(int i = 0;i < testTimes ;i++) {
            if(f2() == 0) {
                count++;
            }
        }
        System.out.println((double) count / (double) testTimes);


        System.out.println("========================");

        int[] counts = new int[8];
        for(int i = 0; i <testTimes;i++) {
            int num = g();
            counts[num]++;
        }
        for(int i = 0;i < 8;i++) {
            System.out.println(i + "这个数，出现了" + counts[i] + "次");
        }

    }
}
