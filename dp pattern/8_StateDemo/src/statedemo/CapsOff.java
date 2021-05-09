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
public class CapsOff implements IKeyboard{

    @Override
    public void capsLock(StateContext sc) {
        System.out.println("CapsLoack is Off...");
    }
}
