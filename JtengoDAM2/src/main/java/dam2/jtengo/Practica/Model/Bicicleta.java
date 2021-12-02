package dam2.jtengo.Practica.Model;


import java.util.Scanner;

public class Bicicleta extends Article{
public String talla;
public float midaRoda;
public int numPinyons;
public String color;
public String model;



public Bicicleta(int iD_Article, String descripcio, double preuCompra, double preuVenda, String talla, float midaRoda,
	int numPinyons, String color, String model, Scanner lector) {
	super(iD_Article, descripcio, preuCompra, preuVenda);
	this.talla = talla;
	this.midaRoda = midaRoda;
	this.numPinyons = numPinyons;
	this.color = color;
	this.model = model;
	this.lector = lector;
	
}
Scanner lector= new Scanner(System.in);	
@Override
public String toString() {
	return super.toString()+"Bicicleta [talla=" + talla + ", midaRoda=" + midaRoda + ", numPinyons=" + numPinyons + ", color=" + color
			+ ", model=" + model + "]";
}

public String getTalla() {
	return talla;
}

public void setTalla(String talla) {
	this.talla = talla;
}

public float getMidaRoda() {
	return midaRoda;
}

public void setMidaRoda(float midaRoda) {
	this.midaRoda = midaRoda;
}

public int getNumPinyons() {
	return numPinyons;
}

public void setNumPinyons(int numPinyons) {
	this.numPinyons = numPinyons;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

}