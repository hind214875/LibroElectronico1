/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libroElectronico;

import javax.swing.JOptionPane;

/**
 *
 * @author hinda
 */
public class Prueba {

    public static void main(String[] args) {
        LIBROELECTRONICO l = new LIBROELECTRONICO();
        LIBROELECTRONICO l1 = new LIBROELECTRONICO();
 
        System.out.println(l);
        System.out.println(l1);
        
        LIBROELECTRONICO l2 = new LIBROELECTRONICO("libro2",999,8,989);
        LIBROELECTRONICO l3 = new LIBROELECTRONICO("libro3",500,5,1);
        
        JOptionPane.showMessageDialog(null,l2.toString());
        JOptionPane.showMessageDialog(null,l3.toString());
        
        LIBROELECTRONICO l4 = new LIBROELECTRONICO("libro2",12000,12,1);
        System.out.println(l4);
        
        l.setNumeroPaginasTotal(13000);
        System.out.println(l);
        
        l1.setTamanyo(15);
        System.out.println(l1);
        
        l2.pasarPagina();
        System.out.println(l2);
        
        l3.saltar(2);
        System.out.println(l3);
    }

}
