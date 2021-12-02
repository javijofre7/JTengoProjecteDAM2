package dam2.jtengo.Practica.Model;

import java.util.Scanner;

public class PasseigE extends Passeig{
public int potenciaMotor;
public int pesBateria;
public int autonomia;

public PasseigE(int iD_Article, String descripcio, double preuCompra, double preuVenda, String talla, float midaRoda,
		int numPinyons, String color, String model, Scanner lector, int numPlats, int potenciaMotor, int pesBateria,
		int autonomia) {
	super(iD_Article, descripcio, preuCompra, preuVenda, talla, midaRoda, numPinyons, color, model, lector, numPlats);
	this.potenciaMotor = potenciaMotor;
	this.pesBateria = pesBateria;
	this.autonomia = autonomia;
}
public int getPotenciaMotor() {
	return potenciaMotor;
}
public void setPotenciaMotor(int potenciaMotor) {
	this.potenciaMotor = potenciaMotor;
}
public int getPesBateria() {
	return pesBateria;
}
public void setPesBateria(int pesBateria) {
	this.pesBateria = pesBateria;
}
public int getAutonomia() {
	return autonomia;
}
public void setAutonomia(int autonomia) {
	this.autonomia = autonomia;
}
@Override
public String toString() {
	return super.toString()+ "PasseigE [potenciaMotor=" + potenciaMotor + ", pesBateria=" + pesBateria + ", autonomia=" + autonomia + "]";
}
public void addPasseigE(PasseigE passeig) {
	
}
public void modificarPasseigE(PasseigE passeig) {
	
}
public void borrarPasseigE(int id) {
	
}
}
