package exercicios.estruturasdedadosI.stacks;

public class PilhaEstaticaSequencialTest01 {
    public static void main(String[] args) {
        PilhaEstaticaGenerica<String> p = new PilhaEstaticaGenerica<String>();

        for(int i=0; i<110; i++){
            try {
                p.push(String.valueOf(i));
            } catch(Exception e) {
                System.out.println("Achei exception no push");
                break;
            }
        }
        while(!p.isEmpty()){
            System.out.println(p.top());
            try {
                System.out.println(p.pop());
            } catch(Exception e) {
                System.out.println("Achei exception no pop");
            }
        }
    }
}
