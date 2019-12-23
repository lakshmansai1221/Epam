import java.util.*;
import java.io.*;
class Third{
public static void main(String args[]){
Scanner  sc=new Scanner(System.in);
int arr[]=new int[100];
int i;
int l=0;
int c=0;
System.out.println("enter the size");
int n=sc.nextInt();
System.out.println("enter the array");
for( i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("enter the element");
int k=sc.nextInt();
for(i=0;i<n;i++){
if(arr[i]==k)
c++;
l=i;
}
if(c>0)
System.out.println("index is: "+l);
else
System.out.println("the out put is :  -1");
}
}
