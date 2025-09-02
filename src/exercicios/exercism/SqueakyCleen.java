package exercicios.exercism;

public class SqueakyCleen {
    static String clean(String identifier){
        String result = identifier.replaceAll(" ", "_");
        StringBuilder result2 = new StringBuilder();

        int n = result.length();
        int i=0;

        while(i<n){
            if(result.charAt(i) == '-'){
                result2.append(Character.toUpperCase(result.charAt(i+1)));
                i++; // Ignora o tracinho
            } else {
                result2.append(result.charAt(i));
            }
            i++;
        }

        String[] numbers =  {"4","3","0","7","7"};
        String[] letters = {"a","e","o","i","t"};
        String result3 = result2.toString();
        for(i=0; i<numbers.length; i++){
            result3 = result3.replaceAll(numbers[i], letters[i]);
        }
        StringBuilder sb2 = new StringBuilder();
        for(i=0; i<result3.length(); i++){
            if(Character.isLetterOrDigit(result3.charAt(i))){
                sb2.append(result3.charAt(i));
            }
        }
        return sb2.toString();
    }
}
