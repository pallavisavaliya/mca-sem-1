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
public class originator {
    
    private String state;
     public void setstate(String state)
     {
         this.state=state;
     }
     public String getstate()
     {
         return state;
     }
     public memento savestateTomemento()
     {
         return new memento(state);
     }
     public void getstatefrommemento(memento memento)
     {
         
         state = memento.getstate();
     }
    
}
