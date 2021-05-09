/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonepattern;

/**
 *
 * @author PALLAVI
 */
public class singletone1 {
    
    private static singletone1 instance = null;
    public static String Name; 
    private singletone1()
    {
    }
    public static singletone1 getinstance(String name)
    {
        if(instance== null)
        {
            Name=name; 
       instance=new singletone1();
            
        }
       
    
    return instance;
    }
    public void showmessage()
    {
        System.out.println(Name+"the thread created");
    }

}
