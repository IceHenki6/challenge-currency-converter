package com.federico.currencies;

import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CurrencyConverterLauncher {
	public CurrencyConverterLauncher(){
		//create currencies
		CurrencyTemplate argPeso = new CurrencyTemplate("ARS",0.0073912009);
		new Currencies().addCurrencies(argPeso.getCode(), argPeso);
		
		CurrencyTemplate usDollar = new CurrencyTemplate("USD", 1);
		new Currencies().addCurrencies(usDollar.getCode(), usDollar);
		
		CurrencyTemplate euro = new CurrencyTemplate("EUR", 1.01768);
		new Currencies().addCurrencies(euro.getCode(), euro);
		
		CurrencyTemplate brReal = new CurrencyTemplate("BRL", 0.19434152);
		new Currencies().addCurrencies(brReal.getCode(), brReal);
		
		CurrencyTemplate britishPound = new CurrencyTemplate("GBP",1.2096954);
		new Currencies().addCurrencies(britishPound.getCode(), britishPound);
		//end create currencies
		
		//create array of currency codes
		HashMap<String, CurrencyTemplate> currencies = new Currencies().getCurrencies();
		String[] codeList = makeCodeList(currencies);
		
		
		boolean endProgram = false;
		
		while(endProgram != true) {
			String strAmount = JOptionPane.showInputDialog
					("Introduce la cantidad de dinero que deseas convertir");
			
			
			try {
				double amount = Double.parseDouble(strAmount);
				SelectCurrencies currencySelector = new SelectCurrencies(codeList);
				String selectFromCurrency = currencySelector.getFromCurrency();
				String selectToCurrency = currencySelector.getToCurrency();
				
				CurrencyTemplate fromCurrency = currencies.get(selectFromCurrency);
				CurrencyTemplate toCurrency = currencies.get(selectToCurrency);
				
				CurrencyConverter converter = new CurrencyConverter();
				double result = converter.converter(amount, fromCurrency, toCurrency);
				
				JOptionPane.showMessageDialog
					(null,
							"El resultado de la conversión es: "+
							toCurrency.getSymbol() + " " + result + " " + toCurrency.getName(),"Resultado",
							JOptionPane.INFORMATION_MESSAGE);
				
				int continueProgram = JOptionPane.showConfirmDialog
						(null,"¿Desea realizar otra conversión?","Continuar",
								JOptionPane.YES_NO_OPTION);
				
				if(continueProgram == JOptionPane.NO_OPTION) {
					endProgram = true;
				}
				

			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog
					(null,"Se ha introducido un valor inválido","Error", JOptionPane.ERROR_MESSAGE, null);
				ex.printStackTrace();
			}catch(NullPointerException ex) {
				endProgram = true;
			}
			
		}

	}
	
	public String[] makeCodeList(HashMap<String, CurrencyTemplate> currencies) {
		ArrayList<String> codes = new ArrayList<String>();
		String[] codesList = new String[codes.size()];
		for(String i: currencies.keySet()) {
			codes.add(i);
		}
		
		return codes.toArray(codesList);
	}
}