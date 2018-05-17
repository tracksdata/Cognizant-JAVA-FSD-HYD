package com;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		
		//int x[5];
		//int x[]= {1,2,3,4,5};
		//int []x= {1,2,3,4,5};
		//int[] x= {1,2,3,4,5};
		
		//System.out.println("Size: "+x.length);
		
		
		//int x[]=new int[5];
		//int []x=new int[5];
		//int[] x=new int[5];
		
		//int[][] x=new int[2][2];
		//int x[][]=new int[2][2];
		 //int [][]x=new int[2][2];
		 
		//int x[][]= { {1,2},{3,4,76},{10,20,30}};
		
		//int[][] x=new int[2][3];
		
		//x[0][1]=100;
		
		//System.out.println(x[0][1]);
		/*System.out.println(x[0][0]);
		
		System.out.println(x[1][0]);
		System.out.println(x[1][1]);*/
		//System.out.println(x[1][2]);
		
		//int x[]= {10,20,30,40,50};
		//int x[][]= { {1,2,30},{3,4,76},{10,20,30}};
		/*int i=0;
		for(i=0;i<5;i++);
		//System.out.println(i);
		
		for(int j=0;j<i;j++) {
			System.out.println(x[j]);
		}*/
		
	/*	for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	*/	
		
		
		//int x[][]= { {10,20,30},{40,50,60}};
		
		
		
		/*for(int rows=0;rows<x.length;rows++) {
			for(int col=0;col<3;col++) {
				System.out.print("X["+rows+"]["+col+"] ="+x[rows][col]+" ");
				
			}
			System.out.println();
		}*/
		
		//int x[]= {10,20,30,40,50};
		/*for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}*/
		
		// for each loop -> must be used to iterate only arrays
		/*for(int num:x) {
			System.out.println(num);
		}*/
		
		//int x[][]= { {10,20,30},{40,50,60}};
		int x[][]=new int[3][3];
		
		for(int rows[]:x) {
			for(int col:rows) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
	}

}
