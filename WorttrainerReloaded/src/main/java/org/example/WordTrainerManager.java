package org.example;

public interface WordTrainerManager {
    void save(String filepath, WordspellTrainer wordTrainer);
    WordspellTrainer load(String filepath);
}
