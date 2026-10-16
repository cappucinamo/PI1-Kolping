import javax.swing.JOptionPane;
import java.util.Scanner;

public class tela08 {

    static void telaFaleConosco() {
        JOptionPane.showMessageDialog(null, "FALE CONOSCO\n\n"

                + "Envie sua dúvida ou mensagem para a\n"
                + "Comunidade Kolping da Aldeia de Carapicuíba.\n\n"
                + "Contato\n"
                + "Endereço: " + ENDERECO + ", CEP " + CEP + ", " + CIDADE + "\n"
                + "Telefone: " + TELEFONE + "\n"
                + "E-mail: " + EMAIL);
 
        String nome = lerCampo("Nome:");
        String email = lerCampo("E-mail:");
        String assunto = lerCampo("Assunto:");
        String texto = lerCampo("Mensagem:");
 
        String erros = "";
 
        if (nome.isEmpty()) {
            erros = erros + "- Informe seu nome\n";
        }

        if (!emailValido(email)) {
            erros = erros + "- Informe um e-mail válido\n";
        }

        if (assunto.isEmpty()) {
            erros = erros + "- Informe o assunto\n";
        }

        if (texto.isEmpty()) {
            erros = erros + "- Escreva sua mensagem\n";
        }
 
        if (!erros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Corrija os campos:\n\n" + erros);
            return;
        }
 
    JOptionPane.showMessageDialog(null, "Mensagem enviada! Entraremos em contato em breve.");
    
    }

}
