package main.ast;

import main.asm.ConstanteDataASM;

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
        ConstanteDataASM.data.append(this.getId()).append(" dd ?\n");
        
        String assembler = "";
        if (!this.izquierda.soyHoja()) {
        	assembler += this.izquierda.generarAssembler();
        }
        if (!this.derecha.soyHoja()) {
        	assembler += this.derecha.generarAssembler();
        }

        assembler += "MOV EAX, 1\n"
        		+ "MOV EBX, " + this.izquierda.getId() + "\n"
                + "CMP EAX, EBX\n"
                + "CMP " + this.izquierda.getId() + ", 1\n"
                + "JNE INST_AND_FALSE" + this.andQ + "\n"
                + "MOV EAX, 1\n"
                + "MOV EBX, " + this.derecha.getId() + "\n"
                + "CMP EAX, EBX\n"
                + "CMP " + this.derecha.getId() + ", 1\n"
                + "JNE INST_AND_FALSE" + this.andQ + "\n"
                + "MOV " + this.getId() + ", 1\n"
                + "JMP INST_AND_END" + this.andQ + "\n"
                + "INST_AND_FALSE" + this.andQ + ":\n"
                + "MOV " + this.getId() + ", 0\n"
				+ "INST_AND_END" + this.andQ + ":\n";
        return assembler;
    }

}

