package com.example.madt_2_lab_wordcounter;

import android.content.Context;
import android.widget.Toast;

public class CounterWord
{
    public static int getCharsCount(String phrase)
    {
        return phrase.length();
    }
    public static int getWordsCount(String phrase)
    {
        if (phrase == null) return 0;
        int WordCount = 0;
        boolean word = false;
        for(int i=0; i< phrase.length(); i++)
        {
            if(phrase.charAt(i)==' ' || phrase.charAt(i)==',' || phrase.charAt(i)=='.')
            {
                word = false;
            }
            else if (!word)
            {
                WordCount++;
                word = true;
            }
        }
        return WordCount;
    }
}
