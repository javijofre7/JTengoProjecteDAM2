package dam2.jtengo.Practica.Model;

public class LineaTiquet {
public int CodiLinea;
public Tiquet tiquet;
public Article article;
public int unitats;
public double preuUnitat;



public LineaTiquet(int codiLinea, Tiquet tiquet, Article article, int unitats, double preuUnitat) {

	CodiLinea = codiLinea;
	this.tiquet = tiquet;
	this.article = article;
	this.unitats = unitats;
	this.preuUnitat = preuUnitat;
}

public int getCodiLinea() {
	return CodiLinea;
}

public void setCodiLinea(int codiLinea) {
	CodiLinea = codiLinea;
}

public Tiquet getTiquet() {
	return tiquet;
}

public void setTiquet(Tiquet tiquet) {
	this.tiquet = tiquet;
}

public Article getArticle() {
	return article;
}

public void setArticle(Article article) {
	this.article = article;
}

public int getUnitats() {
	return unitats;
}

public void setUnitats(int unitats) {
	this.unitats = unitats;
}

public double getPreuUnitat() {
	return preuUnitat;
}

public void setPreuUnitat(double preuUnitat) {
	this.preuUnitat = preuUnitat;
}

@Override
public String toString() {
	return "LineaTiquet [CodiLinea=" + CodiLinea + ", tiquet=" + tiquet + ", article=" + article + ", unitats="
			+ unitats + ", preuUnitat=" + preuUnitat + "]";
}
public void addLineaTiquet(LineaTiquet linea) {
	
}
public void modificarLineaTiquet(LineaTiquet linea) {
	
}
public void borrarLineaTiquet(int codiLinea) {
	
}
}
