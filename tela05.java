import javax.swing.JOptionPane;
import java.util.Scanner;

public class tela05 {

    static void telaUnidades() {

        // O mapa do wireframe eu não sei fazer, então vou fazer uma tela de texto mesmo

        String opcao = "";
 
        while (!opcao.equals("0")) {
            opcao = perguntar("UNIDADES E CONTATO\n\n"

                    + "1 - Unidade matriz\n"
                    + "2 - Unidade Aldeia de Carapicuíba\n"
                    + "0 - Voltar\n\n"
                    + "Digite o número da opção:");
 
            if (opcao == null) {
                opcao = "0";
            }
            
            opcao = opcao.trim();
 
            if (opcao.equals("1")) {
                JOptionPane.showMessageDialog(null, "UNIDADE MATRIZ\n\nSite: " + SITE_MATRIZ);
            } else if (opcao.equals("2")) {
                JOptionPane.showMessageDialog(null, "UNIDADE ALDEIA DE CARAPICUÍBA\n\n"

                        + "Endereço: " + ENDERECO + "\n"
                        + "CEP " + CEP + ", " + CIDADE + "\n"
                        + "Telefone: " + TELEFONE + "\n"
                        + "Contato: " + CONTATO + "\n"
                        + "E-mail: " + EMAIL + "\n"
                        + "Horários de atendimento: a definir");

            } else if (!opcao.equals("0")) {
                JOptionPane.showMessageDialog(null, "Opção inválida. Digite 0, 1 ou 2.");
            }

        }

    }
    
}