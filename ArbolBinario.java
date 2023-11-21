public class ArbolBinario{
	// Nodo Raiz (elemento inicial del árbol)
	// Referencia a la raíz del arbol
	private Nodo raiz;

	public class Nodo {
		private Nodo izq;
		private Nodo der;
		private int elemento;

		// Nodo del árbol
		// Elemento que guarda
		// Dos referencias a un hijo izq y der (Referencias a nodos)
		public Nodo(int elemento){
			this.elemento = elemento;
			this.izq = this.der = null;
		}
		public String toString(){
			return " " + this.elemento; 
		}
	}

	public Nodo insertar(int elemento){
		return this.insertar(elemento, this.raiz);
	}

	private Nodo insertar(int elemento, Nodo nodo){

		Nodo nodoNuevo = nodo;
		if(nodo  == null){
			// Si el nodo es nulo
			// Caso trivial, ya que el nodo es una hoja
			nodoNuevo = new Nodo(elemento);
			if(raiz == null){
				raiz = nodoNuevo;
			}
		}
		else{
			// Caso recursivo (nodo intermedio o la raiz)
			// Nos movemos a la izq o derecha hasta llegar a la hoja
			if(nodo.elemento >= elemento){
				nodo.izq = insertar(elemento,nodo.izq);
			}
			else{
				nodo.der = insertar(elemento, nodo.der);
			}
		}
		return nodoNuevo;
	}

	public Nodo buscar(int elemento){
		return buscar(elemento, this.raiz);
	}

	private Nodo buscar(int elemento, Nodo nodo){
		Nodo retorno = null;
		if(nodo != null){
			if(elemento == nodo.elemento){
				retorno = nodo;
			}
			else if(nodo.elemento > elemento){
				retorno = buscar(elemento, nodo.izq);
			}
			else{
				retorno = buscar(elemento, nodo.der);
			}
		}
		return retorno;
	}

	public void borrar(int elemento){
		borrar(elemento, this.raiz);
	}

	private Nodo borrar(int elemento, Nodo nodo){
		Nodo retorno = null;
		if(nodo != null){
			if(nodo.elemento > elemento){ // Mover hacia la izquierda
				nodo.izq = borrar(elemento, nodo.izq);
			}
			else if (nodo.elemento < elemento){ // Mover a la derecha
				nodo.der = borrar(elemento, nodo.der);
			}
			else{ // Encontramos el nodo a borrar :)
				if(nodo.izq == null){
					nodo = nodo.der;
				}
				else if(nodo.der == null){
					nodo = nodo.izq;
				}
				else{
					nodo.elemento = buscarValorMenor(nodo.der);
					nodo.der = borrar(nodo.elemento, nodo.der);
					retorno = nodo;
				}
			}
		}
		return retorno;
	}

	public int getLength(){
		return getLength(this.raiz, 0);
	}

	private int getLength(Nodo nodo, int contador){
		if(nodo != null){
			contador = getLength(nodo.izq, contador);
			System.out.println(nodo);
			System.out.println("Contador:" + (contador+1));
			contador = getLength(nodo.der, contador + 1);
		}
		return contador;
	}

	public int getProfundidad(){
		return getProfundidad(raiz);
	}
	private int getProfundidad(Nodo nodo){
		int profundidadIzq = 0;
		int profundidadDer = 0;
		if(nodo != null){
			if(nodo.izq != null){
				profundidadIzq = getProfundidad(nodo.izq);
			}
			if(nodo.der != null){
				profundidadDer = getProfundidad(nodo.der);
			}
		}
		return (profundidadIzq > profundidadDer ? profundidadIzq : profundidadDer) + 1;
	}

	public int buscarValorMenor(Nodo nodo){
		int menor = nodo.elemento;
		while(nodo.izq != null){
			menor = nodo.izq.elemento;
			nodo = nodo.izq;
		}
		return menor;
	}

	// Tres formas de imprimir
	// Preorden: raiz / subarbol izq, subabol der
	// Inorden: izquierdo, raiz, derecho 
	// Postorden: izquierdo, derecho raiz
	private void imprimir(Nodo nodo){
		if(nodo != null){
			imprimir(nodo.izq);
			imprimir(nodo.der);
			System.out.println(nodo);
		}
	}



	public void imprimir(){
		System.out.println("- - Impresion del arbol - -");
		imprimir(raiz);
	}



	public static void main (String [] args){
		ArbolBinario ab = new ArbolBinario();
		ab.insertar(25);
		ab.insertar(18);
		ab.insertar(23);
		ab.insertar(15);
		ab.insertar(22);
		ab.insertar(70);
		ab.insertar(50);
		ab.insertar(85);
		ab.insertar(6);
		ab.insertar(8);

		ab.imprimir();

		//ab.borrar(85);

		ab.imprimir();

		System.out.println("Length: " + ab.getLength());
		System.out.println("Profundidad: " + ab.getProfundidad());
	}	

}