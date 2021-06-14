package com.java.StringHandling;

import java.util.Arrays;

 public class LoopPractice {

 public void arrangeAsterisk() {

 for (int i = 1; i <= 4; i++) {

 int count = 1;
 for (int j = 1; j <= i; j++) {

 System.out.print("*" + "\t");
 	count++;
 }

 System.out.println("");
 }
 }

 public void fibonacci() {
 int n1 = 0;
 int n2 = 1;
 int n3;
 int count = 10;

 System.out.println(n1 + " ");
 for (int i = 2; i < count; i++) {
 n3 = n1 + n2;
 if (n3 % 2 == 0) {
 System.out.println("" + n3);
 }
 n1 = n2;
 n2 = n3;
 }
 }



 public void missingNumber() {

 int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
 int min = 1;
 int max = 10;

 if (array[min-1] != min) {
 System.out.println(min);
 } else if (array[array.length -1] != max) {
 System.out.println(max);
 } else {
 for (int i = 1; i < array.length; i++) {
 if (array[i] != array[i-1] + 1) {
 System.out.println(array[i]-1);
 }
 }
 }


 }

 public void secondMax() {
 int a[]= {1,66,33,92};
 int size= a.length;

 Arrays.sort(a);
 System.out.println(Arrays.toString(a));
 int max=a[size-2];

 System.out.println("Second max is => " + max);
 }


 public static void main(String[] args) {

 LoopPractice myLoop = new LoopPractice();

 /*myLoop.fibonacci();
 System.out.println("\n");
*/
/* myLoop.arrangeAsterisk();
 System.out.println("\n");*/

 myLoop.missingNumber();
 System.out.println("\n");

 myLoop.secondMax();
 System.out.println("\n");

 }
 }
