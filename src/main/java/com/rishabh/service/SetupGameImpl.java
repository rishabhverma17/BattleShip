package com.rishabh.service;
import java.util.List;

public class SetupGameImpl implements SetupGame {
    @Override
    public List<String> readInputFile(String fileName) {
        ReadFileInput readFileInput = new ReadFileInput();
        return readFileInput.readInput(fileName);
    }
}
