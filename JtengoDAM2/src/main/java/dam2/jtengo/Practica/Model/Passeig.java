package dam2.jtengo.Practica.Model;

import java.util.Scanner;

public class Passeig extends Bicicleta{
public int numPlats;

public Passeig(int iD_Article, String descripcio, double preuCompra, double preuVenda, String talla, float midaRoda,
		int numPinyons, String color, String model, Scanner lector, int numPlats) {
	super(iD_Article, descripcio, preuCompra, preuVenda, talla, midaRoda, numPinyons, color, model, lector);
	this.numPlats = numPlats;
}
public int getNumPlats() {
	return numPlats;
}
public void setNumPlats(int numPlats) {
	this.numPlats = numPlats;
}
@Override
public String toString() {
	return super.toString()+ "Passeig [numPlats=" + numPlats + "]";
}
public void addPasseig(Passeig passeig) {
	
}
public void modificarPasseig(Passeig passeig) {
	
}
public void borrarPasseig(int id) {
	
}
}
