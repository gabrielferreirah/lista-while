import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ExercicioWhile04{

    public static void main(String[] args) {

        int quantidadeCarros = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de carros",
         "Exercício While 04", JOptionPane.PLAIN_MESSAGE));

        String modelo = "";
        double preco = 0;
        int anoCarro = 0;
        int totalCarros = 0;
        int mediaAno = 0;
        double mediaPreco = 0;

        while (totalCarros != quantidadeCarros) {
            modelo = JOptionPane.showInputDialog(null, "Modelo do carro",
                "Exercício While 04", JOptionPane.PLAIN_MESSAGE).trim();

            preco =Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do carro",
                "Exercício While 04", JOptionPane.PLAIN_MESSAGE));

            int anoCarros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano do carro",
                "Exercício While 04", JOptionPane.PLAIN_MESSAGE));

            totalCarros = totalCarros + 1; 
            anoCarro = anoCarro +anoCarros;
        }
        mediaPreco = preco/quantidadeCarros;

        mediaAno = anoCarro/quantidadeCarros;
        JOptionPane.showMessageDialog(null, 
        "\nMedia de valor dos carros: R$ " + mediaPreco + 
        "\nMedia de anos dos carros: " + mediaAno);
    }
}