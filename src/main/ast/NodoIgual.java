package main.ast;

import main.asm.ConstanteDataASM;

public class NodoIgual extends NodoComparacion {
    private static int count = 0;
    private final int igualQ;

    public NodoIgual (NodoExpresion izquierda, NodoExpresion derecha) {
        super("=", izquierda, derecha);
        count++;
        this.igualQ = count;
        this.setId("_@EQ" + this.igualQ);
    }
    
    @Override
    public String generarAssembler() {
    	ConstanteDataASM.data.append(this.getId()).append(" dd ?\n");
        
        String assembler = "";
        if (! izquierda.soyHoja()) {
            assembler += izquierda.generarAssembler();
        }
        if (! derecha.soyHoja()) {
        	assembler += derecha.generarAssembler();
        }
        
        assembler += "MOV EAX, " + derecha.getId()  + "\n"
        		+ "MOV EBX, " + izquierda.getId()  + "\n"
                + "CMP EAX, EBX\n"
        		+ "JE EQ_TRUE" + this.igualQ + "\n"
        		+ "MOV " + this.getId() + ", 0\n"
        		+ "JMP EQ_END" + this.igualQ + "\n"
        		+ "EQ_TRUE" + this.igualQ + ":\n"
        		+ "MOV " + this.getId() + ", 1\n"
        		+ "EQ_END" + this.igualQ + ":\n";
        return assembler;
    }
}
