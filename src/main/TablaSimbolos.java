package main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
//Packages to import
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablaSimbolos {
	// frame
	JFrame f;
	// Table
	JTable j;
	
	private final String ruta = System.getProperties().getProperty("user.dir");
	private String[][] data = null;
	
	// Constructor
	public TablaSimbolos() {
		// Frame initialization
		f = new JFrame();

		// Frame Title
		f.setTitle("Tabla de Simbolos");
		
		File file = null;
	    FileReader FileR=null;
	    BufferedReader BufferedR=null;
	    try {
	    	file =new File(ruta +"\\ts.txt");

	        FileR=new FileReader(file);
	        BufferedR= new BufferedReader(FileR);
	        
	        Object[] tableLines = BufferedR.lines().toArray();
	        data = new String[tableLines.length][5];
	        
	        for (int i = 0; i < tableLines.length; i++) {
	        	String line = tableLines[i].toString();
	        	String[] dataRow = line.split(",");
	        	data[i] = dataRow;
	        }
	        
	    } catch (Exception e) {} finally {
	            try {
	                if(null != FileR) {
	                    FileR.close();}}
	            catch (IOException e2){{}
	            }
	    }

		// Column Names
		String[] columnNames = { "Nombre", "Token", "Tipo", "Valor", "Longitud" };

		// Initializing the JTable
		j = new JTable(data, columnNames);
		j.setBounds(30, 40, 200, 300);

		// adding it to JScrollPane
		JScrollPane sp = new JScrollPane(j);
		f.add(sp);
    	// Frame Size
		f.setSize(600, 500);
		// Frame Visible = true
		f.setVisible(true);
	}

}
