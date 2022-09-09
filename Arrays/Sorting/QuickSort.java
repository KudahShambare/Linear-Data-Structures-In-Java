import java.util.*;

public class QuickSort{

static	int  infinity= Integer.MAX_VALUE;

public static void main(String[] args){

	int [] toSort= {10,16,8,12,15,6,3,9,5,infinity};
	int firstValue=toSort[0];

int [] partiallySorted=	partitions(toSort);
int center=indexOf(partiallySorted,firstValue);


	quicksort(partiallySorted,center);

//	System.out.println(Arrays.toString(Arrays.copyOfRange(toSort,0,sorted)));
}
/*Recursive quicksort*/

public static int [] quicksort(int[] arr,int sorted){
//	//System.out.println(Arrays.toString(arr));
//	System.out.println(indexOf(arr,sorted)+" ieieieie");
int [] smallerArr=Arrays.copyOfRange(arr,0,sorted+1);
int [] largeArr= Arrays.copyOfRange(arr,sorted+1,arr.length);



int [] first=partitions(smallerArr);
int [] second= partitions(largeArr);

for(int i=0;i<first.length;i++){
	arr[i]=first[i];
}
int firstLength=first.length;
for(int j=0;j<second.length;j++){
	arr[j+firstLength]=second[j];
}


System.out.println(Arrays.toString(arr));
return arr;

}

/*Partioons*/

public static int []  partitions(int[] arr){
	//System.out.println(Arrays.toString(arr));
	int pivot= arr[0];
	int i=0;
	int j=arr.length-1;


while(i<j){
	do{
		i++;
	}while(arr[i]<pivot);
	do{
		j--;
	}while(arr[j]>pivot);

if(i<j){
	swap(arr,arr[i],arr[j]);
}else{
	swap(arr,arr[0],arr[j]);
		
}
}
		return arr;
}


/*Swap*/
public static int [] swap(int [] arr, int a, int b){

	int indexOfA=indexOf(arr,a);
	int indexOfB= indexOf(arr,b);

	int arr2 [] =arr;

	arr2[indexOfB]=a;
	arr2[indexOfA]=b;

	return arr2;
}
/*Search index*/
public static int indexOf(int [] arr, int num){
	int returnVal=infinity;
	for(int i=0;i<arr.length;i++){
		if(arr[i]==num){
			returnVal=i;
		}
	}
			return returnVal;
		
	
}

}

