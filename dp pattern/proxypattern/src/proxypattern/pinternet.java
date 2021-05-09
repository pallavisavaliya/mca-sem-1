/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxypattern;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PALLAVI
 */
public class pinternet implements istring{
    private final istring i=new rinternet();
    private static List<String>bannedsites;
    static
    {
        bannedsites =new ArrayList<String>();
        bannedsites.add("abc.com");
        bannedsites.add("cde.com");
    }
   
    
    @Override
    public void connect(String serverhost) throws Exception {
        
        if(bannedsites.contains(serverhost.toLowerCase()))
        {
              throw new Exception("bannedsites acess");
        }
        i.connect(serverhost);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  
}
