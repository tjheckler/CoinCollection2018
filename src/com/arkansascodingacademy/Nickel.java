package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Nickel extends Coin implements ICurrency
{

    public Nickel(int year)
    {
        super(year);
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
        if (getYear() < 1935)
        {
            BigDecimal yearsOld = new BigDecimal(1935 - getYear());
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
