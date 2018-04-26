import javax.swing.JOptionPane;

public class ExercicioWhile02{

     public static void main(String[] args) {
         
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Digite a sua idade\nPara sair digite um número maior que \"128\"",
            "Exercício Estrutura While 02", JOptionPane.PLAIN_MESSAGE));
        
        int totalPessoas = 0;
        
        while (idade<=128) {
            idade = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Digite a sua idade\nPara sair digite um número maior que \"128\"",
            "Exercício Estrutura While 02", JOptionPane.PLAIN_MESSAGE));

            totalPessoas = totalPessoas + 1;

            System.out.println("total de pessoas: " + totalPessoas);
        }
     }
}