package com.java.StringHandling;

public class StringHandling {
public static void main(String args[]){
	StringHandling sh=new StringHandling();
	sh.sum(10, 20);
	StringHandling sh1=new StringHandling();
	sh1.sum(20, 30);
	sh.stringAnagram();
}
public int sum(int a,int b){
	int sum=a+b;
	return sum;
}
//0 1 1 2 3 5 8 13 ....

//1)nth even fabinacci series
//2) Find the missing number from 1 to 100
//3)
//*
//**
//***
//****
//4)int a[]={10,30,20,7,32,25}
//for(int i=0;i<a.length;i++)
//{ sop(a[i]}
//}


//sum1=sum of the number including the missing one 1 to 100
//sum2=n(n+1)/2 from 1 to 100 
//missingNumber=sum2-sum1;

public void stringAnagram(){
	String str1="HappyBirthday";
	String str2="ppaHyirBaydht";
	sort(str2);

}
public String sort(String s){
	String revStr="";
	char temp;
	for (int i = 0; i < s.length(); i++) {
		for (int j = 1; j < s.length(); j++) {
			if (Character.compare(s.charAt(i), s.charAt(j))>0) {
				temp=s.charAt(j);
			}
		}
	}
	return null;
	
}
public void fabinaciSeries(){
	int n1=0,n2=1,n3,count=10;
	System.out.println(n1 +" "+n2);
	for(int i=2;i<20;i++){
		n3=n1+n2;
		System.out.println(" "+n3);
		n1=n2;
		n2=n3;	
	}
}
}
