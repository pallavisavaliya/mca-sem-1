/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatttern;

/**
 *
 * @author PALLAVI
 */
public class Observerpatttern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreteSubject cs = new ConcreteSubject();
       Subscriber s1 = new Subscriber("hasmukh");
       Subscriber s2 = new Subscriber("amit");
     
       cs.subsCribe(s1);
     
       cs.subsCribe(s2);
      cs.unSubscribe(s2);
      cs.unSubscribe(s1);
          cs.subsCribe(s2);
    
     
       cs.notifySubs();
    }
 
    }
    

