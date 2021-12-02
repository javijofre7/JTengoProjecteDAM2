package dam2.jtengo.Practica.Model;

import java.util.ArrayList;

public class Factura extends Tiquet {
public Client client;

public Factura(int idTiquet, ArrayList<LineaTiquet> liniesTiquet, double total, Client client) {
	super(idTiquet, liniesTiquet, total);
	this.client = client;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
	
}

@Override
public String toString() {
	return super.toString()+"Factura [client=" + client + "]";
}
}
