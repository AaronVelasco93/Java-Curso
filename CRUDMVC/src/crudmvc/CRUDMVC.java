/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmvc;

import Controlador.CtrlProducto;
import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.Form;

/**
 *
 * @author Aaron
 */
public class CRUDMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Producto mod = new Producto();
        ConsultasProducto modC = new ConsultasProducto();
        Form frm = new Form();
        
        CtrlProducto ctrl = new CtrlProducto(mod, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
        
    }
    
}
