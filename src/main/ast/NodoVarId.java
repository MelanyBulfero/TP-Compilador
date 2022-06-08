package main.ast;

public class NodoVarId extends NodoExpresion {
    private final String id;

    public NodoVarId(String id) {
        super("VarId");
        this.id = id;
        this.setId("__@" + this.id.replace("<","@menor").replace(">","@mayor"));
    }

    @Override
    public String getDescripcionNodo() {
        return "VarId: " + id;
    }

    @Override
    public String getValor() {
        return this.id;
    }

    @Override
    public boolean soyHoja() {
        return true;
    }
}
