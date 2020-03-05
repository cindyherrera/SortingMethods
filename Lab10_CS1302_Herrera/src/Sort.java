import java.util.*;

//Herrera, Cindy
//CS1302 Lab10 
//Thurs 5:00 pm

public class Sort {

	public static void main(String[] args) {
		
		
		//SelectionSort a1 = new SelectionSort();
		int[] arr1 = {45,34,11,63,99,54};
		System.out.println("List before selection sort:");
		for(int i:arr1) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		
		System.out.println("List after selection sort:");
		
		int[] arr2= selectionSort(arr1);
		for(int i: arr2) {
			System.out.print(i);
			System.out.print(" ");
			
		
		}
		System.out.println();
		System.out.println();
		int[] arr3 = {14,64,23,12,21,68};
		System.out.println("List before bubble sort:");
		for(int i: arr3) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("List after bubble sort: ");
		
		
		int[] arr4= bubbleSort(arr3);
		
		for(int i: arr4) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		int[] arr5= {13,64,2,45,33,66,78};
		System.out.println();
		System.out.println();
		System.out.println("List before insertion sort: ");
		for(int i: arr5) {
			System.out.print(i);
			System.out.print(" ");
		}
		int[] arr6= insertionSort(arr5);
		System.out.println();
		System.out.println("List after insertion sort: ");
		for(int i: arr6) {
			System.out.print(i);
			System.out.print(" ");
		}
		}
		
	

	public static int[] selectionSort(int[] a1) {
		for(int i=0; i < a1.length-1; i++) {
			int index = i;
			for(int j=i; j < a1.length; j++)
				if(a1[j]< a1[index])
					index=j;
			
			int minIndex = a1[index];
			a1[index] = a1[i];
			a1[i] = minIndex;
		}
			return a1;
	}
	
	public static int[] bubbleSort(int[] a2) {
		for(int i=0; i < a2.length; i++) {
			for(int j=0; j < a2.length; j++) {
				if(a2[i]> a2[j]) {
					int temp = a2[i];
					a2[i] = a2[j];
					a2[j] = temp;
				}
				
			}
		}
		return a2;
		
		
	}
	public static int[] insertionSort(int[] a3) {
		for(int i=1; i < a3. length; i++) {
			int temp = a3[i];
			int j = i-1;
			while(j>= 0 && temp <=a3[j]) {
				a3[j+1] = a3[j];
				j = j-1;
			}
			a3[j+1] = temp;
			}
		return a3;
			
		}
	}
		
		
	
	
	
		
	
			
		