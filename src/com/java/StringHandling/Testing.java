package com.java.StringHandling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Testing {
public static void main(String args[]) {
Testing test=new Testing();
//test.fabinaciSeries(2);

int b[] =new int[100];
int sum1=0;
for(int i =0;i<100;i++)
{
	b[i]=i+1;
	sum1=sum1+b[i];
}
b[50]=0;

int sum2=0;
for(int j=0;j<b.length; j++)
{
sum2 = sum2+b[j];
}
int missingNo = sum1-sum2;
System.out.println("Missing Number is : "+ missingNo);

}



/*public static void countFrequency(){
	String s="xyzsdasasd";
	List<String> str=Arrays.asList(s);
	Set<String> duplicates = str.stream().filter(i->Collections.frequency(str, i)>1).collect(Collectors.toSet());
//	for (String string : duplicates) {
//		System.out.println(string);
//	} 
	duplicates.forEach(i->System.out.println(i));
}*/
public void fabinaciSeries(int n){
	int n1=0,n2=1,n3,count=10,counter = 0;
/*	System.out.println(n1 +" "+n2);*/
	for(int i=2;i<20;i++){
		n3=n1+n2;
		if(n3%2==0){
		counter++;
		}
		if(counter==n){
			System.out.println(" "+n3);
			break;
		}
		n1=n2;
		n2=n3;	
	}
}
public void displayMissing(){
	int arr[]={3,5,8,10}; //given array
    System.out.print("given array(already sorted): ");
    for (int j = 0; j < arr.length; j++)
           System.out.print(arr[j] +" "); // display it
    
    System.out.print("\nNumbers missing between 1 to 100 in array :  ");
    
    int j=0;
    for(int i=1;i<=10;i++){
           if(j<arr.length && i==arr[j])
                 j++;
           else
                 System.out.print(i+" ");
           
    }
    
}
}
