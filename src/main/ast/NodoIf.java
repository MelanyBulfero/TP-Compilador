package main.ast;

import java.util.List;

public class NodoIf extends NodoIfGenerico {
    private final NodoCondicion condicion;
    private final List<NodoSentencia> sentencias;
    static int count = 0;
    protected int ifQ;

    public NodoIf(NodoCondicion condicion, List<NodoSentencia> sentencias) {
        super("IF");
        this.condicion = condicion;
        this.sentencias = sentencias;
        count++;
        ifQ = count;
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        StringBuilder resultado = new StringBuilder();

        resultado.append(super.graficar(idPadre));

        resultado.append(condicion.graficar(miId));

        Nodo nodoThen = new Nodo("Then");
        resultado.append(nodoThen.graficar(miId));

		String idNodoThen = nodoThen.getIdNodo();
        for (NodoSentencia sentencia: sentencias) {
            resultado.append(sentencia.graficar(idNodoThen));
        }
        return resultado.toString();
    }

    @Override
    public String generarAssembler() {
    	String assembler = this.condicion.generarAssembler()
                + "MOV EAX, " + this.condicion.getId()  + "\n"
                + "MOV EBX, 1\n"
                + "CMP EAX, EBX \n"
                + "JNE INST_IF" + this.ifQ + "\n";
        for (NodoSentencia sentencia : this.sentencias) {
            assembler += sentencia.generarAssembler();
        }
        assembler += "INST_IF" + this.ifQ + ":\n";
        return assembler;
    }
}
