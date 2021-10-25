package zeeshan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.Stack;
public class Demo {

	
	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("enter the rows");
int n=scn.nextInt();
for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
		if(i==0||j==0||i==n-1&&j<=n/2||j==n/2&&i>=n/2||i==n/2&&j>=n/2||j==n-1&&i>=n/2){
		System.out.print("*");
	}
	else{
		System.out.print(" ");
	}
	}
	System.out.println();



	}
	
	
	
	
}
}


	
	
	
	
	
