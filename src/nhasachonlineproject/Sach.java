package nhasachonlineproject;

import java.util.Scanner;

public class Sach {
	private int bookId;	//ID cá»§a sĂ¡ch
	private String bookName;	//TĂªn cá»§a sĂ¡ch
	private String author;	//TĂ¡c giáº£ cá»§a sĂ¡ch
	private String publisher;	//NhĂ  xuáº¥t báº£n
	private String description;	//MĂ´ táº£ sĂ¡ch
	private String price;	//GiĂ¡ cá»§a sĂ¡ch
	private String page;	//Sá»‘ trang cá»§a sĂ¡ch
	private static int numberOfBooks = 0; //GiĂ¡ trá»‹ cáº­p nháº­t cho ID sĂ¡ch
	
	
	public Sach() {
		this.bookId = ++numberOfBooks;//Cập nhật ID mỗi khi có sách mới
	}
	
	//Constructors
	public Sach(String bookName, String author, String publisher, String description, String price, String page) {
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.description = description;
		this.price = price;
		this.page = page;
	}


	//Getters and Setters
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}


	//Nháº­p thĂ´ng tin chung cho sĂ¡ch (sĂ¡ch báº£n giáº¥y, sĂ¡ch báº£n file)
	public void setBookInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name of book:");
		this.setBookName(input.nextLine());
		System.out.println("Enter author of book:");
		this.setAuthor(input.nextLine());
		System.out.println("Enter publisher of book:");
		this.setPublisher(input.nextLine());
		System.out.println("Enter description:");
		this.setDescription(input.nextLine());
		System.out.println("Enter price of book:");
		String priceOfBook = input.nextLine();
		while (!Methods.checkNum(priceOfBook)) {
			System.out.println("Please enter price again (number):");
			priceOfBook = input.nextLine();
		}
		this.setPrice(priceOfBook);
		System.out.println("Enter pages of book:");
		String pageOfBook = input.nextLine();
		while (!Methods.checkNum(pageOfBook)) {
			System.out.println("Please enter pages again (number):");
			pageOfBook = input.nextLine();
		}
		this.setPage(pageOfBook);
	}

	@Override
	public String toString() {
		return "\n$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "\nID book:" + this.getBookId() + "\nThe name of book is:" + this.getBookName() + "\nThe author is:" + this.getAuthor() + "\nThe publisher is:" + this.getPublisher() + "\nThe description is:" + this.getDescription() + "\nPrice is:" + this.getPrice() + "\nNumber of pages:" + this.getPage() + "\n";
	}
	
}
