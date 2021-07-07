import java.util.Arrays;

public class Shell {

    public static void sort(Comparable[] a){
        int h=1;
        while(h<a.length/2){
            h=h*2+1;
        }

        while(h>=1){

            for(int i=h;i<a.length;i++){
                for(int j = i;j>0;j-=h){
                    if(greater(a[j-h],a[j])){
                        exChange(a,j-h,j);
                    }else{
                        break;
                    }
                }
            }
            h/=2;
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

        Integer a[] = {1, 1,2,5,4,7,9,5,8};
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
