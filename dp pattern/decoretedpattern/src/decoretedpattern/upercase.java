/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoretedpattern;

/**
 *
 * @author PALLAVI
 */
public class upercase extends specialstring{
    public upercase(Iinternet bstring)
    {
        super(bstring);
    }

    @Override
    public String converted() {
        String usbr=str.converted();
        return str.converted()+usbr.toUpperCase();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
