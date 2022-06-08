package main.ast;

public class NodoOr extends NodoCondicion {

    private static int count = 0;
    private final int orQ;

	private final NodoCondicion izquierda;
	private final NodoCondicion derecha;

	public NodoOr (NodoCondicion izquierda, NodoCondicion derecha) {
        super("OR");
        this.izquierda = izquierda;
        this.derecha = derecha;
        count++;
        orQ = count;
        setId("_@OR" + orQ);
    }

	@Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        return super.graficar(idPadre) +
                izquierda.graficar(miId) +
                derecha.graficar(miId);
    }

    @Override
    public String generarAssembler() {
        super.data.append(this.getId()).append(" dd ?\n");
        
        String assembler = "";
        if (! this.izquierda.soyHoja()) {
        	assembler += this.izquierda.generarAssembler();
        }
        if (! this.derecha.soyHoja()) {
        	assembler += this.derecha.generarAssembler();
        }
        
        assembler += "MOV EAX, " + this.izquierda.getId()  + "\n"
        		+ "MOV EBX, 1\n"
                + "CMP EAX, EBX\n"
                + "JE INST_OR_TRUE" + this.orQ + "\n"
                + "MOV EAX, " + this.derecha.getId()  + "\n"
                + "MOV EBX, 1\n"
                + "CMP EAX, EBX\n"
                + "JE INST_OR_TRUE" + this.orQ + "\n"
                + "MOV " + this.getId() + ", 0\n"
                + "JMP INST_OR_END" + this.orQ + "\n"
                + "INST_OR_TRUE" + this.orQ + ":\n"
                + "MOV " + this.getId() + ", 1\n"
                + "INST_OR_END" + this.orQ + ":\n";
        return assembler;
    }

}

