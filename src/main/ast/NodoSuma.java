package main.ast;

import main.asm.ConstanteDataASM;

public class NodoSuma extends NodoExpresionBinaria {
    private static int count = 0;
    private final int sumaQ;

    public NodoSuma(NodoExpresion izquierda, NodoExpresion derecha) {
        super("+", izquierda, derecha);
        count++;
        this.sumaQ = count;
        this.setId("_@SUMA" + this.sumaQ);
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
        		+ "FADD" + "\n"
        		+ "FSTP " + this.getId() + "\n";
        return assembler;
    }
}