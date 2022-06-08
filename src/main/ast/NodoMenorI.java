package main.ast;

public class NodoMenorI extends NodoComparacion {
    private static int count;
    private int menorIgualQ;

	public NodoMenorI (NodoExpresion izquierda, NodoExpresion derecha) {
        super("<=", izquierda, derecha);
        count++;
        this.menorIgualQ = count;
        this.setId("_@MENORIGUAL" + this.menorIgualQ);
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
                + "JBE MINOR_EQ_TRUE" + this.menorIgualQ + "\n"
                + "MOV " + this.getId() + ", 0\n"
                + "JMP MINOR_EQ_END" + this.menorIgualQ + "\n"
                + "MINOR_EQ_TRUE" + this.menorIgualQ + ":\n"
                + "MOV " + this.getId() + ", 1\n"
                + "MINOR_EQ_END" + this.menorIgualQ + ":\n";
        return assembler;
    }
}
