import javax.swing.JOptionPane;
import java.util.Scanner;

public class tela09 {
    
     static void telaLogin() {

        // Se já está autenticado, volta para a Home

        if (logado) {
            JOptionPane.showMessageDialog(null, "Você já está autenticado.");
            return;
        }
 
        String opcao = JOptionPane.showInputDialog("ACESSE A SUA CONTA OU CADASTRE-SE\n\n"

                + "1 - Entrar\n"
                + "2 - Cadastre-se\n"
                + "3 - Perdeu sua senha?\n"
                + "0 - Voltar\n\n"
                + "Digite o número da opção:");
 
        if (opcao == null) {
            return;
        }
 
        switch (opcao.trim()) {
            case "1":
                entrar();
                break;

            case "2":
                cadastrar();
                break;

            case "3":
                recuperarSenha();
                break;

            case "0":
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");

        }

    }
 
    // Formulário login

    static void entrar() {
        String login = lerCampo("Nome de usuário ou e-mail:");
        String senha = lerCampo("Senha:");
 
        String erros = "";

        if (login.isEmpty()) {
            erros = erros + "- Informe seu usuário ou e-mail\n";
        }

        if (senha.isEmpty()) {
            erros = erros + "- Informe sua senha\n";
        }

        if (!erros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Corrija os campos:\n\n" + erros);
            return;
        }
 
        // Para comparar textos em Java usamos equals (e não ==)

        if (login.equals(emailCadastrado) && senha.equals(senhaCadastrada)) {

            logado = true;
 
            if (confirmar("Lembre-me neste computador?")) {
                JOptionPane.showMessageDialog(null, "Login feito! Sessão mantida por período longo.");
            } else {
                JOptionPane.showMessageDialog(null, "Login feito! Sessão válida só até fechar o programa.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");
        }

    }
 
    // Formulário cadastro

    static void cadastrar() {
        String email = lerCampo("Endereço de e-mail:");
        String senha = lerCampo("Senha:");
 
        String erros = "";

        if (!emailValido(email)) {
            erros = erros + "- Informe um e-mail válido\n";
        }

        if (senha.isEmpty()) {
            erros = erros + "- Crie uma senha\n";
        } else if (senha.length() < TAMANHO_MINIMO_SENHA) {
            erros = erros + "- A senha deve ter ao menos " + TAMANHO_MINIMO_SENHA + " caracteres\n";
        }

        if (!erros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Corrija os campos:\n\n" + erros);
            return;
        }
 
        if (email.equals(emailCadastrado)) {
            JOptionPane.showMessageDialog(null, "Este e-mail já possui conta. Use a opção Entrar.");
            return;
        }
 
        emailCadastrado = email;
        senhaCadastrada = senha;
        logado = true; // autentica automaticamente
        JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
    }
 
    // Link extra "Perdeu sua senha?"

    static void recuperarSenha() {
        String email = lerCampo("Digite seu e-mail:");
 
        if (!emailValido(email)) {
            JOptionPane.showMessageDialog(null, "Informe um e-mail válido.");
            return;
        }

    JOptionPane.showMessageDialog(null, "Se o e-mail existir, enviaremos um link de redefinição.");
    
    }

}
