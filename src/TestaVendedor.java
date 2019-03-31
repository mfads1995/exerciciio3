/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestaVendedor {
    
    
    
      public static void main(String[] args){
                  
         
        Vendedor v1 = new Vendedor();
        v1.nomev = "michael";
        v1.idv = "485";
        v1.departamento = "tintas";
        
         
        Vendedor v2 = new Vendedor();
        v2.nomev = "lucas";
        v2.idv = "7885";
        v2.departamento = "pisos";
         
        Vendedor v3 = new Vendedor();
        v3.nomev = "leo";
        v3.idv = "4537";
        v3.departamento = "loucas";
        
       
             
            System.out.println("o nome do vendedor é: " + v1.nomev);
             System.out.println("o nome do vendedor é: " + v2.nomev);
              System.out.println("o nome do vendedor é: " + v3.nomev);
        
        
        
        
        
        
        
        
    }
    
}
