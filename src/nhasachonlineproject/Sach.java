package nhasachonlineproject;

import java.util.Scanner;

public class Sach {
	private int bookId;	//ID của sách
	private String bookName;	//Tên của sách
	private String author;	//Tác giả của sách
	private String publisher;	//Nhà xuất bản
	private String description;	//Mô tả sách
	private String price;	//Giá của sách
	private String page;	//Số trang của sách
	private static int numberOfBooks = 0; //Giá trị cập nhật cho ID sách
	
	
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

	//Nhập thông tin chung cho sách (sách bản giấy, sách bản file)
	public void setBookInfo() {
		Scanner input = new Scanner(System.in);
		boolean checkPrice = false;
		boolean checkPage = false;
		System.out.println("Enter name of book:");
		this.setBookName(input.nextLine());
		System.out.println("Enter author of book:");
		this.setAuthor(input.nextLine());
		System.out.println("Enter publisher of book:");
		this.setPublisher(input.nextLine());
		System.out.println("Enter description:");
		this.setDescription(input.nextLine());
		while (!checkPrice) {
			try {
				System.out.println("Enter price of book (0-99999999):");
				String priceBook = input.nextLine();
				double priceDouble = Double.parseDouble(priceBook);
				while (priceDouble < 0) {
					System.out.println("Please enter price of book again (0-99999999)!!!!");
					priceBook = input.nextLine();
					priceDouble = Double.parseDouble(priceBook);
				}
				if (priceDouble >= 0 && priceDouble <= 99999999) {
					this.setPrice(priceBook);
					checkPrice = true;
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Please enter price of book again (0-99999999)!!!!");
			}
		}
		while (!checkPage) {
			try {
				System.out.println("Enter page of book (0-99999999):");
				String pageBook = input.nextLine();
				int pageInt = Integer.parseInt(pageBook);
				while (pageInt < 0) {
					System.out.println("Please enter page of book again (0-99999999)!!!!");
					pageBook = input.nextLine();
					pageInt = Integer.parseInt(pageBook);
				}
				if (pageInt >= 0 && pageInt <= 99999999) {
					this.setPage(pageBook);
					checkPage = true;
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Please enter page of book again (0-99999999)!!!!");
			}
		}
	}

	@Override
	public String toString() {
		return "\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" + "\nID book:" + this.getBookId() + "\nThe name of book is:" + this.getBookName() + "\nThe author is:" + this.getAuthor() + "\nThe publisher is:" + this.getPublisher() + "\nThe description is:" + this.getDescription() + "\nPrice is:" + this.getPrice() + "\nNumber of pages:" + this.getPage() + "\n";
	}

}
