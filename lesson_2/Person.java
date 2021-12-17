public class Person {
	char sex = 'm';
	String name = "Person";
	double height = 1.8;
	double weight = 90;
	int age = 30;

	//идти, сидеть, бежать, говорить, учить Java

	public String walk() {
		return name + " is walking";
	}

	public String sit() {
		return name + " is sitting";
	}

	public String run() {
		return name + " is running";
	}

	public String speak() {
		return name + " is speaking";
	}

	public String learnJava() {
		return name + " is learning Java";
	}
}