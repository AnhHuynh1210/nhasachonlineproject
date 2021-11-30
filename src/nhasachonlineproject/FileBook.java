package nhasachonlineproject;

import java.util.Scanner;

import nhasachonlineproject.Methods;

public class FileBook extends Sach{
	private String fileType;//Có 2 loại file để chọn
	private String fileSize;//Dung lượng của file
	
	public FileBook() {
	}
	
	public FileBook(String fileType, String fileSize) {
		super();
		this.fileType = fileType;
		this.fileSize = fileSize;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	
	public void setFileBookInfo() {
		Scanner input = new Scanner(System.in);
		boolean checkDouble = false;
		System.out.println("Choose file type (0 or 1):");
		System.out.println("0.PDF");
		System.out.println("1.EPUB");
		String type = input.nextLine();
		while (!Methods.checkRangeInt(type, 0, 1)){
			System.out.println("Please choose file type again (0 or 1):");
			System.out.println("0.PDF");
			System.out.println("1.EPUB");
			type = input.nextLine();
		}
		int yourtype = Integer.parseInt(type);
		if (yourtype == 0) {
			this.setFileType("PDF");
		}
		else if (yourtype == 1) {
			this.setFileType("EPUB");
		}
		while (!checkDouble) {
			try {
				System.out.println("Enter file size (0-99999999):");
				String sizeFile = input.nextLine();
				double sizeDouble = Double.parseDouble(sizeFile);
				while (sizeDouble < 0) {
					System.out.println("Please enter file size again (0-99999999)!!!!");
					sizeFile = input.nextLine();
					sizeDouble = Double.parseDouble(sizeFile);
				}
				if (sizeDouble >= 0 && sizeDouble <= 99999999) {
					this.setFileSize(sizeFile);
					checkDouble = true;
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Please enter file size again (0-99999999)!!!!");
			}
		}
	}

}
