//tela Home utilizando o pacote JOptionPane
//importa o pacote JOptionPane e Scanner para entrada de dados

import javax.swing.JOptionPane;
import java.util.Scanner;

public class tela01 {
    public static void main(String[] args){
        Home();
    }
//Menus 

    private static void telaInstitucional() {
        JOptionPane.showMessageDialog(null, "Tela Institucional");
    }

    private static void telaSobre() {
        JOptionPane.showMessageDialog(null, "Tela Sobre a Kolping");
    } 

    private static void telaCursos() {
        JOptionPane.showMessageDialog(null, "Tela Cursos e Programas");
} 
    private static void telaUnidades() {
        JOptionPane.showMessageDialog(null, "Tela Unidades e Contato");
    } 

    private static void telaBlog() {
        JOptionPane.showMessageDialog(null, "Tela Blog Institucional");
    } 

    private static void telaTrabalhe() {
        JOptionPane.showMessageDialog(null, "Tela Trabalhe Conosco");
    } 

    private static void telaFale() {
        JOptionPane.showMessageDialog(null, "Tela Fale Conosco");
    } 

    private static void telaLogin() {
        JOptionPane.showMessageDialog(null, "Tela Login");
    } 

    private static void telaDigite() {
        JOptionPane.showMessageDialog(null, "Tela Doação");
    } 
    
    private static void Home() {

    //introdução das variáveis String disponíveis

        String opcao = "";

        while (!opcao.equals("0")){
            String texto = "KOLPING - Aldeia de Carapicuíba\n";

            //opções de tela, não tenho certeza e a formtação está correta então usei o Copilot 

            String endereco = "Rua Exemplo, 123";
            String cidade = "Carapicuíba";

                String texto = "KOLPING - Aldeia de Carapicuíba\n"

                    + endereco + ", " + cidade + "\n\n"
                    + "\n\n"

                    + "2 - Institucional\n"
                    + "3 - Sobre a Kolping\n"
                    + "4 - Cursos e Programas\n"
                    + "5 - Unidades e Contato\n"
                    + "6 - Blog Institucional\n"
                    + "7 - Trabalhe Conosco\n"
                    + "8 - Fale Conosco\n"
                    + "9 - Login\n"
                    + "10 - Doação\n"
                    + "0 - Sair\n"
                    
                    + "Digite o número da opção:";

            opcao = JOptionPane.showInputDialog(texto);
            //condições para as entradas do usuário

            if (opcao == null) {
                //encerramento pelo usuário
                opcao = "0";
            }

            opcao = opcao.trim();
            //processamento das possíveis saídas ao usuário, não lembro de o 0 é obrigatório

            switch (opcao){

                case "2":
                  telaInstitucional();
                  break;

                case "3":
                  telaSobre();
                  break;

                case "4":
                  telaCursos();
                  break;

                case "5":
                  telaUnidades();
                  break;

                case "6":
                  telaBlog();
                  break;

                case "7":
                  telaTrabalhe();
                  break;

                case "8":
                  telaFale();
                  break;

                case "9":
                  telaLogin();
                  break;

                case "10":
                  telaDigite();
                  break;

                case "0":
                break;

                default: 
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }

        }

    JOptionPane.showMessageDialog(null, "Aguardamos sua visita.");

    }

}
