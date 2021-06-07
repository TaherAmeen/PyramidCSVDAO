/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidcsvdao;

import java.util.*;
import java.io.File;
/**
 *
 * @author hesham
 */
public class PyramidCSVDAO {

    public List<Pyramid> readPyramidFromCSV(String path)throws Exception{
        
        Scanner sc = new Scanner(new File(path));
        sc.useDelimiter(",|\\n");
        List<Pyramid> Pyramids = new ArrayList<Pyramid>();
        try{
            for(int i=0;i<16;i++){
                System.out.println(sc.next());
                System.out.println("-------------");
            }
            while(sc.hasNext()){
                
                Pyramid pmd = new Pyramid();
                
                pmd.setPharaoh(sc.next());
                pmd.setAncientName(sc.next());
                pmd.setModernName(sc.next());
                pmd.setDynasty(sc.next());
                pmd.setSite(sc.next());
                pmd.setBase1(sc.next());
                pmd.setBase2(sc.next());
                pmd.setHeight(sc.next());
                pmd.setSlope(sc.next());
                pmd.setVolume(sc.next());
                pmd.setLatitude(sc.next());
                pmd.setLongitude(sc.next());
                pmd.setType(sc.next());
                pmd.setLepsius(sc.next());
                pmd.setMaterial(sc.next());
                pmd.setComment(sc.next());
                
                Pyramids.add(pmd);
                
            }
            
            sc.close();
            
        }catch(Exception e){
            
        }
        return Pyramids;
    }
    
}
