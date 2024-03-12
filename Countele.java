import java.util.*;
public class Countele
{
	public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
		int A[]=new int[n];
		System.out.println("Enter elements in the array");
		for(int i=0;i<n;i++){
		    A[i]=input.nextInt();
		}
		int temp=0;
		for(int i=0;i<n-1;i++){
		    for(int j=0;j<n-i-1;j++){
		        if(A[j]>A[j+1]){
		            temp=A[j];
		            A[j]=A[j+1];
		            A[j+1]=temp;
		        }
		    }
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<A.length;i++)
		{
			if(map.containsKey(A[i])){
				map.put(A[i],map.get(A[i])+1);
			}
			else{
				map.put(A[i],1);
			}
		}
		System.out.println("enter the element to be counted");
		int num_to_be_counted=input.nextInt();
		System.out.println(map.get(num_to_be_counted));
		
	}
}
