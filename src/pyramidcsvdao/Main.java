/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidcsvdao;
import java.util.*;
/**
 *
 * @author hesham
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> Pyramids = pDAO.readPyramidFromCSV("D:\\Workshop\\ITI AI\\Java UMl\\Pyramids.csv");
        
        int i=0;
        for(Pyramid p:Pyramids){
            System.out.println("#"+(i++)+" Paroah: "+p.getPharaoh());
        }
    }
}
