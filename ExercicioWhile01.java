import javax.swing.JOptionPane;

public class ExercicioWhile01{
    
    public static void main(String[] args) {
         
        String nome = JOptionPane.showInputDialog("Digite seu nome.\nSe desejar sair digite \"Fim\"");

        while (!nome.equalsIgnoreCase("fim")) {
            nome = JOptionPane.showInputDialog("Digite seu nome.\nSe desejar sair digite \"Fim\"");
        }

     }
}