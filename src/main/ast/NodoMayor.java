package main.ast;

import main.asm.ConstanteDataASM;

public class NodoMayor extends NodoComparacion {
    private static int count;
    private int mayorQ;

	public NodoMayor (NodoExpresion izquierda, NodoExpresion derecha) {
        super(">", izquierda, derecha);
        count++;
        this.mayorQ = count;
        this.setId("_@MAYOR" + this.mayorQ);
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
        
        assembler += "MOV EAX, " + izquierda.getId()  + "\n"
                + "MOV EBX, " + derecha.getId()  + "\n"
                + "CMP EAX, EBX\n"
                + "JA GREATER_TRUE" + this.mayorQ + "\n"
                + "MOV " + this.getId() + ", 0\n"
                + "JMP GREATER_END" + this.mayorQ + "\n"
                + "GREATER_TRUE" + this.mayorQ + ":\n"
                + "MOV " + this.getId() + ", 1\n"
                + "GREATER_END" + this.mayorQ + ":\n";
        return assembler;
    }
}
