package exercicios.estruturasdedadosI.stacks.exercicio_aula3;

public class BalanceamentoDeParenteses {
    public static boolean isBalanced(String s){
        Pilha p = new Pilha();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                p.push('(');
            } else if(s.charAt(i) == ')') {
                if(p.isEmpty()) return false;
                p.pop();
            }
        }
        // Se estiver vazia, todos os parênteses foram fechados
        return p.isEmpty();
    }
}
