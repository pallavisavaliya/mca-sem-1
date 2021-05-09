/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author PALLAVI
 */
public class Factorypattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        shapefacory shapefactory = new shapefacory();
        
        shape shape1=shapefactory.getshape("circle");
        shape1.draw();
        
        shape shape2=shapefactory.getshape("rectangle");
        shape2.draw();
        
        
    }
    
}
