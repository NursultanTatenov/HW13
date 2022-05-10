package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Class clas=new Class(12,"years", 12,32,2,5236,247,7234);

        System.out.println("Number "+clas.getNumbers()+", word "+clas.getWords()+", array ["+ Arrays.toString(clas.getArrays())+"]");
        }



    }

