package _10_i;

import java.util.Scanner;

/**
 * @author ：Rwto
 * @date ：Created in 2021/7/6 15:55
 * @description：斐波那契数列
 */
public class Solution {
    public int fib(int n){
        if(n==1) return 1;
        if(n==0) return 0;

        return (fib(n-1)+fib(n-2))%1000000007;
    }

    public static void main(String[] args) {


        Scanner sca = new Scanner(System.in);
        while(true){

            int num = sca.nextInt();
            if(num<0)break;
            System.out.println(new Solution().fib(num));
        }
    }
}
