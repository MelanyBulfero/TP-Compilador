package main.ast;

import java.io.IOException;
import java.util.List;

import main.asm.CargarTS;

public class NodoPrograma extends Nodo {
    private final List<NodoSentencia> sentencias;

    public NodoPrograma(List<NodoSentencia> sentencias) {
        super("PGM");
        this.sentencias = sentencias;
    }

    public String graficar() {
        // Ac√° se dispara la invocaci√≥n a los m√©todos graficar() de los nodos.
        // Como un NodoPrograma no tiene padre, se inicia pasando null.
        return this.graficar(null);
    }

    @Override
    protected String graficar(String idPadre) {
        final String miId = "nodo_programa";

        StringBuilder resultado = new StringBuilder();
        resultado.append("graph G {");

        resultado.append(miId + " [label=\"" + getDescripcionNodo() + "\"]\n");
        for (NodoSentencia sentencia : this.sentencias) {
            resultado.append(sentencia.graficar(miId));
        }

        resultado.append("}");

        return resultado.toString();
    }

    public String generarAssembler() {
        StringBuilder assembler = new StringBuilder();
        super.data.append("include macros2.asm\n"
                + "include number.asm\n"
                + "\n"
                + ".MODEL  SMALL\n"
                + ".386\n"
                + ".STACK 200h\n");
        super.data.append(".DATA\n\n");
        CargarTS tablaSimbolos = new CargarTS("ts.txt");
        try {
            String tabla = tablaSimbolos.generarASM();
            this.data.append(tabla);
        } catch (IOException e) {
            System.out.println("No generÛ las variables");
        }
        String data = super.data.toString();
        assembler.append("\n"
                + ".CODE\n"
                + "\n"
                + "MOV AX,@DATA\n"
                + "MOV DS,AX\n"
                + "FINIT; Inicializa el coprocesador\n");
        for (NodoSentencia sentencia : sentencias) {
            assembler.append(sentencia.generarAssembler()).append("\n");
        }
        assembler.append("FINAL:\n"
                + "   mov ah, 1 ; pausa, espera que oprima una tecla\n" //Quiz·s hay que quitarlo
                + "   int 21h ; AH=1 es el servicio de lectura\n" //Quiz·s hay que quitarlo
                + "   MOV AX, 4C00h ; Sale del Dos\n\n"
                + "   int 21h ; AH=4C00h sale del programa\n" //Quiz·s hay que quitarlo
                + "END ; final del archivo.\n");
        this.data.append(assembler);
        return this.data.toString();
    }
}

