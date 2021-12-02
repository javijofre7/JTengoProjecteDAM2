package dam2.jtengo.Practica.Model;

import java.util.Scanner;

public class BTT extends Bicicleta{
public String TipusSupensio;
public int numPlats;


public BTT(int iD_Article, String descripcio, double preuCompra, double preuVenda, String talla, float midaRoda,
		int numPinyons, String color, String model, Scanner lector, String tipusSupensio, int numPlats) {
	super(iD_Article, descripcio, preuCompra, preuVenda, talla, midaRoda, numPinyons, color, model, lector);
	TipusSupensio = tipusSupensio;
	this.numPlats = numPlats;
}
public String getTipusSupensio() {
	return TipusSupensio;
}
public void setTipusSupensio(String tipusSupensio) {
	TipusSupensio = tipusSupensio;
}
public int getNumPlats() {
	return numPlats;
}
public void setNumPlats(int numPlats) {
	this.numPlats = numPlats;
}
@Override
public String toString() {
	return super.toString()+"BTT [TipusSupensio=" + TipusSupensio + ", numPlats=" + numPlats + "]";
}
public void addBTT(BTT btt) {
	
}
public void modificarBTT(BTT btt) {
	
}
public void borrarBTT(int id) {
	
}
}
