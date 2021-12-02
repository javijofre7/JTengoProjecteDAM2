package dam2.jtengo.Practica.Model;

import java.util.ArrayList;

public class Component extends Article {
public ArrayList<Bicicleta> llista;

public Component(int iD_Article, String descripcio, double preuCompra, double preuVenda, ArrayList<Bicicleta> llista) {
	super(iD_Article, descripcio, preuCompra, preuVenda);
	this.llista = llista;
}

public ArrayList<Bicicleta> getLlista() {
	return llista;
}

public void setLlista(ArrayList<Bicicleta> llista) {
	this.llista = llista;
}

@Override
public String toString() {
	return super.toString()+ "Component [llista=" + llista + "]";
}
}
