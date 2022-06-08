package main.ast;

public class NodoAsig extends NodoSentencia {
    private final NodoVarId id;
    private final NodoExpresion expresion;

    public NodoAsig(NodoVarId id, NodoExpresion expresion) {
        super(":=");
        this.id = id;
        this.expresion = expresion;
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        return super.graficar(idPadre) +
        		id.graficar(miId) +
        		this.expresion.graficar(miId);
    }

    @Override
    public String generarAssembler() {
        String assembler = "";
        if (! this.expresion.soyHoja()) {
            assembler += this.expresion.generarAssembler();
        }
        String descripcionNodo = this.expresion.getDescripcionNodo();
        if (descripcionNodo.contains("CteString")) {
        	assembler += "MOV EAX, OFFSET " + this.expresion.getId() + "\n";
        } else {
        	assembler += "MOV EAX, " + this.expresion.getId() + "\n";
        }
        assembler += "MOV " + this.id.getId() + ", EAX" + "\n";
        return assembler;
    }
}
