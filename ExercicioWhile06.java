import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ExercicioWhile06{
    
    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args) {
        
        JOptionPane.showInputDialog(null, "Tipo                                            " + " Nome                                           " + "                                             Valor\n" +
        "Bolos                                   " + "       Bolo Brigadeiro                                        " + "                               R$: 29.50\n" +
        "Bolos                                   " + "       Bolo Floresta Negra                                 " + "          " + "                    R$: 2.00\n" + 
        "Bolos                                   " + "       Bolo Leite com Nutella                            " + "          " + "                    R$: 29.23\n" + 
        "Bolos                                   " + "       Bolo Mousse de Chocolate                               " + "                   R$: 7.10\n" + 
        "Bolos                                   " + "       Bolo Nega Maluca                                                " + "                  R$: 19.33\n" +
        "Doces                                  " + "       Bomba de Creme                                        " + "                           R$: 17.71\n" +
        "Doces                                  " + "       Bomba de Morando                                              "  + "                 R$: 4.82\n" + 
        "Sanduíches                             " + "  Filé-Mingnon com fitras e cheddar                          " + "         R$: 21.16\n" + 
        "Sanduíches                       " + "        Hambúrger com queijo, chapingnon e rúcula                " + "R$: 12.70\n" + 
        "Sanduíches                               " + "Provolone com salame                                                        " + "R$: 19.33\n" + 
        "Sanduíches                          " + "     Vegetariano de berinjela                                                     " + "R$: 28.22\n" +
        "Pizzas                                   " + "      Calabresa                                                                                " + "R$: 8.98\n" +
        "Pizzas                                   " + "      Napolitana                                                                                " + "R$: 0.42\n" +
        "Pizzas                                   " + "      Peruana                                                                                   " + "R$: 18.36\n" +
        "Pizzas                                   " + "      Portuguesa                                                                             " + "R$: 27.50\n"
        );
    }
}