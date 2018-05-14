package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Nickel implements ICurrency
{
    private int year;
    public Nickel(int year)
    {
        this.year = year;
    }
    public BigDecimal getFaceValue()
    {

       BigDecimal nickel = new BigDecimal("0.05");
       return nickel;
    }



    public BigDecimal getCollectibleValue()
    {
        BigDecimal faceValue = getFaceValue();

        BigDecimal collectorNickel = new BigDecimal("0.10");

        BigDecimal collectorNickelValue = new BigDecimal("0.0");
        if (year < 1935)
        {
            BigDecimal yearsOld = new BigDecimal(1935 - year);
            collectorNickelValue = yearsOld.multiply(collectorNickel);
        }
        BigDecimal totalCollectorValue = faceValue.add(collectorNickelValue);


        return totalCollectorValue;
    }
    public String getName()
    {
        return this.getName();
    }
}
