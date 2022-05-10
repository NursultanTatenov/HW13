package com.company;

import java.util.Arrays;

public class Class {
    private int numbers;
    private String words;
    private int [] arrays;


    public Class (int number,String word, int ... array){
        numbers=number;
        words=word;
        arrays=array;

    }

    public int getNumbers() {
        return numbers;
    }

    public String getWords() {
        return words;
    }

    public int[] getArrays() {
        return arrays;
    }

}

