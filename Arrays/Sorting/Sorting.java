import java.util.*;
public class Sorting{

 public static void main(String[] args){

     int [] numbers= {1,3,8,2,6,9,15,7,65,24,74,13};

     for(int i=0;i<numbers.length;i++){
         for(int j=i+1;j<numbers.length;j++){
             int a=numbers[i];
             int b=numbers[j];
             if(a>b){
                 numbers[i]=b;
                 numbers[j]=a;
             }
         }
     }
     System.out.println(Arrays.toString(numbers));
 }
}