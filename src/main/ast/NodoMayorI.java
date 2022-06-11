package main.ast;

import main.asm.ConstanteDataASM;

public class NodoMayorI extends NodoComparacion {
    private static int count;
    private int mayorIgualQ;
    
    public NodoMayorI (NodoExpresion izquierda, NodoExpresion derecha) {
        super(">=", izquierda, derecha);
        count++;
        this.mayorIgualQ = count;
        this.setId("_@MAYORIGUAL" + this.mayorIgualQ);
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
                + "JAE GREATER_EQ_TRUE" + this.mayorIgualQ + "\n"
                + "MOV " + this.getId() + ", 0\n"
                + "JMP GREATER_EQ_END" + this.mayorIgualQ + "\n"
                + "GREATER_EQ_TRUE" + this.mayorIgualQ + ":\n"
                + "MOV " + this.getId() + ", 1\n"
                + "GREATER_EQ_END" + this.mayorIgualQ + ":\n";
        return assembler;
    }
}
