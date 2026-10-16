import java.util.Scanner;
import javax.swing.JOptionPane;

public class tela03 {

    static void telaSobre() {

        JOptionPane.showMessageDialog(null, "SOBRE A KOLPING\n\n"

                + "História\n"
                + "A Comunidade Kolping da Aldeia de Carapicuíba, fundada em 06/09/1981, integra a\n"
                + "Kolping Brasil, associação sem fins lucrativos que atua na superação da pobreza\n"
                + "por meio de formação e trabalho. A Kolping nasceu na Alemanha, em 1849, criada\n"
                + "pelo Pe. Adolfo Kolping, e chegou ao Brasil em 1923, em São Paulo.\n\n"
                + "Missão\n"
                + "Transformar as realidades sociais no exercício da cidadania através do\n"
                + "desenvolvimento profissional, ambiental, cultural, religioso e comunitário.\n\n"
                + "Valores\n"
                + "Fé em Cristo, Solidariedade, Honestidade, Responsabilidade e Qualidade.");
 
        JOptionPane.showMessageDialog(null, "DADOS DA INSTITUIÇÃO\n\n"

                + "Razão social: Comunidade Kolping da Aldeia de Carapicuíba\n"
                + "CNPJ: 50.527.316/0001-04\n"
                + "Área de atuação: Promoção da cidadania\n"
                + "Fundação: 06/09/1981\n"
                + "Responsável: Donato de Oliveira");
 
        if (confirmar("Deseja ver como doar?")) {
            telaDoacao();
        }

    }

}