package com.federico.currencies;

public class TestCurrencyConverter {
	public static void main(String[] args) {	
		//The base currency is the US Dollar
		//The exchange rates are from 16/08/22 - 22:16 GMT
		
		Currency argPeso = new Currency("Argentinenan Peso", "ARS",0.0073912009);
		Currency usDollar = new Currency("US Dollar", "USD", 1);
		Currency euro = new Currency("Euro", "EUR", 1.01768);
		Currency brReal = new Currency("Brazilean Real", "BRL", 0.19434152);
		Currency britishPound = new Currency("British Pound", "GBP",1.2096954);
		
		
		CurrencyConverter converter = new CurrencyConverter();
		
		
		
		System.out.println("1 ARS to USD: " + 
				converter.converter(1, argPeso, usDollar));
		
		System.out.println("200 EUR to USD: " + 
				converter.converter(200, euro, usDollar));
		
		System.out.println("200 BRL to USD: " + 
				converter.converter(200, brReal, usDollar));
		
		System.out.println("200 GBP to USD: " + 
				converter.converter(200, britishPound, usDollar));
	}
}
