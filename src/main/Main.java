package main;

import main.ast.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader f;
		try {
			f = new FileReader("prueba.txt");
			Lexico Lexer = new Lexico(f);
			parser sintactico = new parser(Lexer);

			NodoPrograma programa = (NodoPrograma) sintactico.parse().value;
			try {
				FileWriter archivo = new FileWriter("arbol.dot");
				PrintWriter pw = new PrintWriter(archivo);
				pw.println(programa.graficar());
				archivo.close();
			} catch (Exception e) {
				System.out.println(e);
			}

			String cmd = "dot -Tpng arbol.dot -o arbol.png";
			Runtime.getRuntime().exec(cmd);
			
			String assembler = programa.generarAssembler();
			FileWriter fileWriter = new FileWriter("final.asm");
			fileWriter.write(assembler);
			fileWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No hay un archivo para analizar");
		} catch (Exception e) {
			System.err.println(e);
			System.out.println("ERROR");
		}

	}

}
