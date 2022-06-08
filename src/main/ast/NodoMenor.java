package main.ast;

public class NodoMenor extends NodoComparacion {
    private static int count;
    private int menorQ;

	public NodoMenor (NodoExpresion izquierda, NodoExpresion derecha) {
        super("<", izquierda, derecha);
        count++;
        this.menorQ = count;
        this.setId("_@MENOR" + this.menorQ);
    }

    @Override
    public String generarAssembler() {
        super.data.append(this.getId()).append(" dd ?\n");

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
                + "JB MINOR_TRUE" + this.menorQ + "\n"
                + "MOV " + this.getId() + ", 0\n"
                + "JMP MINOR_END" + this.menorQ + "\n"
                + "MINOR_TRUE" + this.menorQ + ":\n"
                + "MOV " + this.getId() + ", 1\n"
                + "MINOR_END" + this.menorQ + ":\n";
        return assembler;
    }
}
