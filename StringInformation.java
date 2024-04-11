package com.chainsys.methods;

class info {
	String name;
	int ID;
	char bloodgroup;
	double cgpa;

	void display() {
		System.out.println("name:" + name);
		System.out.println("bloodgroup:" + bloodgroup);
		System.out.println("ID:" + ID);
		System.out.println("CGPA:" + cgpa);
	}
}

public class StringInformation {
	public static void main(String args[]) {
		info obj1 = new info();
		obj1.name = "Jhon";
		obj1.bloodgroup = 'b';
		obj1.ID = 12345;
		obj1.cgpa = 7.5;
		obj1.display();

	}

}

