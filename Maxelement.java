import java.util.*;
public class Maxelement
{
	public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++){
		    A[i]=input.nextInt();
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
		    if(A[i]>max){
		        max=A[i];
		    }
		}
		System.out.println(max);
		
	}
}
