package main.ast;

import main.asm.ConstanteDataASM;

public class NodoResta extends NodoExpresionBinaria {
    private static int count = 0;
    private final int restaQ;

    public NodoResta(NodoExpresion izquierda, NodoExpresion derecha) {
        super("-", izquierda, derecha);
        count++;
        this.restaQ = count;
        this.setId("_@RESTA" + this.restaQ);
    }

	@Override
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
        		+ "FSUB\n"
        		+ "FSTP " + this.getId() + "\n";
        return assembler;
    }
}