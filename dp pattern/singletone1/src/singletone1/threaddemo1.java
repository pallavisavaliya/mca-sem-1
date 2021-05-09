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
public class threaddemo1 extends Thread {

    private String Name;
    public threaddemo1(String name)
    {
        Name=name;
    }
    public void run()
    {
        try
        {
            singleobject1 name=singleobject1.getinstance(Name);
            name.showmessage();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
}
