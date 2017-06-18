package com.corejava.tcs.Student;


public class Student  implements Comparable<Student>{

	private int sno;
	private String sname;
	

	/*@Override
	public boolean equals(Object obj) {
		System.out.println(" Equals Method ***************");
		if(obj instanceof Student){
			Student stu = (Student) obj;
			if(this.sno == stu.getSno() && this.sname.equals(stu.getSname()))
				return true;
		}
		return false;
	}*/

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname +  "]";
	}

	

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits();
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		result = prime * result + sno;
		return result;
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(fee) != Double.doubleToLongBits(other.fee))
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		if (sno != other.sno)
			return false;
		return true;
	}

*/




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		result = prime * result + sno;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		if (sno != other.sno)
			return false;
		return true;
	}



	public Student() {

	}

	public Student(int sno, String sname) {

		this.sno = sno;
		this.sname = sname;
		
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	

	@Override
	public int compareTo(Student studentObj) { // default Sort Logic
		if(this.sno < studentObj.getSno()){
			return -1; // <
		}else if (this.sno > studentObj.getSno()){
			return 1; // >
		}else
			return  0; // ==
	}

}
