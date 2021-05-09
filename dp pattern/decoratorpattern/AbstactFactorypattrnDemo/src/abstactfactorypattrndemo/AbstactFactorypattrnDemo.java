/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstactfactorypattrndemo;

/**
 *
 * @author PALLAVI
 */
public class AbstactFactorypattrnDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        AbstractFactory s1=factoryproducer.getfactory(true);
        Shape shape1=s1.getshape("square");
        shape1.draw();
        
        Shape shape2=s1.getshape("ractangle");
        shape2.draw();
    }
    
}
