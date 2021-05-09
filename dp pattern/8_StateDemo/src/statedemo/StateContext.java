/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statedemo;

/**
 *
 * @author st
 */
class StateContext {

    private IKeyboard k;
    public StateContext()
    {
        k = new CpasOn();
    }
    
    public void setState(IKeyboard ik)
    {
        k = ik;
    }
    public void capsLock()
    {
        k.capsLock(this);
    
    }
}

