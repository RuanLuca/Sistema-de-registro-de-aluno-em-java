//Ruan Luca Feliciano de Carvalho     RM: 562218
//Felipe Conte Ferreira               RM: 562248
//Rafael Malaguti                     RM: 561830
//Lincon Roncato                      RM: 565944

package br.com.fiap.main;

import br.com.fiap.bean.Aluno;
import javax.swing.JOptionPane;
import java.time.LocalDate;

public class MainAluno {
    public static void main(String[] args) {

        try {
            // Data atual
            LocalDate dataAtual = LocalDate.now();

            // Aluno1 usando construtor vazio
            Aluno aluno1 = new Aluno();
            aluno1.setRegistroMatricula(562218);
            aluno1.setNomeCompleto("Ruan Luca Feliciano de Carvalho");
            aluno1.setAnoDeNascimento(2007);

            // Aluno2 usando construtor vazio
            Aluno aluno2 = new Aluno();
            aluno2.setRegistroMatricula(562248);
            aluno2.setNomeCompleto("Felipe Conte Ferreira");
            aluno2.setAnoDeNascimento(2006);

            // Aluno3 JOptionPane
            Aluno aluno3 = new Aluno();
            aluno3.setRegistroMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do Aluno 3:")));
            aluno3.setNomeCompleto(JOptionPane.showInputDialog("Digite o nome completo do Aluno 3:"));
            aluno3.setAnoDeNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do Aluno 3:")));

            // Aluno4 JOptionPane
            Aluno aluno4 = new Aluno();
            aluno4.setRegistroMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do Aluno 4:")));
            aluno4.setNomeCompleto(JOptionPane.showInputDialog("Digite o nome completo do Aluno 4:"));
            aluno4.setAnoDeNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do Aluno 4:")));

            //Exibição dos dados
            String mensagem = String.format(
                    "Aluno 1 - RM: %d, Nome: %s, Idade: %d\n" +
                            "Aluno 2 - RM: %d, Nome: %s, Idade: %d\n" +
                            "Aluno 3 - RM: %d, Nome: %s, Idade: %d\n" +
                            "Aluno 4 - RM: %d, Nome: %s, Idade: %d\n",
                    aluno1.getRegistroMatricula(), aluno1.getNomeCompleto(), aluno1.calcularIdade(dataAtual),
                    aluno2.getRegistroMatricula(), aluno2.getNomeCompleto(), aluno2.calcularIdade(dataAtual),
                    aluno3.getRegistroMatricula(), aluno3.getNomeCompleto(), aluno3.calcularIdade(dataAtual),
                    aluno4.getRegistroMatricula(), aluno4.getNomeCompleto(), aluno4.calcularIdade(dataAtual)
            );

            JOptionPane.showMessageDialog(null, mensagem);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor incorreto");
        }
    }
}
