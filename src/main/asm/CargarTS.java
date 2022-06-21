package main.asm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CargarTS {
    private String nombreArchivo;
    private List<String> nombres;

    public CargarTS(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String generarASM () throws IOException {
        File file = new File(nombreArchivo);
        nombres = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(file);
        String result = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replace("\"", "").replace(" ", "");
                String[] data = line.split(",");
                if (! nombres.contains(data[0])) {
                	nombres.add(data[0]);
                    String value = "";
                    data[0] = data[0].replace(",","@coma").replace(".", "@punto");
                    if (data.length < 4) {
                        value  = " dd ?";
                        data[0] = "__@" + data[0];
                        data[0] = data[0].replace("<","@menor").replace(">","@mayor").replace(".", "@punto");
                    } else {
                        value = data[3];
                        switch (data[1]) {
                            case "Const_String":
                                data[0] = data[0].replace("<","@menor").replace(">","@mayor");
                                value = " db \"" + value + "\"" + ", " + value.length() + ", " + value.length() + ", '$'";
                                break;
                            case "Numero":
                                value = " dd " + value;
                                break;
                            case "Real":
                                value = " dd " + value.replace(",", ".");
                                break;
                            default:
                                value=" dd ?";
                                break;
                        }
                    }
                    result += data[0] + value + "\n";
                }
            }
        }
        inputStream.close();
        return result;
    }
}
