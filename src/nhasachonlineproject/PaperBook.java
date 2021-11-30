package nhasachonlineproject;

import java.util.Scanner;

public class PaperBook extends Sach {
	private String dimension;	//Kích thước sách bản giấy
	private String bookjacket;	//Loại bìa của sách bản giấy
	private String quantity;	//Số lượng kho của sách bản giấy
	
	public PaperBook() {
	}
	
	//Constructors
	public PaperBook(String dimension, String bookjacket, String quantity) {
		super();
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
		super.setBookInfo();
		boolean checkDimension = false; 
		boolean checkQuantity = false;
		while (!checkDimension) {
			try {
				System.out.println("Enter dimension book (0-99999999):");
				String dimensionBook = input.nextLine();
				double dimensionDouble = Double.parseDouble(dimensionBook);
				while (dimensionDouble < 0) {
					System.out.println("Please enter dimension book again (0-99999999)!!!!");
					dimensionBook = input.nextLine();
					dimensionDouble = Double.parseDouble(dimensionBook);
				}
				if (dimensionDouble >= 0 && dimensionDouble <= 99999999) {
					this.setDimension(dimensionBook);
					checkDimension = true;
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Please enter dimension book again (0-99999999)!!!!");
			}
		}
		System.out.println("Enter bookjacket of book:");
		this.setBookjacket(input.nextLine());
		while (!checkQuantity) {
			try {
				System.out.println("Enter quantity of book (0-99999999):");
				String quantityBook = input.nextLine();
				int quantityInt = Integer.parseInt(quantityBook);
				while (quantityInt < 0) {
					System.out.println("Please enter quantity of book again (0-99999999)!!!!");
					quantityBook = input.nextLine();
					quantityInt = Integer.parseInt(quantityBook);
				}
				if (quantityInt >= 0 && quantityInt <= 99999999) {
					this.setQuantity(quantityBook);
					checkQuantity = true;
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Please enter quantity of book again (0-99999999)!!!!");
			}
		}
	}

	@Override
	public String toString() {
		return super.toString() + "Dimention book is:" + this.getDimension() + "\nBook jacket is:" + this.getBookjacket() + "\nBook quantity is:" + this.getQuantity() + "\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n";
	}
	
}
