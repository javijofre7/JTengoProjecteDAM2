package dam2.jtengo.Practica.Model;

public class Magatzem {
public int codi;
public String descripcio;
public String adresa;



public Magatzem(int codi, String descripcio, String adresa) {
	
	this.codi = codi;
	this.descripcio = descripcio;
	this.adresa = adresa;
}

public int getCodi() {
	return codi;
}

public void setCodi(int codi) {
	this.codi = codi;
}

public String getDescripcio() {
	return descripcio;
}

public void setDescripcio(String descripcio) {
	this.descripcio = descripcio;
}

public String getAdresa() {
	return adresa;
}

public void setAdresa(String adresa) {
	this.adresa = adresa;
}

@Override
public String toString() {
	return "Magatzem [codi=" + codi + ", descripcio=" + descripcio + ", adresa=" + adresa + "]";
}
public void addMagatzem(Magatzem magatzem) {
	
}
public void modificarMagatzem(Magatzem magatzem) {
	
}
public void borrarMagatzem(int id) {
	
}
}
