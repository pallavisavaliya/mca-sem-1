/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatttern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PALLAVI
 */
public class ConcreteSubject implements Subject{
        public List<Subscriber> subs= new ArrayList<>();

    public void subsCribe(Subscriber sub) {
        subs.add(sub);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void unSubscribe(Subscriber sub) {
       subs.remove(sub);        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void notifySubs() {
            for(Observer sub : subs){
            sub.update();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }

  
}
