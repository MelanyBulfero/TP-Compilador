package main.ast;

public class NodoCteFloat extends NodoExpresion {
    private final float valor;

    public NodoCteFloat(float valor) {
        super("CteFloat");
        this.valor = valor;
        this.setId("_" + Float.toString(this.valor).replace(".","@punto").replace(",","@coma"));
    }

    @Override
    public String getDescripcionNodo() {
        return super.getDescripcionNodo() + ": " + Float.toString(valor);
    }

    @Override
    public boolean soyHoja() {
        return true;
    }
}
