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
public class Threaddemo extends Thread{
    private String Name;
    public Threaddemo(String name)
    {
        Name=name;
    }
    public void run()
    {
        try{
            singletone1 name=singletone1.getinstance(Name);
            name.showmessage();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
            

}
