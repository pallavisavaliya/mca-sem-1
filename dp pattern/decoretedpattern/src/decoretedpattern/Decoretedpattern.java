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
public class Decoretedpattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Iinternet i1=new simplestring();
        System.out.println("simple");
        System.out.println(i1.converted());
        
         Iinternet i2=new lowercase(i1);
        System.out.println("lower");
        System.out.println(i1.converted());
        
         Iinternet i3=new upercase(i1);
        System.out.println("UPER");
        System.out.println(i1.converted());
        
         Iinternet i4=new reverse(i1);
        System.out.println("3");
        System.out.println(i1.converted());
    }
    
    
}
