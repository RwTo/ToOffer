import java.util.Arrays;

public class Insertion {

    public static void sort(Comparable[]a){
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0;j--){
                if(greater(a[j-1],a[j])){
                    exChange(a,j-1,j);
                }else{
                    break;
                }
            }
        }
    }
    public static boolean greater(Comparable a,Comparable b){
        return a.compareTo(b)>0;
    }
    public static void exChange(Comparable[] a,int i,int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }



    public static void main(String[] args) {
        Integer a[] = {5, 1,2,5,4,7,9,5,8};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
