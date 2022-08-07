package com.company.kyu7;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
    public static void main(String[] args) {
        List<Object> list = List.of(1, 2, "a", "b", "aasf", "1", "123", 231);
        System.out.println(filterList(list));
    }
    public static List<Object> filterList(final List<Object> list) {
        List<Object> newList = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getClass().getSimpleName().equals("Integer")) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
