package com.federico.currencies;

public class Currency {
	private String name;
	private String code;
	private double valueInUSD;
	
	public Currency(String name, String code, double valueInUSD) {
		this.name = name;
		this.code = code;
		this.valueInUSD = valueInUSD;
	}
	
	public String getName() {
		return name;
	}
	public String getCode() {
		return code;
	}
	public double getValue() {
		return valueInUSD;
	}
	
	
}
