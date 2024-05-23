package com.ControleFluxo.main;
import com.ControleFluxo.Exception.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int numero1 = input.nextInt();
        System.out.println("Digite segundo valor: ");
        int numero2 = input.nextInt();

        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    void contar(int num1, int num2) throws ParametrosInvalidosException{
        throw new ParametrosInvalidosException.verificar(num1,num2);
    }
}


