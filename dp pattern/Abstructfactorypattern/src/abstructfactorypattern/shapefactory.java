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
public class shapefactory extends abstructfactory{
    
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

    

