/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.poo.calculadora.cgt;

import ifes.poo.calculadora.cdp.Divisao;
import ifes.poo.calculadora.cdp.Multiplicacao;
import ifes.poo.calculadora.cdp.Operador;
import ifes.poo.calculadora.cdp.Soma;
import ifes.poo.calculadora.cdp.Subtracao;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author Alessandro Eller
 */
public class AplCalculadora {

    Map<String, Operador> operacoes;
    Stack <Double> pilha = new Stack<Double>();
   
    public AplCalculadora()
    {
        
        operacoes = new HashMap<>();
        operacoes.put("+", new Soma());
        operacoes.put("/", new Divisao());
        operacoes.put("-", new Subtracao());
        operacoes.put("*", new Multiplicacao());

    }
    
    public Double calculo(String expressao) {

        String[] comandos = expressao.split(" ");
        
        for (String comando: comandos)
        {
    
            if (operacoes.containsKey(comando))
            {
                Operador operador = operacoes.get(comando);
                double valor1 = (double) pilha.pop();
                double valor2 = (double) pilha.pop();
                double resultado = operador.operacao(valor2, valor1);
                pilha.push(resultado);
            }
            else{
                
                double valor = Double.parseDouble(comando);
                pilha.push(valor);                
            }
        }        
        return pilha.pop();        
    }

   

}
