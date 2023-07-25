package frac;

public class Main {
    public static void main(String[] args) {
        String on = "aaaa";
        String tw = "bbbb";
        System.out.println(mergeAlternately(on, tw));

    }
    public static String mergeAlternately(String wordOne, String wordTwo){

        //add stringbuilder since it is mutable
        StringBuilder result = new StringBuilder();

        // var for iteration
        int i = 0;

        // while words still have characters
        while(i < wordOne.length() || i < wordTwo.length()){
            if(i < wordOne.length()){
                result.append(wordOne.charAt(i));
            }

            if(i < wordTwo.length()){
                result.append(wordTwo.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}
