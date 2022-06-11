package main.ast;

import java.util.ArrayList;
import java.util.List;

import main.asm.ConstanteDataASM;

public class NodoAvg extends NodoExpresion {
    private final List<NodoExpresion> lista;
    private static int count;
    private int avgQ;
  

    public NodoAvg(List<NodoExpresion> lista) {
        super("AVG");
        this.lista = lista;
        count++;
        this.avgQ = count;
        this.setId("_@AVG" + this.avgQ);
    }

    @Override
    protected String graficar(String idPadre) {
        StringBuilder resultado = new StringBuilder();

//        Agrega un nodo ficticio /
        Nodo nodoDivision = new Nodo("/");
        resultado.append(nodoDivision.graficar(idPadre));
		String idNodoDivision = nodoDivision.getIdNodo();
		
		int listSize = lista.size();

		List<NodoExpresion> listaAux = new ArrayList<NodoExpresion>();
        NodoExpresion expresion = lista.get(listSize-1);
		listaAux = lista.subList(0, listSize-1);
    	Nodo nodoRecursivo = new NodoExpresionRecursiva(listaAux, "+", expresion);
        resultado.append(nodoRecursivo.graficar(idNodoDivision));

		NodoCteInt nodoDivisor = new NodoCteInt(listSize);
        resultado.append(nodoDivisor.graficar(idNodoDivision));
        return resultado.toString();
    }

	@Override
    public String generarAssembler() {

        ConstanteDataASM.data.append(this.getId()).append(" dd, ?\n");
        
        String assembler = "MOV " + this.getId() + ", 0\n";

        for (NodoExpresion expresion : this.lista) {
        	
            if (!expresion.soyHoja()) {
            	assembler += expresion.generarAssembler();
            }

            assembler += "FLD " + expresion.getId() + "\n"
            		+ "FLD " + this.getId() + "\n"
            		+ "FADD" + "\n"
            		+ "FSTP " + this.getId() + "\n";
        }

        assembler += "MOV _@DIVAVG" + avgQ + ", " + lista.size() + "\n";
        ConstanteDataASM.data.append("_@DIVAVG" + avgQ).append(" dd, ?\n");
        assembler += "FLD " + this.getId() + "\n"
        		+ "FLD _@DIVAVG" + avgQ + "\n"
				+ "FDIV" + "\n"
        		+ "FSTP " + this.getId() + "\n";
        return assembler;
    }
}


