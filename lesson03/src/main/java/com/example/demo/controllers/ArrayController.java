package com.example.demo.controllers;

import com.example.demo.models.ArrayResultModel;
import com.example.demo.services.ArrayGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArrayController {
    @Autowired
    private ArrayGenerator arrayGenerator;
    @RequestMapping(value = "/generate", method = RequestMethod.GET)
    @ResponseBody
    public ArrayResultModel generate(@RequestParam(value="length", required=false, defaultValue="1000")int length){
        long startTime = System.nanoTime();
        int[] array = arrayGenerator.generateSeqArray(length);
        long endTime = System.nanoTime();
        ArrayResultModel result = new ArrayResultModel(startTime, endTime, (endTime - startTime) / 1000000.0, array);
        return  result;
    }
}
