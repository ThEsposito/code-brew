/* Crie um sistema que erencia seminários

O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado

Um aluno poderá estar em apenas um seminário
Um seminário poderá ter nenhum ou vários alunos
Um professor poverá ministrar vários seminários
Um seminário deve ter um local

Campos básicos (excluindo relacionamento)
seminário: titulo
aluno: nome e idade
professor: nome, especialidade
local: endereco
*/

// É UMA BOA IDEIA DE PROJETO PRA SE APRIMORAR (com inputs, etc)

package academy.devdojo.maratonajava.javacore.G_associacao._exercicios.test;

import academy.devdojo.maratonajava.javacore.G_associacao._exercicios.domain.Aluno;
import academy.devdojo.maratonajava.javacore.G_associacao._exercicios.domain.Local;
import academy.devdojo.maratonajava.javacore.G_associacao._exercicios.domain.Professor;
import academy.devdojo.maratonajava.javacore.G_associacao._exercicios.domain.Seminario;

public class GerenciadorDeSeminarios {
    public static void main(String[] args) {
        Local local1 = new Local("Rua Bélgica, 54");
        Aluno aluno1 = new Aluno("Theo", 19);
        Aluno aluno2 = new Aluno("Valentina", 17);
        Aluno aluno3 = new Aluno("Lucas", 29);
        Professor prof1 = new Professor("Bebela Espósito (mamãe)", "Gastronomia");
        Aluno[] alunosSeminario1 = new Aluno[]{aluno1, aluno2, aluno3};

        Seminario seminario1 = new Seminario("Fazendo seu primeiro arroz soltinho <3", local1);
        for (Aluno aluno : alunosSeminario1) {
            aluno.setSeminario(seminario1);
        }
        Seminario[] seminariosDisponiveis = new Seminario[]{seminario1};
        prof1.setSeminarios(seminariosDisponiveis);

        seminario1.setAlunos(alunosSeminario1);
        System.out.println("**Seminário de Hoje**");
        seminario1.gerarRelatorio();

        System.out.println("\n**Professor(a) responsável**");
        prof1.imprimeDados();
    }
}
