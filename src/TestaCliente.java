/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestaCliente {
    

      public static void main(String[] args){
        
        
        Cliente c1 = new Cliente();
        c1.cpf = "8732782882";
        c1.endereco = "rua 26, numero 12";
        c1.nomec = "jhon";
        
         
        Cliente c2 = new Cliente();
        c2.cpf = "27382782882";
        c2.endereco = "rua 37, numero 132";
        c2.nomec = "david";
 
        Cliente c3 = new Cliente();
        c3.cpf = "8882782882";
        c3.endereco = "rua 266, numero 1267";
        c3.nomec = "thiago"; 
    
    
      System.out.println("o nome do cliente é:" + c1.nomec);
         System.out.println("o nome do cliente é:" + c2.nomec);
          System.out.println("o nome do cliente é:" + c3.nomec);
    
}
}