package com.federico.currencies;

public class CurrencyConverter {
	public double converter(float amount, Currency fromCurrency, Currency toCurrency) {
		return ((amount * fromCurrency.getValue()) / toCurrency.getValue());
	}
}
