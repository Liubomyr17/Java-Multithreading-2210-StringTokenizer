package com.company;

/*

2210 StringTokenizer
Using a StringTokenizer, split the query into parts by delimiter delimiter.
Example
getTokens ("level22.lesson13.task01", ".")
Returns
{"level22", "lesson13", "task01"}

Requirements:
1. The getTokens method should use a StringTokenizer.
2. The getTokens method must be public.
3. The getTokens method must accept two parameters of type String.
4. An array of type String returned by the getTokens method must be
filled correctly (according to the condition of the task).


*/

import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        String[] result = getTokens("level22.lesson13.task01", ".");
        for(String s : result){
            System.out.println(s);
        }
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[tokenizer.countTokens()];
        for (int i = 0; i < result.length; i++) {
            result[i] = tokenizer.nextToken();
        }

        return result;
    }
}
