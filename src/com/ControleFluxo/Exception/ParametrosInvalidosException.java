package com.ControleFluxo.Exception;

public class ParametrosInvalidosException extends Exception {
    int codigoErro;

    public ParametrosInvalidosException(int codeError){
        this.codigoErro = codeError;
    }

    public void notifyError(){
        switch (codigoErro) {
            case 0:
                System.out.println("Erro encontrado. Não pode ser numero 'Fracionado'.");
                break;
            case 1:
                System.out.println("Erro encontrado. Não pode estar vazio.");
                break;
            case 2:
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
                break;
            case 3:
                System.out.println("Erro encontrado. Não pode conter Letras.");
                break;
            default: System.out.println("Erro não especificado");
                break;
        }
        
    }
}
