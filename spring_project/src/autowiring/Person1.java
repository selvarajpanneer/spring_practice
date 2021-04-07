package autowiring;

public class Person1 {
	Person2 person2;

	public Person1() {//constructor
		System.out.println("person1 is created");
	}

	public Person2 getPerson2() {//getter
		return person2;
	}

	public void setPerson2(Person2 person2) {//setter
		this.person2 = person2;
	}

	void print() {//method1
		System.out.println("hello person1");
	}

	void display() {//method2
		print();
		person2.print();
	}
}
