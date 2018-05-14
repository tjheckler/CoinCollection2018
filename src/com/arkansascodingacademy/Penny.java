package com.arkansascodingacademy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public class Penny implements ICurrency
{
    private static final BigDecimal Face_Value = new BigDecimal("0.01");
    private int year;

    public Penny(int year)
    {
        this.year = year;
    }

     public BigDecimal getFaceValue()
     {

         BigDecimal penny = new BigDecimal("0.01");
         return penny;
     }

    public BigDecimal getCollectibleValue()
    {
        BigDecimal faceValue = getFaceValue();

        BigDecimal collectorPenny = new BigDecimal("0.03");

        BigDecimal collectorPennyValue = new BigDecimal("0.0");
        if (year < 1945)
        {
            BigDecimal yearsOld = new BigDecimal(1945 - year);
            collectorPennyValue = yearsOld.multiply(collectorPenny);
        }
        BigDecimal totalCollectorValue = faceValue.add(collectorPennyValue);


        return totalCollectorValue;
    }

    @Override
    public String getName()
    {
        return "Penny";
    }
}
