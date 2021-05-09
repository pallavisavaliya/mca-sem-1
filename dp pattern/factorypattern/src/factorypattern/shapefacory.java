/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author PALLAVI
 */
public class shapefacory {
    public shape getshape(String shapeType){
        if(shapeType==null)
        {
            return null;
        }
        if(shapeType.equalsIgnoreCase("circle")){
            return new circle();
        }
        if(shapeType.equalsIgnoreCase("rectangle")){
            return new rectangle();
        }
        return null;
    }
}
