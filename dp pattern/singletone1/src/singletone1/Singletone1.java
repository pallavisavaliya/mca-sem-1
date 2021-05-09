/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletone1;

/**
 *
 * @author PALLAVI
 */
public class Singletone1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Thread t1=new threaddemo1("abc");
        Thread t2=new threaddemo1("cde");
        
        t1.run();
        t2.run();
    }

  
    
}
