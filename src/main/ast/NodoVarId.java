package main.ast;

public class NodoVarId extends NodoExpresion {
    private final String id;

    public NodoVarId(String id) {
        super("VarId");
        this.id = id;
    }

    @Override
    public String getDescripcionNodo() {
        return "VarId: " + id;
    }
}
