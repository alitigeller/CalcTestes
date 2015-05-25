/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.poo.calculadora.cdp;

/**
 *
 * @author Alessandro Eller
 */
public class Divisao implements Operador {

    @Override
    public double operacao(double valor1, double valor2) {
        
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            System.out.println("Divisão por 0");
            return 0;
        }
    }

}