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
public class roundedshapefactory  extends AbstractFactory
{
    public Shape getshape(String shapetype)
    {
        if(shapetype.equalsIgnoreCase("square"))
        {
            return new square();
        }
        if(shapetype.equalsIgnoreCase("ractangle"))
        {
            return new ractangle();
        }
        return null;
    }
}
