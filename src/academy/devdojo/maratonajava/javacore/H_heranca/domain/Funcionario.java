// Pra não precisar ficar usando os mesmos atributos e métodos que outra Classe
// já tem (como a classe Pessoa), voce pode utilizar a heranca para utilizar tudo isso
// em uma outra classe (como essa). Pra isso, existe a keyword "extends", usada na
// declaração da classe.

// Na Associação, usamos o termo "tem" e "pertence". Uma pessoa TEM um endereço
// Um professor TEM varios seminarios. Os jogadores PERTENCEM a um time.
// Na herança, usamos o "é um...". Um funcionário É uma pessoa.

// Assim, o funcionário EXTENDE as funcionalidades de uma pessoa (classe mais genérica)
// e adiciona funcionalidades próprias (mais especificas e especialziadas).
// Isto está relacionado com a BAIXA COESÃO.


// No entanto, a heranca também está associada a um ALTO ACOPLAMENTO, o que pode não
// ser muito ideal e causar mais confusões no futuro.
// O professor evita ao máximo o uso de herança, embora seja muito "poderoso" se utilizar
// de forma correta (2 ocasiões):

// Utilizamos heranca quando queremos extendar funcionalidades de uma classe (e manter um
// RELACIONAMENTO entre elas) e quando queremos utilizar POLIMORFISMO.

// Quanto mais pra baixo (pense num diagrama em árvore), mais específico é essa classe

package academy.devdojo.maratonajava.javacore.H_heranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    static{
        System.out.println("Dentro do Bloco de Inicialização Estático de Funcionario");
    }

    {
        System.out.println("Dentro do 1o Bloco de Inicialização Não-Estático de Funcionario");

    }

    {
        System.out.println("Dentro do 2o Bloco de Inicialização Não-Estático de Funcionario");
    }

    public Funcionario(String nome){
        super(nome); // Chama o construtor da classe pai (superclasse)
        System.out.println("Dentro do construtor de Funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        // O private também impede as subclasses de acessarem o atributo diretamente.
        // Pra isso, podemos colocar o atributo como protected:

        // No entanto, todas as outras classes que estão no mesmo pacote também terão
        // acesso, mesmo que não sejam subclasses (como se estivesse público).

        System.out.println("Eu, "+this.nome+" recebi meu salário de "+this.salario);
        //daria erro, se o atrib nome for private (seria necessário usar um getter)
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
