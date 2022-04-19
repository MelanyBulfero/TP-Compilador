package main.ast;

public class NodoCteFloat extends NodoExpresion {
    private final float valor;

    public NodoCteFloat(float valor) {
        super("CteFloat");
        this.valor = valor;
    }

    @Override
    public String getDescripcionNodo() {
        return super.getDescripcionNodo() + ": " + Float.toString(valor);
    }
}
