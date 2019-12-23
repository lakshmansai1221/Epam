import java.util.*;
import java.io.*;
class Fourth{
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
for( i=0;i<n;i++){
System.out.println("charecter is: "+(char)arr[i]);
}
}
}