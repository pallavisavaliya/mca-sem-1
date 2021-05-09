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
public class capson implements Ikeyboard{
    public capson()
    {
    }
    @Override
    public void capslock(statecontex sc) {
        System.out.println("caps on");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
