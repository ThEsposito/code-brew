package academy.devdojo.maratonajava.javacore.G_associacao._exercicios.domain;

public class Local {
    private String endereco;
    private String complemento; // Número do apartamento, etc (opcional)

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public Local(String endereco, String complemento) {
        this.endereco = endereco;
        this.complemento = complemento;
    }

    public String info() {
        String result = "Endereço: ";
        result += endereco;
        if (complemento != null) {
            result += ". Complemento: " + complemento;
        }
        return result;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
