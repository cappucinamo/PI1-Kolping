import java.util.Scanner;
import javax.swing.JOptionPane;

public class tela02 {

    static void telaInstitucional() {
        JOptionPane.showMessageDialog(null, "INSTITUCIONAL\n\n"

                + "Sobre nós\n"
                + "Texto institucional a definir (história, missão, valores e forma de atuação).\n\n"
                + "Nossa atuação\n"
                + "Texto a definir (áreas de atuação social, educacional e comunitária).");
 
        //Cursos

        if (confirmar("Cursos: lista e detalhes dos cursos oferecidos.\nDeseja ver os cursos?")) {
            telaCursos();
        }

        if (confirmar("Doações: formas de contribuir com a instituição.\nDeseja ver como doar?")) {
            telaDoacao();
        }

    }

}
