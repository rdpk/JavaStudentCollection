package com.corejava.tcs.Student;

import java.util.Comparator;

public class StudentScoreSort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		if(o1.getSno() > o2.getSno()){
			return 1;
		}else if(o1.getSno() < o2.getSno()){
			return -1;
		}else{
			return 0;		
		}
	}
}
