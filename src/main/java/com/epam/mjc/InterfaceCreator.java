package com.epam.mjc;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return input ->{
            for (String s:input) {
                if (!Character.isUpperCase(s.charAt(0))) {
                    return false;
                }

            }return true;
    };
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {

        return list ->{
            List <Integer> ret = new LinkedList<>();
            for (Integer x:list){
                ret.add(x);}
            for (Integer x:ret){
                if(x%2==0){
                    list.add(x);}
                }

             };


        }


    public Supplier<List<String>> filterCollection(List<String> values) {
        return () ->{

            List<String> tmp = new LinkedList<>(values);
            for (String per: tmp){
                char first = per.charAt(0);
                char last = per.charAt(per.length()-1);
                String [] words = per.split(" ");
                if ((!Character.isUpperCase(first))|| (last != '.') || words.length<=3 ){
                    values.remove(per);}


            }
            return  values;};
        }


    public Function<List<String>, Map<String, Integer>> stringSize() {
        return x ->{
            Map<String, Integer> tmp = new HashMap<>();
            for (String per : x){
                int coun = per.length();
                tmp.put(per, coun);
            }
            return tmp;
        };
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return (list1, list2) -> {
            ArrayList <Integer> result = new ArrayList<>();
           result.addAll(list1);
           result.addAll(list2);
           return result;
    };
}}
