package academy.devdojo.maratonajava.javacore.O_exception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(nums[3]);
    }
    /* CHECKED:
        - Exceções causadas em tempo de COMPILAÇÃO
        - Filhas da classe Exception diretamente (IOException, SQLException, MalformedURLException...)
        - Somos obrigados a tratá-las (se não o código nem compila)
    */

    /* UNCHECKED:
        - Exceções causadas em tempo de EXECUÇÃO
        - Exceções da classe RuntimeException e suas filhas.
        - 99% das vezes é erro do dev (estourou índice do array, tentou acessar objeto nulo...)
        - Não somos obrigados a tratá-las.
    */


}