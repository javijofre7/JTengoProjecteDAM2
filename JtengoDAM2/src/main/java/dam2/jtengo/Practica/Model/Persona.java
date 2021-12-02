package dam2.jtengo.Practica.Model;

public class Persona {
public String dni;
public String nom;
public String congom1;
public String cognom2;



public Persona(String dni, String nom, String congom1, String cognom2) {

	this.dni = dni;
	this.nom = nom;
	this.congom1 = congom1;
	this.cognom2 = cognom2;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getCongom1() {
	return congom1;
}

public void setCongom1(String congom1) {
	this.congom1 = congom1;
}

public String getCognom2() {
	return cognom2;
}

public void setCognom2(String cognom2) {
	this.cognom2 = cognom2;
}

@Override
public String toString() {
	return "Persona [dni=" + dni + ", nom=" + nom + ", congom1=" + congom1 + ", cognom2=" + cognom2 + "]";
}
}
