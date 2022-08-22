package com.federico.currencies;


import javax.swing.JOptionPane;

public class Launcher {

	public static void main(String[] args) {
		boolean endProgram = false;
		String[] possibleValues = { "Conversor de divisas", "Conversor de medidas"};
		
		while(endProgram != true) {
			String selectedValue = (String) JOptionPane.showInputDialog(null,

			        "Elige una opción", "Menu",

			        JOptionPane.INFORMATION_MESSAGE, null,

			        possibleValues, possibleValues[0]);
			
			
			if(selectedValue != null) {
				switch(selectedValue) {
				case "Conversor de divisas":
					new CurrencyConverterLauncher();
					break;
				case "Conversor de medidas":
					new MeasurementConverterLauncher();
					break;
				}
			}
			
			int exitProgram = JOptionPane.showConfirmDialog
					(null,"¿Desea salir del programa?","Salir del programa",
							JOptionPane.YES_NO_OPTION);
			
			if(exitProgram == JOptionPane.YES_OPTION) {
				endProgram = true;
				JOptionPane.showMessageDialog
				(null,"Programa terminado","Message",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	

}
