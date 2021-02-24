package com.example.service.impl;

import com.example.service.ConvertService;
@service
public class ConvertServiceImpl implements ConvertService {
    @Override
    public double convert(double num) {
        return num*23000;
    }
}
