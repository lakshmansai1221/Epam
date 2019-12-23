import java.util.*;
import java.io.*;
class Sum31{
public static void main(String args[]){
Scanner  sc=new Scanner(System.in);
int arr[]={1,2,3,4,5};
int sum=0;
int avg=0;
int i;
for(i=0;i<arr.length;i++){
sum=sum+arr[i];
}
avg=(sum/arr.length);
System.out.println("sum:"+sum+"average:"+avg);
}
}


