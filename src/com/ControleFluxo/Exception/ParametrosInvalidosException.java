package com.ControleFluxo.Exception;

public class ParametrosInvalidosException extends Exception {
    
    boolean verificar(int num1, int num2){
        boolean verificado = false;
        if (num1 > num2) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            verificado = true;
        }
        return verificado;
    }
}
