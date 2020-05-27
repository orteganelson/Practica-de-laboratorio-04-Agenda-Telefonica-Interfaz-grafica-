/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import java.awt.*;

/**
 *
 * @author Usuario
 */
public class VistaTelf extends Frame {
    public VistaTelf(String title){
        this.setTitle(title);
        this.setSize(900,600);
        this.setLocation(250, 180);
        Panel panelPr = new Panel();
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();
        Panel panel4 = new Panel();
        Panel panel5 = new Panel();
        Panel panel6 = new Panel();
        GridLayout matrizPr = new GridLayout(3,3);
              
        panelPr.setLayout(matrizPr);
        panelPr.add(panel1);
        panelPr.add(panel2);
        panelPr.add(panel3);
        panelPr.add(panel4);
        panelPr.add(panel5);
        panelPr.add(panel6);
        
        Label nombre1 = new Label("Agregar Teléfono");
        Label codigo = new Label("Ingrese el código");
        Label num = new Label("Ingrese el número");
        Label tipo= new Label("Ingrese el tipo");
        Label operadora= new Label("Ingrese la operadora");
        Button boton1 = new Button("Agregar");
        Button boton2 = new Button("Volver");
        TextField txt1 = new TextField(25);
        TextField txt2 = new TextField();
        TextField txt3 = new TextField();
        TextField txt4 = new TextField();
        GridLayout matriz1= new GridLayout(7,1);
        GridLayout matriz2= new GridLayout(5,1);
        BorderLayout P1= new BorderLayout();
        panel1.setLayout(P1);
        Panel e1 = new Panel();
        Panel o1 = new Panel();
        panel1.add(e1,BorderLayout.EAST);
        panel1.add(o1,BorderLayout.CENTER);
       o1.setLayout(matriz1);
        o1.add(nombre1);
        o1.add(codigo);
        o1.add(num);
        o1.add(tipo);
        o1.add(operadora);
        o1.add(boton1);
        o1.add(boton2);
        
        e1.setLayout(matriz2);
        e1.add(nombre1);
        e1.add(txt1);
        e1.add(txt2);
        e1.add(txt3);
        e1.add(txt4);
        
        this.add(panelPr);
        
        
        
        
        this.setVisible(true);
        
    }
}
