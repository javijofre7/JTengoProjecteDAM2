package dam2.jtengo.Practica.Model;

public class Client extends Persona{
public String adresa;
public String email;

public Client(String dni, String nom, String congom1, String cognom2, String adresa, String email) {
	super(dni, nom, congom1, cognom2);
	this.adresa = adresa;
	this.email = email;
}

public String getAdresa() {
	return adresa;
}

public void setAdresa(String adresa) {
	this.adresa = adresa;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return super.toString()+ "Client [adresa=" + adresa + ", email=" + email + "]";
}
public void addClient(Client client) {
	
}
public void modificarClient(Client client) {
	
}
public void borrarClient(String DNI) {
	
}
}
