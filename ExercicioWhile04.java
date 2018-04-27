import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ExercicioWhile04{

    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args) {

        int quantidadeCarros = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de carros",
         "Exercício While 04", JOptionPane.PLAIN_MESSAGE));

        String modelo = "";
        double preco = 0;
        int anoCarro = 0;
        int totalCarros = 0;
        int mediaAno = 0;
        int quantidadeA = 0, quantidadeG = 0;
        double mediaPreco = 0;

        while (totalCarros != quantidadeCarros) {
            modelo = JOptionPane.showInputDialog(null, "Modelo do carro",
                "Exercício While 04", JOptionPane.PLAIN_MESSAGE).trim().toLowerCase();

            preco =Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do carro",
                "Exercício While 04", JOptionPane.PLAIN_MESSAGE));

            int anoCarros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano do carro",
                "Exercício While 04", JOptionPane.PLAIN_MESSAGE));

            char letra = modelo.charAt(0);

            if (letra == 'a') {
                quantidadeA = quantidadeA + 1;
            } else if (letra == 'g') {
                quantidadeG = quantidadeG + 1;
            }

            totalCarros = totalCarros + 1; 
            anoCarro = anoCarro +anoCarros;
        }
        mediaPreco = preco/quantidadeCarros;

        mediaAno = anoCarro/quantidadeCarros;
        JOptionPane.showMessageDialog(null, 
        "\nMedia de valor dos carros: R$ " + df2.format(mediaPreco) + 
        "\nMedia de anos dos carros: " + mediaAno +
        "\nQuantidade de carros que começam com a letra A: " + quantidadeA +
        "\nQuantidade de carros que começam com a letra G: " + quantidadeG);
    }
}