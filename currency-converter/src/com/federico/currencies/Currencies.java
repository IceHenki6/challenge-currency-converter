package com.federico.currencies;

import java.util.HashMap;

public class Currencies {
	private static Currency argPeso = new Currency("Argentinenan Peso", "ARS",0.0073912009);
	private static Currency usDollar = new Currency("US Dollar", "USD", 1);
	private static Currency euro = new Currency("Euro", "EUR", 1.01768);
	private static Currency brReal = new Currency("Brazilean Real", "BRL", 0.19434152);
	private static Currency britishPound = new Currency("British Pound", "GBP",1.2096954);
	
	private HashMap<String, Double> currencies = new HashMap<String, Double>();
	
	public Currencies() {
		currencies.put(argPeso.getCode(), argPeso.getValue());
		currencies.put(usDollar.getCode(), usDollar.getValue());
		currencies.put(euro.getCode(), euro.getValue());
		currencies.put(brReal.getCode(), brReal.getValue());
		currencies.put(britishPound.getCode(), britishPound.getValue());
	}
	
	
	public void showCurrencies() {
		System.out.println(currencies);
	}
	
	public double convertCurrencies(float amount,String fromCurrency,String toCurrency) {
		
		double result = (amount * currencies.get(fromCurrency)) / currencies.get(toCurrency);
		return result;
	}
}
