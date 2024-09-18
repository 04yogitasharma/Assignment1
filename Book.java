package assignment_1;

public class Book {
	
	private String title;
	private String author;
	private int price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

		public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

		public Book(String title) {
			super();
			this.title=title;
			author="default";
			price=0;
			}
		
		public Book(String title,String author) {
			super();
			this.title=title;
			this.author=author;
			price=0;
			}
		
		public Book(int price) {
			super();
			title="null";
			author="default";
			this.price=price;
			}

		
		public void display() {
			System.out.println("Title: "+title+
					           ", Author: "+author+
					           ", Price: "+price);
		}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book("Chemistry","RD Sharma",500);
		book1.display();
		Book book2=new Book("Physics","HC Verma");
		book2.display();
		Book book3=new Book(200);
		book3.display();
		}

}
