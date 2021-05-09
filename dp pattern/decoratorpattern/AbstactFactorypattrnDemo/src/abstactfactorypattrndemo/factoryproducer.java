/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstactfactorypattrndemo;

/**
 *
 * @author PALLAVI
 */
public class factoryproducer 
{
    public static AbstractFactory getfactory(boolean rounded)
    {
        if(rounded)
        {
            return new roundedshapefactory();
        }
        else
        {
            return new shapefactory();
        }
    }

}
