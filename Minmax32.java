import java.util.*;
import java.io.*;
class Minmax32{
public static void main(String args[]){
Scanner  sc=new Scanner(System.in);
int arr[]={1,2,3,4,5};
int max=arr[0];
int min=arr[0];
int i;
for(i=0;i<arr.length;i++){
if(arr[i]>max)
max=arr[i];
else if(arr[i]<min)
min=arr[i];
}
System.out.println("max: "+max+  "min: "+min);
}
}