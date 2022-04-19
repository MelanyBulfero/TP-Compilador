package main.ast;

public class NodoCteString extends NodoExpresion {
    private final String valor;

    public NodoCteString(String valor) {
        super("CteString");
        this.valor = valor;
    }
    
    private String normalize(String denormalizedString) {
        StringBuilder normalizedString = new StringBuilder();
        int i = 0;
        int stringSize = denormalizedString.length();
        while (i < stringSize) {
            if (denormalizedString.charAt(i) != '"') {
                normalizedString.append(denormalizedString.charAt(i));
            }
            i++;
        }
        return normalizedString.toString();
    }

    @Override
    public String getDescripcionNodo() {
        return super.getDescripcionNodo() + ": " + normalize(valor);
    }
}
