import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ExercicioWhile05{

    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args) {

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null,
         "Digite um número", "ExercicioWhile05", JOptionPane.PLAIN_MESSAGE));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null,
         "Digite outro número", "ExercicioWhile05", JOptionPane.PLAIN_MESSAGE));

        int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
         "              MENU" +
         "\n1                |Somar" +
         "\n2                |Subtrair" +
         "\n3                |Multiplicar" +
         "\n4                |Dividir" +
         "\n5                |Sair","MENU", JOptionPane.PLAIN_MESSAGE));

         double soma = numero1 + numero2;
         double subtracao = numero1-numero2;
         double multiplicacao = numero1 * numero2;
         double divisao = numero1/numero2;

         while (menu>0 && menu<5) {
            if (menu == 1) {
                 JOptionPane.showMessageDialog(null, "Soma: " + (numero1) + " + " + (numero2) + " = " + df2.format(soma));
            }else if (menu == 2) {
                JOptionPane.showMessageDialog(null, "Subtração: " + (numero1) + " - " + (numero2) + " = " + df2.format(subtracao));
            }else if (menu == 3) {
                JOptionPane.showMessageDialog(null, "Multiplicação: " + (numero1) + " * " + (numero2) + " = " + df2.format(multiplicacao));                 
            }else if (menu == 4) {
                JOptionPane.showMessageDialog(null, "Divisão: " + (numero1) + " / " + (numero2) + " = " + df2.format(divisao));
            }
                
            numero1 = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite um número", "ExercicioWhile05", JOptionPane.PLAIN_MESSAGE));
            numero2 = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite outro número", "ExercicioWhile05", JOptionPane.PLAIN_MESSAGE));

            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
            "              MENU" +
            "\n1                |Somar" +
            "\n2                |Subtrair" +
            "\n3                |Multiplicar" +
            "\n4                |Dividir" +
            "\n5                |Sair","MENU", JOptionPane.PLAIN_MESSAGE));
             
         }
    }
}