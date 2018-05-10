package com.JUnit.intellij.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTestEjercicio6 {

    private SimpleCalculator calculator;

    @Test
    public void povOf2() {

        this.calculator = new SimpleCalculator();

        int[] enteros = {0,1,5,6};

        String retorno;

        for (int i=0; i<enteros.length;i++){

            retorno=this.calculator.povOf2(enteros[i]);
            String valor=""+(int)Math.pow(2,enteros[i]);
            Assert.assertEquals("Es lo esperado",valor,retorno);
            System.out.println("Potencia en base 2 de "+enteros[i]+" = "+valor);

        }
        System.out.println("Todos correctos vamos a por el 100");

        int cien= Integer.parseInt(this.calculator.povOf2(100));
        Assert.assertTrue("cierto",(int)Math.pow(2,100)==cien);

    }

}