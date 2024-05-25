package com.ControleFluxo.Exception;
/**
 * <h1>Parametros Invalidos Exception</h1>
 * <p>
 * Exceção customizada, utilizada para verificar qual tipo de Exceção é enviada pelo <b>"try-cacth"</b>
 * <ul>
 *  <li>
 *      Método
 *  <b>notifyError</b> - Casos verificado e mensagem de exception capturada.
 * 
 *   </li>
 *  <li>
 *      Contrutor
 *  <b>ParametrosInvalidosException()</b> - Recepciona qual entrada de valor para memorizar codigoErro
 *  </li>
 * </ul>
 */
public class ParametrosInvalidosException extends Exception {
    int codigoErro;
    String firstString;
    String secunndString;

    public ParametrosInvalidosException(int codigoErro){
        this.codigoErro = codigoErro;
    }
    /**
     * <h3>Metodo <b>notifyError</3></b>
     * Metodo sem parametro para selecionar o caso verificado.
     * @param codigoErro Variavel memorizada pelo Contrutor.
     */
    public void notifyError(){
        switch (codigoErro) {
            case 0:
                System.out.println("Erro encontrado. Não pode ser número 'Fracionado'.");
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
            case 4:
                System.out.println("Erro encontrado. Primeiro Parametro não pode ser maior.");
                break;
            default: System.out.println("Erro não especificado");
                break;
        }
    }
}