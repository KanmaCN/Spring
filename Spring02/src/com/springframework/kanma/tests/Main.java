package com.springframework.kanma.tests;

import com.springframework.kanma.services.TestWork;
import com.springframework.kanma.services.Yue;

public class Main {
    public static void main(String args[]){
        TestWork testWork= new TestWork();
        testWork.setTester(new Yue());
        testWork.test();
    }
}
