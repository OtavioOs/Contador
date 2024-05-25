package com.ControleFluxo.Exception;

public class ParametrosInvalidosException extends Exception {
    int codigoErro;
    String firstString;
    String secunndString;

    public ParametrosInvalidosException(String firstString, String secunndString){
        this.firstString = firstString;
        this.secunndString = secunndString;
    }

    private void verificarParametro(){
        if (firstString.contains(".") || secunndString.contains(".")) {
            codigoErro = 0;
        }else if(firstString.isEmpty() || secunndString.isEmpty()){
            codigoErro = 1;
        }else if(firstString.matches(".*[a-zA-Z]+.*") || secunndString.matches(".*[a-zA-Z]+.*")){
            codigoErro = 3;
        }else{
            int numFinal1 = Integer.parseInt(firstString);
            int numFinal2 = Integer.parseInt(secunndString);
        }
            

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
