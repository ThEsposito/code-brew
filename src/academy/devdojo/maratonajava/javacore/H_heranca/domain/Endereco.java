package academy.devdojo.maratonajava.javacore.H_heranca.domain;

public class Endereco {
    private String rua;
    private String cep;

    public String getRua() {
        return rua;
    }
//
//    public void imprime(){
//        Pessoa p = new Pessoa();
//        p.nome = "blabla"; // Já que nome está como protected, dá pra acessar aqui por
//                          // estar no mesmo pacote.
//    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
