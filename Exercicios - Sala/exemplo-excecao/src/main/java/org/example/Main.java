package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Boolean fim = false;

        while(!fim) {
            String sNum1 = JOptionPane.showInputDialog("Digite um número: ");
            String sNum2 = JOptionPane.showInputDialog("Digite outro número: ");

            try {
                int num1 = Integer.parseInt(sNum1);
                int num2 = Integer.parseInt(sNum2);

                JOptionPane.showMessageDialog(null, num1 / num2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números\n" + e, "Erro",
                        JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Divisão por 0\n" + e, "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        System.exit(0);


    }
}