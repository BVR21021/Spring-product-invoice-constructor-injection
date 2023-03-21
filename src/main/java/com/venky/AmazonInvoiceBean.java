package com.venky;

public class AmazonInvoiceBean {
	private int productId;
	private String ProductName;
	private int quantity;
	private double price;

	public AmazonInvoiceBean(int productId, String productName, int quantity, double price) {
		super();
		this.productId = productId;
		ProductName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public String toString() {
		return "AmazonInvoiceBean [productId=" + productId + ", ProductName=" + ProductName + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}

	double total = 0;
	double discount = 0;
	double InvioceTotal = 0;

	public void printCalculateTotal() {
		total = price * quantity;
		System.out.println("Total:" + total);
	}

	public void CalculateDiscount() {
		if (total < 2000) {
			discount = total * 10 / 100;

			System.out.println("Discount:" + discount);

		} else if (total >= 2000) {
			discount = total * 15 / 100;
			System.out.println("Discount:" + discount);

		} else if (total >= 5000) {
			discount = total * 25 / 100;

			System.out.println("Discount:" + discount);

		}

	}

	public void printCalculateInvoiceTotal() {
		InvioceTotal = total - discount;
		System.out.println("InvoiceTotal:" + InvioceTotal);
	}

}
