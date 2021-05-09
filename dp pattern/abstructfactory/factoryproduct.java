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
public class factoryproduct {
    
    public static abstructfactory getfactory(boolean rounded)
    {
        if(rounded)
        {
            return new roundedshapefactory();
        }
        else
        {
            return  new shapefactory();
        }
    }

    static abstructfactory getfactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
