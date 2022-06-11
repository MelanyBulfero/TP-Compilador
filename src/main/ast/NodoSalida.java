package main.ast;

public class NodoSalida extends NodoSentencia {
    private final NodoCteString cs;
    
    public NodoSalida(NodoCteString cs) {
        super("PRINT");
        this.cs = cs;
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = this.getIdNodo();
        return super.graficar(idPadre) +
                cs.graficar(miId);
    }

    @Override
    public String generarAssembler() {
        String variable = "_" + this.cs.getValor().replace("\"", "").replace(" ", "").replace("<","@menor").replace(">","@mayor").replace(".", "@punto");
        String assembler = "displayString " + variable + "\n"
                + "newLine 1 \n" ;
        return assembler;
    }
}
