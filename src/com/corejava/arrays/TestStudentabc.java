/*package com.corejava.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.corejava.tcs.Student.Student;

public class TestStudentabc {

	public static void main(String[] args) throws FileNotFoundException {

		File file=new File("C://Users//r_dpk//Desktop//student.txt");
		Scanner sc = new Scanner(file);
		
		int num_of_students =10;
		
		Student[] stuArray = new Student[num_of_students];
		Scanner lineScanner = null;
		int counter = 0;
		while(sc.hasNext()){
			lineScanner = new Scanner(sc.nextLine());
			int sid = lineScanner.nextInt();
			String sname = lineScanner.next();
			int score = lineScanner.nextInt();
			
			System.out.println("Student " + counter + " " + sid+ " "
	                + sname + " "  +score);
			
			stuArray[counter++]=new Student(sid, sname, score);
	        lineScanner.close();
	        
		}
		
		 for(int j = 0; j < counter; j++){  
		        System.out.println(stuArray[j]);
		    }
		 
		//sort based on score
		    Arrays.sort(stuArray,0,counter, new Comparator<Student>(){
		        @Override
		        public int compare(Student s1, Student s2) {
		            return Integer.valueOf(s1.getScore()).
		                               compareTo(Integer.valueOf(s2.getScore()));
		        }
		    });
		    System.out.println("Students sorted by score in ascending order");
		    for(int j = 0; j < counter; j++){  
		        System.out.println(stuArray[j]);
		    }
		    
		  //To compute the average:
		    double sum = 0.0;
		    for(int j = 0; j < counter; j++){  
		        sum+=stuArray[j].getScore();
		    }
		    double average = (sum*1.0)/counter;
		    System.out.println("Average Score = "+average );
		    sc.close();
		}
		 
	}

*/