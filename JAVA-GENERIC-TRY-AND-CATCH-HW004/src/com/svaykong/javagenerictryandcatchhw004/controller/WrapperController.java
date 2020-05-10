package com.svaykong.javagenerictryandcatchhw004.controller;

import com.svaykong.javagenerictryandcatchhw004.model.Wrapper;

public class WrapperController {

    public static void start() {
        Wrapper<Integer> integerWrapper = new Wrapper<>();
        try {
            integerWrapper.addItems(1);
            integerWrapper.addItems(2);
            integerWrapper.addItems(1);
            integerWrapper.addItems(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nList all from inputted");

        for(int i = 0; i < integerWrapper.size(); i++) {
            System.out.println(integerWrapper.getItems(i));
        }
    }

}
