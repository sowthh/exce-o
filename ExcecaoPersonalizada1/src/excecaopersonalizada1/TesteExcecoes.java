/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecaopersonalizada1;

/**
 *
 * @author Admin
 */
public class TesteExcecoes {
    public static void main(String[] args) {
       
        Classe1 obj1 = new Classe1();
        Classe2 obj2 = new Classe2();
        
       
        try {
            obj1.metodoQueLancaExcecao();
        } catch (ExcecaoPersonalizada1 e) {
            System.out.println("Capturada: " + e.getMessage());
        }
 
      
        try {
            obj2.metodoQueLancaExcecao();
        } catch (ExcecaoPersonalizada2 e) {
            System.out.println("Capturada: " + e.getMessage());
        }
    }
}
