package dam2.jtengo.Practica.Model;

public class Supervisor extends Venedor{
public Botiga botiga;
public int telefon;

public Supervisor(String dni, String nom, String congom1, String cognom2, Botiga botiga, int telefon) {
	super(dni, nom, congom1, cognom2);
	this.botiga = botiga;
	this.telefon = telefon;
}

public Botiga getBotiga() {
	return botiga;
}


public void setBotiga(Botiga botiga) {
	this.botiga = botiga;
	
}

public int getTelefon() {
	return telefon;
}

public void setTelefon(int telefon) {
	this.telefon = telefon;
	
}

@Override
public String toString() {
	return super.toString()+"Supervisor [botiga=" + botiga + ", telefon=" + telefon + "]";
}
public void addSupervisor(Supervisor supervisor) {
	
}
public void modificarSupervisor(Supervisor supervisor) {
	
	
}
public void borrarSupervisor(String DNI) {
	
}
}
