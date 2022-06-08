package main.ast;

public class NodoCteInt extends NodoExpresion {
    private final int valor;

    public NodoCteInt(int valor) {
        super("CteInt");
        this.valor = valor;
        this.setId("_" + valor);
    }

    @Override
    public String getDescripcionNodo() {
        return super.getDescripcionNodo() + ": " + Integer.toString(valor);
    }

    @Override
    public boolean soyHoja() {
        return true;
    }
}
