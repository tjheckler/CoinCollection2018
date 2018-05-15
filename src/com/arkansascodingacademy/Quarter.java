package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Quarter extends Coin implements ICurrency
{

   public Quarter(int year)
    {
        super(year);
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
        if (getYear() < 1923)
        {
            BigDecimal yearsOld = new BigDecimal(1923 - getYear());
            collectorQuarterValue = yearsOld.multiply(collectorQuarter);
        }
        BigDecimal totalCollectorValue = faceValue.add(collectorQuarterValue);


        return totalCollectorValue;
    }
    public String getName()
    {
        return this.getName();
    }
}
