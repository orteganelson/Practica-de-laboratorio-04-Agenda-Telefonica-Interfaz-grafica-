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
        TextField txt2 = new TextField(25);
        TextField txt3 = new TextField(25);
        TextField txt4 = new TextField(25);
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
        e1.add(txt1);
        e1.add(txt2);
        e1.add(txt3);
        e1.add(txt4);
        
        
        BorderLayout P2= new BorderLayout();
        panel2.setLayout(P2);
        Panel e2 = new Panel();
        Panel o2 = new Panel();
        panel2.add(e2,BorderLayout.EAST);
        panel2.add(o2,BorderLayout.CENTER);
        GridLayout matriz3= new GridLayout(8,1);
        GridLayout matriz4= new GridLayout(4,1);
        Label nombre3 = new Label("Editar Teléfono");
        Label nombre4 = new Label("Nuevos datos");
        Label codigo2 = new Label("Ingrese el código");
        Label num2 = new Label("Ingrese el número");
        Label tipo2= new Label("Ingrese el tipo");
        Label operadora2= new Label("Ingrese la operadora");
        TextField txt5 = new TextField(25);
        TextField txt6 = new TextField(25);
        TextField txt7 = new TextField(25);
        TextField txt8 = new TextField(25);
        Button boton3 = new Button("Editar");
        Button boton4 = new Button("Volver");
        
        o2.setLayout(matriz3);
        o2.add(nombre3);
        o2.add(nombre4);
        o2.add(codigo2);
        o2.add(num2);
        o2.add(tipo2);
        o2.add(operadora2);
        o2.add(boton3);
        o2.add(boton4);
        e2.setLayout(matriz4);
        e2.add(txt5);
        e2.add(txt6);
        e2.add(txt7);
        e2.add(txt8);

        
        Label nombre5 = new Label("Eliminar teléfono");
        Label nombre6 = new Label("Ingrese código del telefono");
        TextField txt9 = new TextField(25);
        Button boton5= new Button("Eliminar");
        Button boton6= new Button("Volver");
        GridLayout matriz5= new GridLayout(5,1);
        panel3.setLayout(matriz5);
        panel3.add(nombre5);
        panel3.add(nombre6);
        panel3.add(txt9);
        panel3.add(boton5);
        panel3.add(boton6);
        
        Label nombre7 = new Label("Buscar Teléfono");
        Label nombre8 = new Label("Ingrese código del teléfono");
        TextField txt10 = new TextField(25);
        Button boton7= new Button("Buscar");
        Button boton8= new Button("Volver");
        GridLayout matriz6= new GridLayout(5,1);
        panel4.setLayout(matriz6);
        panel4.add(nombre7);
        panel4.add(nombre8);
        panel4.add(txt10);
        panel4.add(boton7);
        panel4.add(boton8);
        
        
        Label nombre9 = new Label("¿Desea listar sus teléfonos?");
        Button boton9= new Button("Listar");
        Button boton10= new Button("Volver");
        GridLayout matriz7= new GridLayout(3,1);
        panel5.setLayout(matriz7);
        panel5.add(nombre9);
        panel5.add(boton9);
        panel5.add(boton10);
        
         BorderLayout P3= new BorderLayout();
         panel6.setLayout(P3);
        Button boton11 = new Button("Cerrar Sesion");
        panel6.add(boton11,BorderLayout.CENTER);
        this.add(panelPr);
        this.setVisible(true);
        
    }
}
