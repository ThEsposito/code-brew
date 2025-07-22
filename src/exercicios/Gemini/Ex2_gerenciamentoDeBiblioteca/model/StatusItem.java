package exercicios.Gemini.Ex2_gerenciamentoDeBiblioteca.model;

public enum StatusItem {
    DISPONIVEL("Item disponível para empréstimo"){
        @Override
        public boolean podeEmprestar() {
            return true;
        }
    },
    EMPRESTADO("Item emprestado"){
        @Override
        public boolean podeEmprestar() {
            return false;
        }
    },
    EM_MANUTENCAO("Item em manutenção"){
        @Override
        public boolean podeEmprestar() {
            return false;
        }
    },
    EXTRAVIADO("Item extraviado"){
        @Override
        public boolean podeEmprestar() {
            return false;
        }
    };

    private final String DESCRICAO;
    public abstract boolean podeEmprestar();

    StatusItem(String descricao){
        this.DESCRICAO = descricao;
    }

    public String getDESCRICAO() {
        return DESCRICAO;
    }
}
