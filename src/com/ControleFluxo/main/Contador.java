package com.ControleFluxo.main;
import com.ControleFluxo.Exception.ParametrosInvalidosException;
import java.util.Scanner;

FALTA DOCUMENTAR ESSE DESAFIO !!!


/** <h1>Contador</h1>
 * Classe principal contendo interação inicialmente com o usuario atravez da 'import java.util.Scanner'.
 * <p>
 * Atuando conferindo 2(Dois) números inteiros e imprimindo por 'sout' (System.out.println()) a incrementação entre partes.
 * <p>
 * 
 */


public class Contador {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        String numero1 = input.nextLine();
        System.out.println("Digite segundo valor: ");
        String numero2 = input.nextLine();
        
        try {
            verificarVariaveis(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
           e.notifyError(); 
        } finally {
            input.close();
        }
            
    }

/**
 * Verifica se as entradas do terminal
 * @param num1
 * @param num2
 * @throws ParametrosInvalidosException
 */

    static void verificarVariaveis(String num1, String num2) throws ParametrosInvalidosException{
        if (num1.contains(".") || num2.contains(".")) {
            throw new ParametrosInvalidosException(0);
        }else if(num1.isEmpty() || num2.isEmpty()){
            throw new ParametrosInvalidosException(1);
        }else if(num1.matches(".*[a-zA-Z]+.*") || num2.matches(".*[a-zA-Z]+.*")){
            throw new ParametrosInvalidosException(3);
        }else{
            int numFinal1 = Integer.parseInt(num1);
            int numFinal2 = Integer.parseInt(num2);
            boolean verificado = contar(numFinal1, numFinal2);
            if (verificado == !false) {
                int incremento = numFinal2 - numFinal1;
                for (int i = 1; i <= incremento; i++) {
                    System.out.println("Contando... "+i);
                }
            }
        }
    }

    static boolean contar(int num1, int num2) throws ParametrosInvalidosException{
        if (num1 > num2) {
            throw new ParametrosInvalidosException(2);
        }
        return true;
    }
}


