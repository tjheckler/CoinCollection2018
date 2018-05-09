package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Quarter
{
    private int year;
   public Quarter(int year)
    {
        this.year = year;
    }
    public BigDecimal getFaceValue()
    {
        BigDecimal quarter = new BigDecimal("0.25");
        return quarter;
    }
    public BigDecimal getCollectibleValue()
    {
        BigDecimal faceValue = getFaceValue();

        BigDecimal collectorQuarter = new BigDecimal("0.22");

        BigDecimal collectorQuarterValue = new BigDecimal("0.0");
        if (year < 1923)
        {
            BigDecimal yearsOld = new BigDecimal(1923 - year);
            collectorQuarterValue = yearsOld.multiply(collectorQuarter);
        }
        BigDecimal totalCollectorValue = faceValue.add(collectorQuarterValue);


        return totalCollectorValue;
    }
}
