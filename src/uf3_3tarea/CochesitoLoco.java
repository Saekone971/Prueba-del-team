package uf3_3tarea;

public class CochesitoLoco {
	
	private int velocidad;
	
	public CochesitoLoco() {
		this.velocidad = 0;
		
		
	}
	public int getVelocidad() {
		return velocidad;
	
	}
	
	public void acelera() {
		this.velocidad += 200;
	
	}
	public void frena () {
		this.velocidad -= 200;
	}
	public void para () {
		this.velocidad = 0;
	}
	
}
