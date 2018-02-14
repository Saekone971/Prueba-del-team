package uf3_3tarea;

public class Temperatura {
	private double valorTemp;
	private char medida;
	public double getvalorTemp() {
		return valorTemp;
	}
	public void setValorTemp(double valorTemp) {
		this.valorTemp = valorTemp;
	}
	public char getMedida() {
		return medida;
	}
	public void setMedida(char medida) {
		this.medida = medida;
	}
	public double celsiusToFarenheit() {
		double f = 1.8* valorTemp + 32;
		return f;
	}
		
	public double farenheintToCelsius() {
		double c =(valorTemp = 32) / 1.8;
		return c;
	}
				
	}


