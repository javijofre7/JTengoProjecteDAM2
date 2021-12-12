package dam2.jtengo.Practica.Model;

import java.util.ArrayList;

public class Comanda {
public int NumComanda;
public Client client;
public double total;
public ArrayList<LineaComanda> liniesComanda;

public Comanda(int numComanda, Client client, double total, ArrayList<LineaComanda> liniesComanda) {
	NumComanda = numComanda;//??
	this.client = client;
	this.total = total;
	this.liniesComanda = liniesComanda; // Has de crear l'ArrayList
}

public int getNumComanda() {
	return NumComanda;
}

public void setNumComanda(int numComanda) {
	NumComanda = numComanda;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}

public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}

public ArrayList<LineaComanda> getLiniesComanda() {
	return liniesComanda;
}

public void setLiniesComanda(ArrayList<LineaComanda> liniesComanda) {
	this.liniesComanda = liniesComanda;	
}
//Falten mètodes per a l'Array

@Override
public String toString() {
	return "Comanda [NumComanda=" + NumComanda + ", client=" + client + ", total=" + total + ", liniesComanda="
			+ liniesComanda + "]"; //Fet automàtic sense comprovar.
}
public void addComanda(Comanda comanda) {
	
}
public void modificarComanda(Comanda comanda) {
	
}
public void borrarComanda(int id) {
	
}
}
