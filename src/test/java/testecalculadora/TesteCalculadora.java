package testecalculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import ifes.poo.calculadora.cgt.AplCalculadora;
import ifes.poo.calculadora.cgt.Tradutor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Alessandro Eller
 */
public class TesteCalculadora {
    
    AplCalculadora aplCalculadora;
    Tradutor tradutor;
    
    @Before    
    public void Before(){
        aplCalculadora = new AplCalculadora();
        tradutor = new Tradutor();
    }
    
    
    
    @Test 
   public void testeCalculoPena()
   {
        String traducao = tradutor.traduzir("( 1 + 2 )");
        Double resultado = aplCalculadora.calculo(traducao); 
        Assert.assertEquals(3,0 ,resultado);
   }
   
   @Test 
   public void testeCalculoLeve()
   {
        String traducao = tradutor.traduzir("( 1 + 2 ) * 3");
        Double resultado = aplCalculadora.calculo(traducao); 
        Assert.assertEquals(9,0 ,resultado);
   }
   
   @Test 
   public void testeCalculoMedio()
   {
        String traducao = tradutor.traduzir("( 1 + 2 ) * 3 + 2");
        Double resultado = aplCalculadora.calculo(traducao); 
        Assert.assertEquals(11,0 ,resultado);
   }
   
   @Test 
   public void testeCalculoPesado()
   {
        String traducao = tradutor.traduzir("( ( 1 + 2 ) * ( 3 + 2 ) ) / 3");
        Double resultado = aplCalculadora.calculo(traducao);
        System.out.println(resultado);
        Assert.assertEquals(5,0 ,resultado);
   }
}