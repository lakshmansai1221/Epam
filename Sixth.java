import java.util.*;
import java.io.*;
class Sixth{
public static void main(String args[]){
Scanner  sc=new Scanner(System.in);
int arr[]=new int[100];
int i,temp;
System.out.println("enter the size");
int n=sc.nextInt();
System.out.println("enter the array");
for( i=0;i<n;i++){
arr[i]=sc.nextInt();
}
for (i = 0; i <n; i++) 
        {
            for (int j = i + 1; j < n; j++) { 
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
System.out.println("sorted order is");
for(i=0;i<n;i++){
System.out.println(arr[i]);
}
}
}