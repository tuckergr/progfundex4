package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<String, Double> godMap = new HashMap<String, Double>();

        findCityandAvg(godMap);

        System.out.println(godMap);

    }


    static HashMap<String, Double> findCityandAvg(HashMap<String, Double> a){
        System.out.println("Please enter a city name: ");
        String city  = input.nextLine();

        a.put(city,findAvg);
        return a;

    }

    static double findAvg(){
        for(int i = 0; i< ; i++)
    }
















}
