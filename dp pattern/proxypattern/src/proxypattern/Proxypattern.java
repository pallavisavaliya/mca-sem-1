/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxypattern;

/**
 *
 * @author PALLAVI
 */
public class Proxypattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        istring i=new pinternet();
        try
        {
            i.connect("abc");
            i.connect("cde");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        // TODO code application logic here
    }
    
}
