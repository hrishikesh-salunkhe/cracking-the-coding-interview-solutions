//Is Unique: Implement an algorithm to determine if a string has all unique characters. 

//Q: What if you can not use additional data structures?
//A: We will have to check each character against each character of the string. O(n^2) time.

//Inputs = "abcde", "abcdcba", "aabcd"
//Outputs = true, false, false

import java.util.*;

public class isUnique{
    public static void main(String args[]){

        String[] input = {"abcde", "abcdcba", "aabcd"};
        String[] output = {"true", "true", "true"};

        for(int i=0; i<input.length; i++){

            //SHORTCUT: If the string is greater than the total number of English alphabets, return false
            if(input[i].length() > 26){
                output[i] = "false";
                continue;
            }

            HashSet<String> set = new HashSet<String>();

            //ALTERNATIVE: You could create an array of size 26 (total alphabets) and maintain boolean values if the characters are encountered

            for(int j=0; j<input[i].length(); j++){
                
                String c = String.valueOf(input[i].charAt(j));

                if(set.contains(c)){
                    output[i] = "false";
                    continue;
                }else{
                    set.add(c);
                }
            }
        }

        for(int i=0; i<output.length; i++){
            System.out.println(output[i]);
        }
    }
}