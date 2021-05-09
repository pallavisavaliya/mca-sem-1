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
public class reverse extends specialstring{
    public reverse(Iinternet bstring)
    {
        super(bstring);
    }

    @Override
    public String converted() {
        String rsbr=str.converted();
        StringBuffer sb=new StringBuffer(rsbr);
        return str.converted()+sb.reverse();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
