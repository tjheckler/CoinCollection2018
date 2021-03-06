package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Dime extends Coin implements ICurrency
{

    public Dime(int year)
    {
        super(year);
    }
    public BigDecimal getFaceValue()
    {
       BigDecimal dime = new BigDecimal("0.10");
       return dime;
    }



    public BigDecimal getCollectibleValue()
    {
        BigDecimal faceValue = getFaceValue();



        BigDecimal collectorDimeValue = new BigDecimal("0.0");

        BigDecimal totalCollectorValue = faceValue.add(collectorDimeValue);


        return totalCollectorValue;
    }
    public String getName()
    {
        return this.getName();
    }
}
