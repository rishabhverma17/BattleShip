package com.rishabh.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFileInput {
    private List<String> list = new ArrayList<String>();

    public List<String> readInput(String fileName) {
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            list = br.lines().collect(Collectors.toList());

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
