package main.ast;

import java.util.List;

public class NodoIfElse extends NodoIfGenerico {
    private final NodoCondicion condicion;
    private final List<NodoSentencia> sentencias;
    private final List<NodoSentencia> sentenciasElse;
    static int count = 0;
    protected int ifElseQ;

    public NodoIfElse(NodoCondicion condicion, List<NodoSentencia> sentencias, List<NodoSentencia> sentenciaselse) {
        super("IF");
        this.condicion = condicion;
        this.sentencias = sentencias;
        this.sentenciasElse = sentenciaselse;
        count++;
        ifElseQ = count;
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

        Nodo nodoElse = new Nodo("Else");
        resultado.append(nodoElse.graficar(miId));

		String idNodoElse = nodoElse.getIdNodo();
        for (NodoSentencia sentenciaElse: sentenciasElse) {
            resultado.append(sentenciaElse.graficar(idNodoElse));
        }
        return resultado.toString();
    }

    @Override
    public String generarAssembler() {
    	String assembler = this.condicion.generarAssembler()
                + "MOV EAX, 1\n"
                + "MOV EBX, " + this.condicion.getId()  + "\n"
                + "CMP EAX, EBX \n"
                + "CMP " + this.condicion.getId() + ", 1\n"
                + "JNE INST_IF_ELSE" + this.ifElseQ + "\n";
        for (NodoSentencia sentencia : this.sentencias) {
            assembler += sentencia.generarAssembler();
        }
        assembler += "JMP INST_IF_END" + this.ifElseQ + "\n"
                + "INST_IF_ELSE" + this.ifElseQ + ":\n";
        for (NodoSentencia sentenciaElse : this.sentenciasElse) {
            assembler += sentenciaElse.generarAssembler();
        }
        assembler += "INST_IF_END" + this.ifElseQ + ":\n";
        
        return assembler;
    }
}
