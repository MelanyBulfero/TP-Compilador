package main.ast;

public class NodoDivision extends NodoExpresionBinaria {
    private static int count = 0;
    private int divQ;

    public NodoDivision(NodoExpresion izquierda, NodoExpresion derecha) {
        super("/", izquierda, derecha);
        count++;
        this.divQ = count;
        this.setId("_@DIV" + this.divQ);
    }

    @Override
    public String generarAssembler() {
        super.data.append(this.getId()).append(" dd, ?\n");
        
        String assembler = "";
        
        if (!izquierda.soyHoja()) {
        	assembler += izquierda.generarAssembler();
        }
        if (!derecha.soyHoja()) {
        	assembler += derecha.generarAssembler();
        }

        assembler += "FLD " + izquierda.getId() + "\n"
        		+ "FLD " + derecha.getId() + "\n"
				+ "FDIV" + "\n"
        		+ "FSTP " + this.getId() + "\n";
        return assembler;
    }
}
