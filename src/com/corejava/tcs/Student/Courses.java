package com.corejava.tcs.Student;

import java.util.Arrays;

public class Courses {

	private int score[];
	private String name[];
	
	public Courses(int[] score, String[] name) {
		super();
		this.score = score;
		this.name = name;
	}

	public int[] getScore() {
		return score;
	}


	public void setScore(int[] score) {
		this.score = score;
	}


	public String[] getName() {
		return name;
	}


	public void setName(String[] name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(name);
		result = prime * result + Arrays.hashCode(score);
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
		Courses other = (Courses) obj;
		if (!Arrays.equals(name, other.name))
			return false;
		if (!Arrays.equals(score, other.score))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Courses [score=" + score + ", name=" + name + "]";
	}


}



