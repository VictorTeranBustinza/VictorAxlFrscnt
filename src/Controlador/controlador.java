/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelo;
import Vista.vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author l03m13
 */
public class controlador implements ActionListener {
    
    private vista view;
    private modelo model;
    
    public controlador (vista view,modelo model){
        this.view = view;
        this.model = model;
        this.view.btnmultiplicar.addActionListener(this);
        
    }
    
    public void iniciar () {
        view.setTitle("MCV Multiplicar");
        view.setLocationRelativeTo(null);
        
    }
    
    
    public void actionPerformed (ActionEvent e) {
        model.setNumerouno(Integer.parseInt(view.txtnum1.getText()));
        model.setNumerodos(Integer.parseInt(view.txtnum2.getText()));
        model.multiplicar();
        view.txtresultado.setText(String.valueOf(model.getResultado()));
        
        
        
    }
    
}
