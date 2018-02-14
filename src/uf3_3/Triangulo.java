package uf3_3;

public class Triangulo {

	private double lado1;
	private double lado2;
	private double lado3;
	private double perimetro;
	private double area;
	private String tipo;
	public double getLado1() {
		return this.lado1;
	}
	public void setLado1(double lado1) {
		this.lado1=lado1;

	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro() {
		this.perimetro = lado1+ lado2+lado3;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = (lado1 == lado2&& lado2 == lado3)? "equilatero" :
			((lado1==lado2 || lado2 == lado3 || lado3 == lado1)?"isosteles" : "Escaleno");
	}

}
