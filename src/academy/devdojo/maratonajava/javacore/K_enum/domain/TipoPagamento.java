package academy.devdojo.maratonajava.javacore.K_enum.domain;

public enum TipoPagamento {
    DEBITO { // Essas chaves são como se estivéssemos começando uma classe!!
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);
    // É um métdo que foi criado apenas para ser sobrescrito. Por isso o abstract.
    // Podemos utilizar essa parada daqui para criar um métdo que o seu comportamento será
    // decidido com base pelas "classes/enumeracoes/valor_da_enumeracao" que vão sobrescrever.

    // Métdos abstratos não podem ter corpo, apenas o ";" ali.
    // Toda "classe/enumeração" deve sobrescrever este métod.

    // Aí não precisamos encher de if's e vai de acordo com um padrão de projeto (strategy?).
}
