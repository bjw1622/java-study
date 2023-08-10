package prob02;

public class Book {
	private int bookNumber;
	private String title;
	private String author;
	private int isBorrowed = 1;

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int isBorrowed() {
		return isBorrowed;
	}

	public void setBorrowed(int isBorrowed) {
		this.isBorrowed = isBorrowed;
	}

	public Book(int bookNumber, String title, String author) {
		super();
		this.bookNumber = bookNumber;
		this.title = title;
		this.author = author;
	}

	public static void borrow(int num, Book[] books) {
		Book targetBook = books[num - 1];
		targetBook.setBorrowed(0);
		System.out.println(targetBook.getTitle() + "이(가) 대여 됐습니다.");

	}

}
