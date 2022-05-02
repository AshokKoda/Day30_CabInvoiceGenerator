package com.bridgelabz.cabinvoicegenerator;

public class Rides {

	private double distance;
	private int time;
	private String invoiceId;

	public Rides(double distance, int time, String invoiceId) {
		this.distance = distance;
		this.time = time;
		this.invoiceId = invoiceId;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
}
