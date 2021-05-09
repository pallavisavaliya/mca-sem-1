/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstructfactorypattern;

/**
 *
 * @author st
 */
public class shapefactory extends abstructfactory{

    shapefactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public shape getshape(String shapetype)
            
    {
        
        if(shapetype.equalsIgnoreCase("circle"))
        {
            return new circle();
        }
        
        else if(shapetype.equalsIgnoreCase("rectangle"))
        {
            return new rectangle();
        }
        return null;
    }
}

