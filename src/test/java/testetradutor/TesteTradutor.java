package testetradutor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import ifes.poo.calculadora.cgt.Tradutor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Alessandro Eller
 */
public class TesteTradutor {
    
    Tradutor tradutor;
    
    @Before    
    public void Before(){
        tradutor = new Tradutor();
    }
    
    
    
    @Test 
   public void testeTraducaoPena()
   {
        String resultado = tradutor.traduzir("( 1 + 2 )");
        Assert.assertEquals("1 2 +" ,resultado);
   }
   
   @Test 
   public void testeTraducaoLeve()
   {
        String resultado = tradutor.traduzir("( 1 + 2 ) * 3");
        Assert.assertEquals("1 2 + 3 *" ,resultado);
   }
   
   @Test 
   public void testeTraducaoMedio()
   {
        String resultado = tradutor.traduzir("( 1 + 2 ) * 3 + 2");
        Assert.assertEquals("1 2 + 3 * 2 +" ,resultado);
   }
   
   @Test 
   public void testeTraducaoaPesado()
   {
        String resultado = tradutor.traduzir("( ( 1 + 2 ) * ( 3 + 2 ) ) / 3");
        Assert.assertEquals("1 2 + 3 2 + * 3 /" ,resultado);
   }
}