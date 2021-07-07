import java.util.Arrays;

public class Selection {

    public static void sort(Comparable[] a){
        for(int i = 0 ;i<a.length-1;i++){
            int min = i;
            for(int j = i+1 ; j<a.length;j++){
                if(greater(a[min],a[j])){
                    min = j;
                }
            }
            exchange(a,min,i);
        }
    }

    //比较
    public static boolean greater(Comparable a,Comparable b){

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

        Integer a[] = {2,1,3,4,5,2,4,5,7};

        Selection.sort(a);

        System.out.println(Arrays.toString(a));

    }
}
