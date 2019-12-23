import java.util.*;
import java.io.*;
class Fifth{
public static void main(String args[]){
Scanner  sc=new Scanner(System.in);
int arr[]=new int[100];
int i;
System.out.println("enter the size");
int n=sc.nextInt();
System.out.println("enter the array");
for( i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int l1=arr[0];
int l2=arr[1];
int s1=arr[0];
int s2=arr[1];
for(i=0;i<n;i++){
if (arr[i] < s1) 
            { 
                s2 = s1; 
                s1 = arr[i]; 
            } 
else if(arr[i]>l1){
l2=l1;
l1=arr[i];
}
}
System.out.println("smallest numbers are"+s1+"\t" +s2);
System.out.println("largest numbers are"+l1+"\t" +l2);
}
}