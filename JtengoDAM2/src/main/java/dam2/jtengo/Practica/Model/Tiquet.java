package dam2.jtengo.Practica.Model;

import java.util.ArrayList;

public class Tiquet {
public int idTiquet;
public ArrayList<LineaTiquet> liniesTiquet;
public double total;



public Tiquet(int idTiquet, ArrayList<LineaTiquet> liniesTiquet, double total) {
	
	this.idTiquet = idTiquet;
	this.liniesTiquet = liniesTiquet;
	this.total = total;
}

public int getIdTiquet() {
	return idTiquet;
}

public void setIdTiquet(int idTiquet) {
	this.idTiquet = idTiquet;
}

public ArrayList<LineaTiquet> getLiniesTiquet() {
	return liniesTiquet;
}

public void setLiniesTiquet(ArrayList<LineaTiquet> liniesTiquet) {
	this.liniesTiquet = liniesTiquet;
}

public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}

@Override
public String toString() {
	return "Tiquet [idTiquet=" + idTiquet + ", liniesTiquet=" + liniesTiquet + ", total=" + total + "]";
}
public void addTiquet(Tiquet tiquet) {
	
}
public void modificarTiquet(Tiquet tiquet) {
	
}
public void borrarTiquet(int id) {
	
}
}
