package AVLarboles;
/*
 * @Majo Velazquez
 */
import intro.NodoAVL;

public class AAVL <T extends Comparable<T>>{
	private NodoAVL<T> raiz;
	int cont;
	/*
	 * Arbol Adelson-Velskli-Landis.
	 * 
	 * Objetivo: crear árboles binarios de busqueda que tengan altura O(log(n))
	 * Queremos un arbol frondoso.
	 * 
	 * Estrategia: acotar la diferencia entre alturas de hijo derecho e hijo izquierdo >=|1|
	 */
	
	public void inserta(T dato) {
		NodoAVL<T> nuevo= new NodoAVL(dato);
		NodoAVL<T> actual;
		NodoAVL<T> auxPapa;
		
		//arbol vacio
		if(raiz==null) {
			raiz=nuevo;
			return;
		}
		actual=raiz;
		auxPapa=raiz;
		while(actual!=null) {
			auxPapa=actual;
			if(dato.compareTo(actual.getElem())<=0)
				actual=actual.getIzq();
			else
				actual=actual.getDer();		
		}
		auxPapa.cuelga(nuevo);
	}
	
	public NodoAVL<T> busca(T dato){
		return busca(this.raiz,dato);
	}
	
	private NodoAVL<T> busca(NodoAVL<T> actual,T dato){
		if(actual==null)
			return null;
		if(actual.getElem().equals(dato))
			return actual;
		NodoAVL<T> res=busca(actual.getIzq(),dato);
		if(res==null)
			res=busca(actual.getDer(),dato);
		
		return res;
	}
	
	
	/*
	 * Rotaciones. 4 rotaciones
	 * 	izquierda- zquierda (Fe =0 o -1)
	 * 	derecha-derecha (Fe =-2)
	 * 	izquierda-derecha
	 * 	derecha-izquierda	
	 */
	
	private NodoAVL<T> rota(NodoAVL<T> alfa){
		NodoAVL<T> papa=alfa.getPadre();
		NodoAVL<T> a,b,c,d,beta,gamma; //mejor gastar memoria
		
		if(alfa.getFe()==-2) {
			beta=alfa.getIzq();
			if(beta.getFe())
		}
	}
	
	public void actualizaFe() {
		
	}
	

}
