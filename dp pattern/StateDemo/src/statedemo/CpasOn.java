/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statedemo;

/**
 *
 * @author PALLAVI
 */
public class CpasOn implements IKeyboard{
    public CpasOn()
    {
    }
    @Override
    public void capsLock(StateContext sc) {
        System.out.println("caps on");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
