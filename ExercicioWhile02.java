import javax.swing.JOptionPane;

public class ExercicioWhile02{

     public static void main(String[] args) {
         
        int idade = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite a sua idade\nPara sair digite um número maior que \"128\""));
        
        while (idade<=128) {
            idade = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite a sua idade.\nPara sair digite um número maior que \"128\""));
        }
     }
}