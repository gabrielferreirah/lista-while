import javax.swing.JOptionPane;

public class ExercicioWhile03{

    public static void main(String[] args) {
        
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu Peso", "Exercício 03", 
        JOptionPane.PLAIN_MESSAGE));

        int totalDePessoas = 0;
        while (peso > 0  && peso < 301) {
            peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu Peso", "Exercício",
            JOptionPane.PLAIN_MESSAGE));

            totalDePessoas = totalDePessoas + 1;
        }

        JOptionPane.showMessageDialog(null, "Quantidade de pessoas que informaram seu peso: " + totalDePessoas);
    }
}