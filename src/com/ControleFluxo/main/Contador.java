package com.ControleFluxo.main;
import com.ControleFluxo.Exception.ParametrosInvalidosException;
import java.util.Scanner;

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
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
           e.notifyError(); 
        } finally {
            input.close();
        }
            
    }



    static void contar(String num1, String num2) throws ParametrosInvalidosException{
            throw new ParametrosInvalidosException(num1,num2);
        
           // int incremento = num2 - num1;
          //  for (int i = 1; i <= incremento; i++) {
            //    System.out.println("Contando... "+i);
          //  }
        
    }
       
}



