package nhasachonlineproject;

import java.util.Scanner;

public class PaperBook extends Sach {
	private String dimension;	//Kích thước sách bản giấy
	private String bookjacket;	//Kích thước sách bản file
	private String quantity;	//Số lượng kho của sách bản giấy
	
	public PaperBook() {
	}
	
	//Constructors
	public PaperBook(String dimension, String bookjacket, String quantity) {
		this.dimension = dimension;
		this.bookjacket = bookjacket;
		this.quantity = quantity;
	}

	
	//Getters and Setters
	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getBookjacket() {
		return bookjacket;
	}

	public void setBookjacket(String bookjacket) {
		this.bookjacket = bookjacket;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	//Nhập thông tin riêng cho sách bản giấy
	public void setPaPerBookInfo() {
		Scanner input = new Scanner(System.in);
		this.setBookInfo();
		System.out.println("Enter dimension of paper book:");
		String dimensionBook = input.nextLine();
		while (!Methods.checkNum(dimensionBook)) {
			System.out.println("Please enter dimension book again (number):");
			dimension = input.nextLine();
		}
		this.setDimension(dimensionBook);
		System.out.println("Enter bookjacket of book:");
		this.setBookjacket(input.nextLine());
		System.out.println("Enter quantity of book:");
		String quantityBook = input.nextLine();
		while (!Methods.checkNum(quantityBook)) {
			System.out.println("Please enter quantity of book again (number):");
			quantityBook = input.nextLine();
		}
		this.setQuantity(quantityBook);
	}

	@Override
	public String toString() {
		return super.toString() + "Dimention book is:" + this.getDimension() + "\nBook jacket is:" + this.getBookjacket() + "\nBook quantity is:" + this.getQuantity() + "\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n";
	}
	
	
}
