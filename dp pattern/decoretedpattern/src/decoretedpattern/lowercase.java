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
public class lowercase extends specialstring{
    public lowercase(Iinternet bstring)
    {
        super(bstring);
    }

    @Override
    public String converted() {
        String lsbr=str.converted();
        return str.converted()+lsbr.toLowerCase();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
