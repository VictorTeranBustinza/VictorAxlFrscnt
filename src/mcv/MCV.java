/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcv;

import Modelo.modelo;
import Vista.vista;

/**
 *
 * @author l03m13
 */
public class MCV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modelo mod=new modelo();
        vista view = new vista();
        
        Controlador.controlador ctrl =new Controlador.controlador(view,mod);
        ctrl.iniciar();
        view.setVisible(true);
        
        
        
        
    }
    
}
