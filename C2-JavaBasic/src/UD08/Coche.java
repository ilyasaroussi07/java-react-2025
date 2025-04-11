package UD08;

public class Coche { //Fabrica de tipo Coche
	
	//Atributos
	private String marca;
	private String modelo;
	private String color;
//	private double velocidadMaxima;
//	private int numeroPuertas;
	
	//Constructores
	public Coche() { //Constructor por defecto
		this.marca = "sin marca";
		this.modelo = "sin modelo";
		this.color = "sin color";
	}
	
	public Coche(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	//Métodos Setters y Getters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
//	public double getVelocidadMaxima() {
//		return velocidadMaxima;
//	}
//
//	public void setVelocidadMaxima(double velocidadMaxima) {
//		this.velocidadMaxima = velocidadMaxima;
//	}
//
//	public int getNumeroPuertas() {
//		return numeroPuertas;
//	}
//
//	public void setNumeroPuertas(int numeroPuertas) {
//		this.numeroPuertas = numeroPuertas;
//	}
	
//	Métodos de comportamiento
	

	public String acelerar() {
		return "El coche " + marca + " " + modelo + " está acelerando.";
	}
	
	public String frenar() {
		return "El coche " + marca + " " + modelo + " está frenando.";
	}
	

}
