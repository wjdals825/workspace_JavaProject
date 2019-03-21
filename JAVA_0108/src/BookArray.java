import java.util.Scanner;
class Book{
	String title, author;
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
}
public class BookArray {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		Book [] book=new Book[2];
		
		for(int i=0; i<book.length; i++) {
			System.out.print("����>>");
			String title=scanner.nextLine();
			System.out.print("����>>");
			String author=scanner.nextLine();
			book[i]=new Book(title, author);
		}
		
		for(int i=0; i<book.length; i++)
			System.out.print("("+book[i].title + "," +book[i].author+")");
		}

	}
