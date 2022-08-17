package com.federico.currencies;

public class TestCurrencies {
	public static void main(String[] args) {
		Currencies currency = new Currencies();
		
		currency.showCurrencies();
		
		System.out.println(currency.convertCurrencies(200, "ARS", "GBP"));
	}
}
