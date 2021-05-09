/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementopattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PALLAVI
 */
public class caretaker {
    
    private List <memento> m1=new ArrayList<memento>();
    
       public void add(memento state)
       {
           m1.add(state);
       }
       public memento get(int index)
       {
           return m1.get(index);
       }
    
}
