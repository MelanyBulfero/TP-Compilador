package main.ast;

public class NodoDistinto extends NodoComparacion {
        public NodoDistinto (NodoExpresion izquierda, NodoExpresion derecha) {
        super("<>", izquierda, derecha);
    }
}
