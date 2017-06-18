package com.corejava.tcs.Student;

import java.util.HashMap;
import java.util.Map;

public class TestStudent {

	public static void main(String[] args) throws Exception {
		
		Map<Student, Courses> map = new HashMap<Student, Courses>();//new Hashtable<Course, Student>();
	
		//map.put(new Student(101, "John"), new Courses({10, 20},{"Java", "hello"} ));
		
		/*map.put(new Courses({50,60},{ "Java", "hello"}, new Student(101, "John"));
		map.put(new Courses(60, "Science"), new Student(102, "Steve"));
		map.put(new Courses(80, "Computer arts"), new Student(103, "Deepak"));*/
		
		
		/*for(Courses key: map.keySet()){
			System.out.println(key + " " + map.get(key));
		}*/
	//	Student student = map.get(new Courses(50, "Java"));
		
	//	System.out.println(student);
		
		
		
		
		
		
		
		
		
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		List<Student> student = readFromCSV("C://Users//r_dpk//Desktop//student.txt");
		
		//print students
		
		for(Student s: student){
			System.out.println(s);
		
	}
	}
	//read file
	
		public static List<Student> readFromCSV(String fileName) throws IOException{
			
			List<Student> student = new ArrayList<>();
			Path pathToFile = Paths.get(fileName);
			
			//Creating instance of BufferedReader
			try(BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)){
				
				//Read first line from text file
				
				String line = br.readLine();
				
				//loop until all lines are read
				
				while(line != null){
					
					//use string.split to load a string array with
					//each line of the file, using a comma as delimiter
					
					String[] attributes = line.split(",");
					
					Student stu = createStudent(attributes);
					
					//add student into arraylist
					
					student.add(stu);
					
					//read next line before looping
					//if reaches end of the line: null
					
					line = br.readLine();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
			
			return student;
			
		}
		
		//creating student 
		public static Student createStudent(String[] metadata){
			
			int sid = Integer.parseInt(metadata[0]);
			String sname = metadata[1];
			String course = metadata[2];
			int score = Integer.parseInt(metadata[3]);
			
			//create and return student of this metadata
			return new Student(sid, sname, course, score);
			
		}
		
		
}		
		
		

		
		

		//List<Student> list = new ArrayList<Student>();
		
		//BufferedReader br = new BufferedReader(new FileReader(new File()));
		
		char default_seperator =',';
		char default_quote = '"';
		
		//Scanner sc = new Scanner(new File("C://Users//r_dpk//Desktop//student.txt"));
		
		while(sc.hasNext()){
			
			List<Student> list = parseLine(sc.nextLine());
		Student student = new Student(entries[0], entries[1], entries[2], entries[3]);
		student.add(student);
		
	


*/