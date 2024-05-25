package com.ControleFluxo.main;
import com.ControleFluxo.Exception.ParametrosInvalidosException;
import java.util.Scanner;
/** <h1>Contador</h1>
 * Classe principal contendo interação inicialmente com o usuario atravez da 'import java.util.Scanner'.
 * <p>
 * Atuando conferindo 2(Dois) números inteiros e imprimindo por 'sout' (System.out.println()) a incrementação entre partes.
 * <p>
 */
public class Contador {
    /**
     * Metodo Main, principal disparador do codigo. Sem args.
     * @param input Acionador da classe Scanner, interação com usuário no términal.
     * @param numero1 String recebi o valor digitado.
     * @param numero2 String recebe o valor digitado.
     * @throws ParametrosInvalidosException Exceção disparada em casos de tipos de dados 
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        String numero1 = input.nextLine();
        System.out.println("Digite segundo valor: ");
        String numero2 = input.nextLine();
        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
           e.notifyError(); 
        } finally {
            input.close();
        }
    }
    /**
     * Metodo para verificar os valores e empilhar corretamente o exercicio.<p>
     * Verifica se os valores digitados são na verdade <b>Fracionado, vazio ou letra.</b>
     * @param firstString   String recebeu do valor digitado
     * @param secunndString     String recebeu do valor digitado
     * @throws ParametrosInvalidosException Acionador de throw, cria um disparador de Exceções com codigo de exceção.
     * @param numFinal1 Quando verdadeiro para valor digitado ser número inteiro, é convertido de String para Int
     * @param incremento Subtraí as entradas para descobrir a diferença de valores 
     */
    static void contar(String firstString, String secunndString) throws ParametrosInvalidosException{
        if(firstString.contains(".") || secunndString.contains(".")) {
            throw new ParametrosInvalidosException(0);
        }else if(firstString.isEmpty() || secunndString.isEmpty()){
            throw new ParametrosInvalidosException(1);
        }else if(firstString.matches(".*[a-zA-Z]+.*") || secunndString.matches(".*[a-zA-Z]+.*")){
            throw new ParametrosInvalidosException(3);
        }else{
            int numFinal1 = Integer.parseInt(firstString);
            int numFinal2 = Integer.parseInt(secunndString);
            if(numFinal1 < numFinal2) {
                int incremento = numFinal2 - numFinal1;
                for(int i = 1; i <= incremento; i++) {
                    System.out.println("Contando... "+i);
                }
            }else{
                throw new ParametrosInvalidosException(4);
            }
        }
    }
}