import javax.swing.JOptionPane;
import java.util.Scanner;

public class tela07 {

    static void telaTrabalheConosco() {
        JOptionPane.showMessageDialog (null, "TRABALHE CONOSCO\n\n"

                + "Preencha o formulário para fazer parte da\n"
                + "Comunidade Kolping da Aldeia de Carapicuíba.");
 
        String nome = lerCampo("Nome:");
        String email = lerCampo("E-mail:");
        String area = lerCampo("Área de interesse:");
        String curriculo = lerCampo("Currículo (digite o nome do arquivo, ex.: curriculo.pdf):");
 
        // Validação: vamos juntando os erros em um texto

        String erros = "";
 
        if (nome.isEmpty()) {
            erros = erros + "- Informe seu nome\n";
        }

        if (!emailValido(email)) {
            erros = erros + "- Informe um e-mail válido\n";
        }

        if (area.isEmpty()) {
            erros = erros + "- Selecione uma área de interesse\n";
        }

        if (curriculo.isEmpty()) {
            erros = erros + "- Anexe seu currículo\n";
        } else {
            String arquivo = curriculo.toLowerCase();
            if (!arquivo.endsWith(".pdf") && !arquivo.endsWith(".doc") && !arquivo.endsWith(".docx")) {
                erros = erros + "- Arquivo inválido (use PDF, DOC ou DOCX)\n";
            }
        }
 
        if (!erros.isEmpty()) {
           JOptionPane.showMessageDialog(null, "Corrija os campos:\n\n" + erros);
            return; // volta para a Home
        }
 
        JOptionPane.showMessageDialog(null, "Candidatura enviada com sucesso!\n\n"
        
                + "Nome: " + nome + "\n"
                + "E-mail: " + email + "\n"
                + "Área de interesse: " + area + "\n"
                + "Currículo: " + curriculo);

    }

}
