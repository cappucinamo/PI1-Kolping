// ============================================================
// Projeto Integrador ADS I - FATEC
// Protótipo desktop - Comunidade Kolping da Aldeia de Carapicuíba
// Telas 1 a 10, usando o pacote JOptionPane (Java básico)
// ============================================================

import javax.swing.JOptionPane;

public class KolpingApp {

    // ---------- Dados da instituição (constantes) ----------

    static final String ENDERECO = "R. do Cabo, 20 - Jardim Leonor";
    static final String CEP = "06340-050";
    static final String CIDADE = "Carapicuíba - SP";
    static final String TELEFONE = "(11) 4186 3730";
    static final String EMAIL = "ckaldeiacarapicuiba@ig.com.br";
    static final String CONTATO = "Wagner Carneiro de Santana";
    static final String SITE_MATRIZ = "https://www.kolping.org.br"; // conferir o endereço oficial

    static final int TAMANHO_MINIMO_SENHA = 6;

    // ---------- Dados guardados enquanto o programa está aberto ----------

    static boolean logado = false;
    static String emailCadastrado = "";
    static String senhaCadastrada = "";

    // ---------- Programa principal ----------

    public static void main(String[] args) {
        telaHome();
    }

    // ============================================================
    // TELA 1 - HOME (menu principal)
    // ============================================================

    static void telaHome() {
        String opcao = "";

        while (!opcao.equals("0")) {
            String texto = "KOLPING - Aldeia de Carapicuíba\n"
                    + ENDERECO + ", " + CIDADE + "\n\n"
                    + "2 - Institucional\n"
                    + "3 - Sobre a Kolping\n"
                    + "4 - Cursos e Programas\n"
                    + "5 - Unidades e Contato\n"
                    + "6 - Blog Institucional\n"
                    + "7 - Trabalhe Conosco\n"
                    + "8 - Fale Conosco\n"
                    + "9 - Login\n"
                    + "10 - Doação\n"
                    + "0 - Sair\n\n"
                    + "Digite o número da opção:";

            opcao = perguntar(texto);

            // Se o usuário fechar a janela ou clicar em Cancelar, encerra
            if (opcao == null) {
                opcao = "0";
            }

            opcao = opcao.trim();

            switch (opcao) {
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
                    telaTrabalheConosco();
                    break;

                case "8":
                    telaFaleConosco();
                    break;

                case "9":
                    telaLogin();
                    break;

                case "10":
                    telaDoacao();
                    break;

                case "0":
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }

        JOptionPane.showMessageDialog(null, "Aguardamos sua visita.");
    }

    // ============================================================
    // TELA 2 - INSTITUCIONAL
    // ============================================================

    static void telaInstitucional() {
        JOptionPane.showMessageDialog(null, "INSTITUCIONAL\n\n"
                + "Sobre nós\n"
                + "Texto institucional a definir (história, missão, valores e forma de atuação).\n\n"
                + "Nossa atuação\n"
                + "Texto a definir (áreas de atuação social, educacional e comunitária).");

        if (confirmar("Cursos: lista e detalhes dos cursos oferecidos.\nDeseja ver os cursos?")) {
            telaCursos();
        }

        if (confirmar("Doações: formas de contribuir com a instituição.\nDeseja ver como doar?")) {
            telaDoacao();
        }
    }

    // ============================================================
    // TELA 3 - SOBRE A KOLPING
    // ============================================================

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

    // ============================================================
    // TELA 4 - CURSOS E PROGRAMAS
    // ============================================================

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

    // ============================================================
    // TELA 5 - UNIDADES E CONTATO
    // (o mapa do wireframe foi substituído por uma tela de texto)
    // ============================================================

    static void telaUnidades() {
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

    // ============================================================
    // TELA 6 - BLOG INSTITUCIONAL
    // ============================================================

    static void telaBlog() {
        JOptionPane.showMessageDialog(null, "BLOG INSTITUCIONAL\n\n"
                + "Post em destaque\n"
                + "Título do post: a definir\n"
                + "Data e autoria: a definir\n\n"
                + "Outros posts\n"
                + "Título do post: a definir\n"
                + "Título do post: a definir\n\n"
                + "Calendário público: a definir\n"
                + "Próximos eventos: a definir");
    }

    // ============================================================
    // TELA 7 - TRABALHE CONOSCO
    // ============================================================

    static void telaTrabalheConosco() {
        JOptionPane.showMessageDialog(null, "TRABALHE CONOSCO\n\n"
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
            erros = erros + "- Informe uma área de interesse\n";
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

    // ============================================================
    // TELA 8 - FALE CONOSCO
    // ============================================================

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

    // ============================================================
    // TELA 9 - LOGIN / CADASTRO
    // ============================================================

    static void telaLogin() {
        // Se já está autenticado, volta para a Home
        if (logado) {
            JOptionPane.showMessageDialog(null, "Você já está autenticado.");
            return;
        }

        String opcao = perguntar("ACESSE A SUA CONTA OU CADASTRE-SE\n\n"
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

    // Formulário de login
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

    // Formulário de cadastro
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

    // ============================================================
    // TELA 10 - DOAÇÃO
    // (conteúdo ainda a definir pelo grupo)
    // ============================================================

    static void telaDoacao() {
        JOptionPane.showMessageDialog(null, "DOAÇÃO\n\n"
                + "Contribua com a Comunidade Kolping da Aldeia de Carapicuíba.\n\n"
                + "Formas de doar: a definir\n"
                + "Dúvidas: " + TELEFONE + " | " + EMAIL);
    }

    // ============================================================
    // FUNÇÕES AUXILIARES (usadas por várias telas)
    // ============================================================

    // Mostra uma pergunta e devolve o texto digitado (null se o usuário cancelar)
    static String perguntar(String texto) {
        return JOptionPane.showInputDialog(texto);
    }

    // Lê um campo de formulário; se o usuário cancelar, devolve texto vazio
    static String lerCampo(String rotulo) {
        String valor = JOptionPane.showInputDialog(rotulo);

        if (valor == null) {
            return "";
        }

        return valor.trim();
    }

    // Pergunta Sim/Não e devolve true se o usuário clicar em Sim
    static boolean confirmar(String mensagem) {
        int resposta = JOptionPane.showConfirmDialog(null, mensagem, "Kolping",
                JOptionPane.YES_NO_OPTION);

        return resposta == JOptionPane.YES_OPTION;
    }

    // Validação simples de e-mail: precisa de texto antes do @ e de um ponto depois dele
    static boolean emailValido(String email) {
        int arroba = email.indexOf("@");
        int ponto = email.lastIndexOf(".");

        return arroba > 0 && ponto > arroba + 1 && ponto < email.length() - 1;
    }

}
