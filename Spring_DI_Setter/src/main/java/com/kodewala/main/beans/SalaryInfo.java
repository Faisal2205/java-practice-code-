package com.kodewala.main.beans;

public class SalaryInfo {
	
	private double baseSal;
	private double totalSal;
	private double stock;
	
	public double getBaseSal() {
		return baseSal;
	}
	public void setBaseSal(double baseSal) {
		this.baseSal = baseSal;
	}
	public double getTotalSal() {
		return totalSal;
	}
	public void setTotalSal(double totalSal) {
		this.totalSal = totalSal;
	}
	public double getStock() {
		return stock;
	}
	public void setStock(double stock) {
		this.stock = stock;
	}
	
	public String toString()
	{
		return "baseSalary= "+baseSal +" totalSalary= "+totalSal+" stock= "+stock;
	}
	

}
