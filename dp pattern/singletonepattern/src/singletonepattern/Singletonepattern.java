/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonepattern;

/**
 *
 * @author PALLAVI
 */
public class Singletonepattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread sh = new Threaddemo("abc");
        Thread ri = new Threaddemo("def");
        
        sh.run();
        ri.run();

    }
    
}
