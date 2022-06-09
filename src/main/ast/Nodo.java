package main.ast;

import main.asm.ArbolASM;

public class Nodo implements ArbolASM{
    private String descripcion;
    
    private String id;
    
    protected StringBuilder data = new StringBuilder();

    public Nodo(String descripcion) {
        this.descripcion = descripcion;
    }

    protected String getIdNodo() {
        return "nodo_" + this.hashCode();
    }

    public String getDescripcionNodo() {
        return descripcion;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    protected String graficar(String idPadre) {
        return String.format("%1$s [label=\"%2$s\"]\n%3$s -- %1$s\n", getIdNodo(), getDescripcionNodo(), idPadre);
    }

	@Override
	public boolean soyHoja() {
		return false;
	}

	@Override
	public String generarAssembler() {
		return null;
	}
}