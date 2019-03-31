/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestaMaterial {
    
    
    public static void main(String[] args){
        
        Material m1 = new Material();
        m1.nomep = "tiolo";
        m1.idp = "3847" ;  
        m1.peso = 1;
        
         
        Material m2 = new Material();
        m2.nomep = "cimento";
        m2.idp = "3447" ;  
        m2.peso = 50;
        
         
        Material m3 = new Material();
        m3.nomep = "agrifilito";
        m3.idp = "33337" ;  
        m3.peso = 17;
        
         System.out.println("o item pesquisado foi:: " + m1.nomep);
           System.out.println("o item pesquisado foi:: " + m2.nomep);
            System.out.println("o item pesquisado foi:: " + m3.nomep);
        
    
}
}
