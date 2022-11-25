public class Main {
    public static void main(String[] args) {
       System.out.println( palindrome("palabra"));
        System.out.println(palindrome("Anita lava la tina"));
    }

    public static boolean palindrome(String word){

        word = word.toLowerCase().replace(" ","");
        String response = new StringBuilder(word).reverse().toString();

        return response.equals(word);
    }
}