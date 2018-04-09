package com.sda.service;

public class WriterService {
    public String write(String name) {
        String nameToDisplay = name == null ? "my friend" : name;
        return "Hello, " + nameToDisplay + ".";
    }

    public static void main(String[] args) {
        WriterService writerService = new WriterService();
        String write = writerService.write(null);


        System.out.println(write);
    }
}
