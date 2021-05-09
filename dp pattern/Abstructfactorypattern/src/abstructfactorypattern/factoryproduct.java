/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstructfactorypattern;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 *
 * @author PALLAVI
 */
public class factoryproduct {
    
    

    static abstructfactory getfactory(boolean rounded) {
         if(rounded)
        {
            return new roundedshapefactory();
        }
        else
        {
            return  new shapefactory();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static abstructfactory getfactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
}
