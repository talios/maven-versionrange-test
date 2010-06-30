package com.talios.client;

import com.talios.api.SomeService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        SomeService someService = new SomeServiceImpl();
        someService.doSomething();
        
    }
}
