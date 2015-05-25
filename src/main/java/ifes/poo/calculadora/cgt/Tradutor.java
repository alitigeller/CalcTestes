/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.poo.calculadora.cgt;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author aeller
 */
public class Tradutor {

    private HashMap<String, Integer> operacoes = new HashMap<>();

    public Tradutor() {
        operacoes.put("+", 1);
        operacoes.put("-", 1);
        operacoes.put("/", 2);
        operacoes.put("*", 2);
    }

    public String traduzir(String expressao) {
        Stack pilha = new Stack();
        String traducao = "";
        
        for (String caracter : expressao.split(" ")) {
            if (operacoes.containsKey(caracter)) {
                if (!pilha.empty()) {
                    if (!pilha.peek().equals("(")) {                        
                        while (!pilha.empty() && operacoes.get((String)pilha.peek()) > operacoes.get(caracter)) {
                            traducao = traducao.concat((String) pilha.pop() + " ");                            
                        }
                    }
                }
                pilha.push(caracter);
            } else {
                if (caracter.equals("(")) {
                    pilha.push(caracter);
                } else {
                    if (caracter.equals(")")) {
                        while (!pilha.peek().equals("(")) {
                            traducao = traducao.concat((String) pilha.pop() + " ");
                        }
                        pilha.pop();
                    } else {
                        traducao = traducao.concat(caracter + " ");
                    }
                }
            }
        }

        while (!pilha.empty()) {
            traducao = traducao.concat((String) pilha.pop() + " ");
        }

        return traducao.substring(0, traducao.length() - 1);
    }

}