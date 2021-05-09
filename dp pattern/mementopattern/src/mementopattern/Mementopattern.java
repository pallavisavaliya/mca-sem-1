/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementopattern;

/**
 *
 * @author PALLAVI
 */
public class Mementopattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        originator o1=new originator();
        caretaker c1=new caretaker();
        
        o1.setstate("state1");
        c1.add(o1.savestateTomemento());
        
        
        o1.getstatefrommemento(c1.get(0));
        System.out.println("first state saved"+ o1.getstate());
        
        
        
        
        
    }
    
    
}
