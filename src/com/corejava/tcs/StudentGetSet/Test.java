package com.corejava.tcs.StudentGetSet;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		StudentDetails s[] = new StudentDetails[n]; //will make s[2] = n[2]

		for(int i=0; i<n; i++){ //to create as many students as n[2].
			s[i] = new StudentDetails(); // creates new student details for s[0] and s[1]
			s[i].readStudent(); //calls readStudent Method.
		}

		System.out.println("Sorted according to Total Scores in all Courses! \n");
		StudentDetails.sort(s); //static function call

		//print the data
		for(int i =0; i<n; i++){
			s[i].printStudent();
		}
	}
}
