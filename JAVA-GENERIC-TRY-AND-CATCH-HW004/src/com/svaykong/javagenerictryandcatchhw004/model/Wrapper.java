package com.svaykong.javagenerictryandcatchhw004.model;

import com.svaykong.javagenerictryandcatchhw004.practicegenericandtrycatch.model.CustomException;
import java.util.*;

public class Wrapper<T> {

    private final Set<T> items = new TreeSet<>();

    public Wrapper() {}

    public void addItems(T item) {
        try {
            if(!items.add(item)) {
                duplicateException(item);
            }
            else {
                items.add(item);
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e + ": Inputted null value");
        }
    }

    public T getItems(int i) {
        ArrayList<T> indexArray = new ArrayList<>(items);
        return indexArray.get(i);
    }

    public int size() {
        return items.size();
    }

    public void duplicateException(T item) throws CustomException {
        System.out.println("Duplicate value: " + item);
    }

}


