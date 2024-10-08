/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecaopersonalizada1;

/**
 *
 * @author Admin
 */
class Classe1 {
    public void metodoQueLancaExcecao() throws ExcecaoPersonalizada1 {
        throw new ExcecaoPersonalizada1("Exceção Personalizada 1 lançada!");
    }
}
 

class Classe2 {
    public void metodoQueLancaExcecao() throws ExcecaoPersonalizada2 {
        throw new ExcecaoPersonalizada2("Exceção Personalizada 2 lançada!");
    }
}