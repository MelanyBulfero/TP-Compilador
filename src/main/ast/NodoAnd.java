package main.ast;

public class NodoAnd extends NodoCondicion {
    private static int count = 0;
    private final int andQ;
        
	private final NodoCondicion izquierda;
	private final NodoCondicion derecha;

	public NodoAnd (NodoCondicion izquierda, NodoCondicion derecha) {
        super("AND");
        this.izquierda = izquierda;
        this.derecha = derecha;
        count++;
        this.andQ = count;
        setId("_@AND" + this.andQ);
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
        if (!this.izquierda.soyHoja()) {
        	assembler += this.izquierda.generarAssembler();
        }
        if (!this.derecha.soyHoja()) {
        	assembler += this.derecha.generarAssembler();
        }

        assembler += "MOV EAX, " + this.izquierda.getId() + "\n"
        		+ "MOV EBX, 1\n"
                + "CMP EAX, EBX\n"
                + "JNE INST_AND_FALSE" + this.andQ + "\n"
                + "MOV EAX, " + this.derecha.getId() + "\n"
                + "MOV EBX, 1\n"
                + "CMP EAX, EBX\n"
                + "JNE INST_AND_FALSE" + this.andQ + "\n"
                + "MOV " + this.getId() + ", 1\n"
                + "JMP INST_AND_END" + this.andQ + "\n"
                + "INST_AND_FALSE" + this.andQ + ":\n"
                + "MOV " + this.getId() + ", 0\n"
				+ "INST_AND_END" + this.andQ + ":\n";
        return assembler;
    }

}

