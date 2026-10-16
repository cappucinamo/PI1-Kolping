import java.util.Scanner;
import javax.swing.JOptionPane;

public class tela04 {

    static void telaCursos() {
        String opcao = "";
 
        while (!opcao.equals("0")) {
            opcao = perguntar("CURSOS E PROGRAMAS\n\n"

                    + "1 - Opção 1\n"
                    + "2 - Opção 2\n"
                    + "3 - Opção 3\n"
                    + "4 - Opção 4\n"
                    + "0 - Voltar\n\n"
                    + "Digite o número da opção:");
 
            if (opcao == null) {
                opcao = "0";
            }

            opcao = opcao.trim();
 
            if (opcao.equals("1") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4")) {
                mostrarCurso(opcao);
            } else if (!opcao.equals("0")) {
                JOptionPane.showMessageDialog(null, "Opção inválida. Digite de 0 a 4.");
            }

        }

    }
 
    // Mostra os dados de um curso 

    static void mostrarCurso(String numero) {

        JOptionPane.showMessageDialog(null, "OPÇÃO " + numero + "\n\n"

                + "Nome do curso ou programa: a definir\n"
                + "Texto descritivo: a definir\n"
                + "Faixa etária: a definir\n"
                + "Turnos: a definir");
    }  
    
}
