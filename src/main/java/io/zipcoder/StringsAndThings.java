package io.zipcoder;


import java.util.Locale;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */


    public Integer countYZ(String input){
        int count = 0;
        // first convert string to lower case so that result is not case-sensitive
        input = input.toLowerCase();
        // next separate all words in string using space as delimiter
        String [] stringList = input.split(" ");
        // loop through our string array and get rid of any extra whitespaces in each string (in case there was a double space)
        for (int i = 0; i < stringList.length; i++){
            stringList[i] = stringList[i].trim();
            // check to see if the last letter in the string is "z" or "y" and add to count if true
            if (stringList[i].endsWith("z") || stringList[i].endsWith("y")){
                count ++;
            }
        }

        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */

    /** References: https://www.geeksforgeeks.org/stringbuilder-replace-in-java-with-examples/
     *             https://stackoverflow.com/questions/7775364/how-can-i-remove-a-substring-from-a-given-string
     */
    public String removeString(String base, String remove){
        int substringLength = remove.length();
        String baseLower = base.toLowerCase();
        String removeLower = remove.toLowerCase();
        boolean containsSubstring =  baseLower.contains(removeLower);
        // if base does not contain remove then return base
        if (!containsSubstring){
            return base;
        }

        // Find the beginning of substring remove in base string and remove it until no more
        // instance of substring occur
        StringBuilder editBase = new StringBuilder(base);
        while ((base.toLowerCase()).contains(removeLower)){
            int subStart = (base.toLowerCase()).indexOf(removeLower);
            int subEnd = subStart + substringLength;
            editBase = editBase.replace(subStart, subEnd, "");
            base = editBase.toString();

        }
        return base;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        return null;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        return null;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        return null;
    }
}
