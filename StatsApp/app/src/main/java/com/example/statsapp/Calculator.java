package com.example.statsapp;
import java.util.*;
public class Calculator {
    public static double getMean(ArrayList<Double> list1){
        double num = 0.0;
        for (double i : list1){
            num += i;
        }
        return num/list1.size();
    }
    public static double getVariance(ArrayList<Double> list2){
        double mean = getMean(list2);
        double var = 0.0;
        for (double i : list2){
            double temp = (i-mean);
            var += temp*temp;
        }
        return var/list2.size();
    }
    public static double getStdDev(ArrayList<Double> list3){
        double var2 = getVariance(list3);
        return Math.sqrt(var2);
    }
}