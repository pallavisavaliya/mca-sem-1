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
public class statecontex {
    private Ikeyboard k;
    public statecontex()
    {
        k=new capson();
    }
    public void setstate(Ikeyboard ik)
    {
        k=ik;
    }
    public void capslock()
    {
        k.capslock(this);
    }
}
