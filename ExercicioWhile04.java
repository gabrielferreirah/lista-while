import javax.swing.JOptionPane;

public class ExercicioWhile04{

    public static void main(String[] args) {

        int quantidadeCarros = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de carros",
         "Exercício While 04", JOptionPane.PLAIN_MESSAGE));

        double preco = 0;
        int anoCarro = 0;
        int totalCarros = 0;
        double mediaAno = 0;
        double mediaPreco = 0;
        int anoAtual = 2018;

        while (totalCarros != quantidadeCarros) {
            String modelo = JOptionPane.showInputDialog(null, "Modelo do carro",
                "Exercício While 04", JOptionPane.PLAIN_MESSAGE);

            preco =Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do carro",
                "Exercício While 04", JOptionPane.PLAIN_MESSAGE));

            int anoCarros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano do carro",
                "Exercício While 04", JOptionPane.PLAIN_MESSAGE));

            totalCarros = totalCarros + 1;
            anoCarro = anoCarro +anoCarros;
        }
        mediaPreco = preco/quantidadeCarros;
        JOptionPane.showMessageDialog(null, "Media de valor dos carros: " + mediaPreco);

        mediaAno = anoCarro/quantidadeCarros;
        JOptionPane.showMessageDialog(null, "Media de anos dos carros: " + mediaAno);
    }
}