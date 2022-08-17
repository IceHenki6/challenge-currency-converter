package com.federico.currencies;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter {
	public double converter(float amount, Currency fromCurrency, Currency toCurrency) {
		double result = (amount * fromCurrency.getValue()) / toCurrency.getValue();
		return round(result,2);
	}

	private double round(double number, int decimalPlaces) {
		BigDecimal bd = BigDecimal.valueOf(number);
		bd = bd.setScale(decimalPlaces, RoundingMode.HALF_UP);
		
		return bd.doubleValue();
	}
}
