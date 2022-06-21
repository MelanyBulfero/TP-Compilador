package main.ast;

import java.util.List;

public class NodoWhile extends NodoSentencia {
    private final NodoCondicion condicion;
    private final List<NodoSentencia> cuerpo;
    static int count = 0;
    protected int whileQ;
  

    public NodoWhile(NodoCondicion condicion, List<NodoSentencia> cuerpo) {
        super("WHILE");
        this.condicion = condicion;
        this.cuerpo = cuerpo;
        count++;
        this.whileQ = count;
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        StringBuilder resultado = new StringBuilder();

        resultado.append(super.graficar(idPadre));

        // Grafica la condición colgando directamente del nodo CUERPO
        resultado.append(condicion.graficar(miId));

        // Agrega un nodo ficticio CUERPO colgando del nodo WHILE
        Nodo nodoCuerpo = new Nodo("Cuerpo");
        resultado.append(nodoCuerpo.graficar(miId));

		String idNodoCuerpo = nodoCuerpo.getIdNodo();
        for (NodoSentencia sentencia: cuerpo) {
            resultado.append(sentencia.graficar(idNodoCuerpo));
        }
        return resultado.toString();
    }

    @Override
    public String generarAssembler() {
    	String assembler = "INST_WHILE_BEGIN" + this.whileQ + ":\n"
                + this.condicion.generarAssembler()
                + "MOV EAX, 1\n"
                + "MOV EBX, " + this.condicion.getId() + "\n"
                + "CMP EAX, EBX \n"
                + "CMP " + this.condicion.getId() + ", 1\n"
                + "JNE INST_WHILE_END" + this.whileQ + "\n";
        for (NodoSentencia sentencia : cuerpo) {
            assembler += sentencia.generarAssembler();
        }
    	assembler += "JMP INST_WHILE_BEGIN" + this.whileQ + "\n"
                + "INST_WHILE_END" + this.whileQ + ":\n";
        return assembler;
    }
}


