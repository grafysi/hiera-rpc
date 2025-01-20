package com.grafysi.hierarpc.test.misc;

import java.util.ArrayList;
import java.util.HashMap;

public class PerformanceComparison {
    public static void main(String[] args) {
        // Setup
        int size = 20;
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            hashMap.put("Key" + i, i);
        }

        final int TEST_TIMES = 1_000_000;

        // Benchmark ArrayList get(int)
        long start = System.nanoTime();
        for (int i = 0; i < TEST_TIMES; i++) {
            arrayList.get(i % size);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList get(int): " + (end - start) + " ns");

        // Benchmark HashMap get(String)
        start = System.nanoTime();
        for (int i = 0; i < TEST_TIMES; i++) {
            hashMap.get("Key" + (i % size));
        }
        end = System.nanoTime();
        System.out.println("HashMap get(String): " + (end - start) + " ns");
    }
}

