package com.example.madt_2_lab_wordcounter;

import org.junit.Test;
import static org.junit.Assert.*;

public class WordCounterTest
{
    @Test
    public void testGetCharsCount()
    {
        String input = "Hello, world";
        int result = CounterWord.getCharsCount(input);
        assertEquals(12, result);
    }
    @Test
    public void testGetWordsCount()
    {
        String input = "Sentence for test";
        int result = CounterWord.getWordsCount(input);
        assertEquals(3, result);
    }
}
