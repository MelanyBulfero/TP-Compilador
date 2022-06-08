package main.ast;


public class NodoComparacion extends NodoCondicion {
protected final NodoExpresion izquierda;
protected final NodoExpresion derecha;

    public NodoComparacion (String nombre, NodoExpresion izquierda, NodoExpresion derecha) {
        super(nombre);
        this.izquierda = izquierda;
        this.derecha = derecha;
    }
    
     @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        return super.graficar(idPadre) +
                izquierda.graficar(miId) +
                derecha.graficar(miId);
    }
    
}
