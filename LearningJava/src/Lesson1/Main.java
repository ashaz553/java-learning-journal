package Lesson1;

public class Main {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "Java Fundamentals";
		book1.pages = 950;
		book1.isEbook = true;
		
		book1.displayDetails();
	}

}
