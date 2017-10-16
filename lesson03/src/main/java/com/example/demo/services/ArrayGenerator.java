package com.example.demo.services;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class ArrayGenerator {
    public int[] generateSeqArray(int length) {
        Random random = new Random();
        int[] values = new int[length];
        for(int i = 0; i< length; i++)
            values[i] = (i << 3) + random.nextInt(8);  // i * 8 + Random(0~8); 保证不重复
        return values;
    }
}