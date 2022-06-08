package main.ast;

public class NodoDistinto extends NodoComparacion {
    private static int count = 0;
    private final int distQ;
    
    public NodoDistinto (NodoExpresion izquierda, NodoExpresion derecha) {
        super("<>", izquierda, derecha);
        count++;
        this.distQ = count;
        this.setId("_@DIST" + this.distQ);
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
        		+ "JNE DIST_TRUE" + this.distQ + "\n"
        		+ "MOV " + this.getId() + ", 0\n"
        		+ "JMP DIST_END" + this.distQ + "\n"
        		+ "DIST_TRUE" + this.distQ + ":\n"
        		+ "MOV " + this.getId() + ", 1\n"
        		+ "DIST_END" + this.distQ + ":\n";
        return assembler;
    }
}
