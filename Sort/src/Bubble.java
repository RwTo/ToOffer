import java.util.Arrays;

public class Bubble {

    public static void sort(Comparable[] a){
        for(int  i = 1 ;i<a.length-1;i++){//次数   6个数据，遍历5次 ，需要5次冒泡  N-1
            for(int j=0;j<a.length-i;j++){//数组遍历，N-1+N-2+...+2+1 =(n-1)n/2   n2-n   O(n2)
                //比较
                if(Greater(a[j],a[j+1])){
                    //交换
                    exchange(a,j,j+1);
                }
            }
        }

        /*for(int i = a.length-1;i>0;i--){
            for(int j = 0;j<i;j++){
                //比较
                if(Greater(a[j],a[j+1])){
                    //交换
                    exchange(a,j,j+1);
                }
            }
        }*/
    }

    //比较
    public static boolean Greater(Comparable a,Comparable b){

        return a.compareTo(b)>0;
    }

    //交换
    public static void exchange(Comparable[] a,int i,int j){
        Comparable temp;
        temp= a[i];
        a[i]= a[j];
        a[j]= temp;
    }






    public static void main(String[] args) {

        Integer a[] ={8,4,2,5,6,7};

        Bubble.sort(a);

        System.out.println(Arrays.toString(a));


    }
}
