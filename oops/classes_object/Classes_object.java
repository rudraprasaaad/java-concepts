package classes_object;

class Student {
	int rno;
	String name;
	float marks;

	Student() {
		this.rno = 12;
		this.name = "John Doe";
		this.marks = 45.0f;
	}

	Student(int rno, String name, float marks) {
		this.rno = rno;
		this.name = name;
		this.marks = marks;
	}
}

public class Classes_object {
	public static void main(String[] args) {
		Student rudra = new Student(12, "Rudraprasad Gouda", 89);
		Student john = new Student();

		System.out.println(john.rno);
		System.out.println(john.name);
		System.out.println(john.marks);

		System.out.println("Roll No: " + rudra.rno);
		System.out.println("Name: " + rudra.name);
		System.out.println("Marks " + rudra.marks);
	}
}