package AVLarboles;
//Nodo binario para arboles AVL

public class NodoAVL<T extends Comparable<T>> {
	private T elem;
	private NodoAVL<T> izq,der,padre;
	/*
	 *  Int: Factor de equilibrio (fe) de un nodo 
	 *  altura max desede el hijo derecho - altura max desde el hijo izquierdo
	 */
	private int fe;
	
	
	//constructor
	public NodoAVL(T elem) {
		izq=null;
		der=null;
		padre=null;
		this.elem = elem;
		fe=0;
	}
	
	
	//getters y setters
	public T getElem() {
		return elem;
	}
	public void setElem(T elem) {
		this.elem = elem;
	}
	public NodoAVL<T> getIzq() {
		return izq;
	}
	public void setIzq(NodoAVL<T> izq) {
		this.izq = izq;
	}
	public NodoAVL<T> getDer() {
		return der;
	}
	public void setDer(NodoAVL<T> der) {
		this.der = der;
	}
	public NodoAVL<T> getPadre() {
		return padre;
	}
	public void setPadre(NodoAVL<T> padre) {
		this.padre = padre;
	}
	
	public int getFe() {
		return fe;
	}
	public void setFe(int fe) {
		this.fe = fe;
	}
	
	public int numDecendientes() {
		int cont=0;
		if(izq!=null)
			cont=izq.numDecendientes()+1;
		if(der!=null)
			cont+=izq.numDecendientes()+1;// cont=cont+izq.numDecendientes()+1;
		return cont;
	}
	
	//método aux para ABB
	public void cuelga(NodoAVL<T> hijo) {
		if(hijo==null)
			return;
		if(hijo.getElem().compareTo(elem)<=0)
			izq=hijo;
		else
			der=hijo;
	}
	

	

}
