package main.ast;

public class NodoCteInt extends NodoExpresion {
    private final int valor;

    public NodoCteInt(int valor) {
        super("CteInt");
        this.valor = valor;
    }

    @Override
    public String getDescripcionNodo() {
        return super.getDescripcionNodo() + ": " + Integer.toString(valor);
    }
}
