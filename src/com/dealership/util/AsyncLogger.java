package com.dealership.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AsyncLogger implements Runnable {
    private String logData;

    public AsyncLogger(String logData) {
        this.logData = logData;
    }

    @Override
    public void run() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("sales_log.txt", true))) {
            writer.println(logData);
            System.out.println("[Background Logger]: Transaction logged to sales_log.txt");
        } catch (IOException e) {
            System.err.println("Error writing log: " + e.getMessage());
        }
    }
}