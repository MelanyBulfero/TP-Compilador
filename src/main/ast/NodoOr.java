package main.ast;

public class NodoOr extends NodoCondicion {

	private final NodoCondicion izquierda;
	private final NodoCondicion derecha;

	public NodoOr (NodoCondicion izquierda, NodoCondicion derecha) {
        super("OR");
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

