package exercicios.Gemini.Ex2_gerenciamentoDeBiblioteca.domain;
import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<ItemBiblioteca> itens;

    {
        itens = new ArrayList<ItemBiblioteca>();
    }

    public void adicionarItem(ItemBiblioteca item){
        itens.add(item);
    }

    public String listarTodosItens(){
        String listagemDosItens = "";
        for (ItemBiblioteca item: itens){
            listagemDosItens += item.exibirDetalhes() + "\n\n";
        }
        return listagemDosItens;
    }

    public void emprestarItem(String ID_UNICO_item){
        for(ItemBiblioteca item: itens){
            if(item.getID_UNICO().toString().equals(ID_UNICO_item)){
                if(item.getStatus().podeEmprestar()) {
                    item.setStatus(StatusItem.EMPRESTADO);
                    System.out.println("Item emprestado com sucesso!");
                } else {
                    System.out.println(item.getTitulo() + " está indisponível!");
                }
                return;
            }
        }
        System.out.println("Item não encontrado no catálogo");
    }

    public void devolverItem(String ID_UNICO_item){
        for(ItemBiblioteca item: itens){
            if(item.getID_UNICO().toString().equals(ID_UNICO_item)){
                if (item.getStatus() != StatusItem.DISPONIVEL) {
                    item.setStatus(StatusItem.DISPONIVEL);
                    System.out.println("Item emprestado com sucesso!");
                } else {
                    System.out.println("Este item já estava disponível!");
                }
                return;
            }
        }
        System.out.println("Item não encontrado no catálogo!");
    }

    public ArrayList<ItemBiblioteca> buscarItemPorTitulo(String titulo){
        ArrayList<ItemBiblioteca> itensComEsseTitulo = new ArrayList<ItemBiblioteca>();
        for(ItemBiblioteca item: itens){
            if(item.getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                itensComEsseTitulo.add(item);
            }
        }

        return itensComEsseTitulo;
    }
}
