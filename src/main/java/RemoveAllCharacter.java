import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class RemoveAllCharacter {
    /**
     * Return a String that has all the character of a String removed.
     * You could either use a for loop to build a new String that excludes a character, or you could cleverly use
     * the replaceAll method of String to replace a character with a blank space.
     *
     * Here are the docs for String: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param str A string.
     * @param ch A string containing a single character which should be removed from str.
     * @return str, without any characters of type ch.
     */
    public String removeAll(String str, String ch){
        String[] characters = str.split("");
        ArrayList<String> characterList = new ArrayList<>();

        // copy elements over into list
        for (int i = 0; i < characters.length; i++) {
            characterList.add(characters[i]);
        }

        for (int i = 0; i < characterList.size(); i++) {
            if (characterList.get(i).equals(ch)) {
                characterList.remove(i);
                i = 0;
            }
        }


        String result = "";

        for (int i = 0; i < characterList.size(); i++) {
            result += characterList.get(i);
        }

        return result;
    }
}