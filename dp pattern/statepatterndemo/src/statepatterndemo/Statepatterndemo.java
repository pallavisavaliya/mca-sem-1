/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepatterndemo;

/**
 *
 * @author PALLAVI
 */
public class Statepatterndemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        statecontex sc=new statecontex();
        sc.capslock();
        sc.capslock();
        sc.setstate(new capsoff());
        sc.capslock();
        sc.capslock();
            
    }
    
}
