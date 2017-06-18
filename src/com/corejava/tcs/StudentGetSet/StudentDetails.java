package com.corejava.tcs.StudentGetSet;


import java.util.Scanner;

public class StudentDetails {

	private int sid;
	private String sname;
	private int score[];

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}


	public StudentDetails(int sid, String sname, int[] score) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.score = score;
	}

	public StudentDetails() {
		super();
	}
	
	public void readStudent(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name of Student: ");
		sname = sc.nextLine();
		
		System.out.print("Enter the ID of Student: ");
		sid = sc.nextInt();
		
		score = new int[10]; //Since 5 courses are the requirement [0]-[5].
		System.out.print("Enter the scores: ");
		
		
		for(int i=0; i<5; i++){
			score[i] = sc.nextInt();
			score[5] += score[i];
		}
	}
	
	public static void sort(StudentDetails[] s){
		
		for(int i=0; i<s.length- 1; i++){
			for(int j= i+1; j<s.length; j++){
				if(s[j].score[5] > s[i].score[5]){
					StudentDetails temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
	}
	
	public void printStudent(){
		
		System.out.println("Student ID: " +sid);
		System.out.print(sname+ "\t");
		for(int i=0; i<6; i++){
			System.out.print(score[i]+"\t");
		}
		System.out.println("\n");
	}
	
}
