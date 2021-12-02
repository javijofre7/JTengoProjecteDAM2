package dam2.jtengo.Practica.Model;

public class Roba extends Article{
public String marca;
public String talla;



public Roba(int iD_Article, String descripcio, double preuCompra, double preuVenda, String marca, String talla) {
	super(iD_Article, descripcio, preuCompra, preuVenda);
	this.marca = marca;
	this.talla = talla;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getTalla() {
	return talla;
}

public void setTalla(String talla) {
	this.talla = talla;
}

@Override
public String toString() {
	return super.toString()+"Roba [marca=" + marca + ", talla=" + talla + "]";
}
public void modificarRoba(Roba roba) {
	

}
public void addRoba(Roba roba) {
	


}
public void borrarRoba(int id) {

}
}
