package org.college;

public class Hostel extends College {
	 public void HostelName() {
		 System.out.println("Hotal Name is : Sai pavan");
		 super.studentName();
		 this.collegeName();
		 
	}
	public static void main(String[] args) {
		Hostel l = new Hostel();
		l.HostelName();
	}
}
