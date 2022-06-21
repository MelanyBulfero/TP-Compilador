package main.ast;

import main.asm.ConstanteDataASM;

public class NodoMultiplicacion extends NodoExpresionBinaria {
    private static int count = 0;
    private final int mulQ;

    public NodoMultiplicacion(NodoExpresion izquierda, NodoExpresion derecha) {
        super("*", izquierda, derecha);
        count++;
        this.mulQ = count;
        this.setId("_@MULT" + this.mulQ);
    }

    public String generarAssembler() {

    	ConstanteDataASM.data.append(this.getId()).append(" dd, ?\n");

        String assembler = "";
        if (!izquierda.soyHoja()) {
        	assembler += izquierda.generarAssembler();
        }
        if (!derecha.soyHoja()) {
        	assembler += derecha.generarAssembler();
        }

        assembler += "FLD " + izquierda.getId() + "\n"
        		+ "FLD " + derecha.getId() + "\n"
        		+ "FMUL\n"
        		+ "FSTP " + this.getId() + "\n";
        return assembler;
    }
}
