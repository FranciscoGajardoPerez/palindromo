public class Main {
    public static void main(String[] args) {
       System.out.println( palindromo("palabra"));
        System.out.println(palindromo("Anita lava la tina"));
    }

    public static boolean palindromo(String word){

        word = word.toLowerCase().replace(" ","");
        String response = new StringBuilder(word).reverse().toString();

        return response.equals(word);
    }
}