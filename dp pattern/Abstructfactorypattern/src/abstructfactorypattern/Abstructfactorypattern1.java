/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstructfactorypattern;

/**
 *
 * @author PALLAVI
 */
public class Abstructfactorypattern1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        abstructfactory a1=factoryproduct.getfactory();
        
        shape shape1=a1.getshape("circle");
        shape1.draw();
        
        shape shape2=a1.getshape("rectangle");
        shape2.draw();

    }
    
}
