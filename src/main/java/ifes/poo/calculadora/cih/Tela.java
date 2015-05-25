/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.poo.calculadora.cih;

import java.util.Scanner;

/**
 *
 * @author Alessandro Eller
 */
public class Tela {

    public String  telaInicial() {
        System.out.println("Digite a expressão");
        Scanner leitor = new Scanner(System.in);
        return leitor.nextLine();
    }
    
    public void telaFinal(Double result) {
        System.out.println("Resultado = " + result);
    } 
}