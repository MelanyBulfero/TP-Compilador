package main.ast;

public class NodoMenorI extends NodoComparacion {
        public NodoMenorI (NodoExpresion izquierda, NodoExpresion derecha) {
        super("<=", izquierda, derecha);
    }
}
