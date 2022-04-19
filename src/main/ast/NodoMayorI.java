package main.ast;

public class NodoMayorI extends NodoComparacion {
        public NodoMayorI (NodoExpresion izquierda, NodoExpresion derecha) {
        super(">=", izquierda, derecha);
    }
}
