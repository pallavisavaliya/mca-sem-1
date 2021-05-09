/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletone1;

/**
 *
 * @author PALLAVI
 */
public class singleobject1 {
    private static singleobject1 instance = null;
    public static String Name; 
    private singleobject1(){}
    public static singleobject1 getinstance(String name)
    {
        if(instance== null)
        {
            Name=name; 
       instance=new singleobject1();
            
        }
       
    
    return instance;
    }
    public void showmessage()
    {
        System.out.println(Name+"the thread created");
    }
    
    
}

