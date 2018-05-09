package com.arkansascodingacademy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CoinCollection
{
    List<Quarter> quarters = new ArrayList<>();
    List<Dime> dimes = new ArrayList<>();
    List<Nickel> nickels = new ArrayList<>();
    List<Penny> pennys = new ArrayList<>();

    public CoinCollection(int quarterCount, int dimeCount, int nickelCount, int pennyCount)
    {


        for (int i = 0; i < quarterCount; i++)
        {
            Quarter quarter = new Quarter(2000);
            quarters.add(quarter);
        }
        for (int i = 0; i < dimeCount; i++)
        {
            Dime dime = new Dime(2000);
            dimes.add(dime);
        }
        for (int i = 0; i < nickelCount; i++)
        {
            Nickel nickel = new Nickel(2000);
            nickels.add(nickel);
        }
        for (int i = 0; i < pennyCount; i++)
        {
            Penny penny = new Penny(2000);
            pennys.add(penny);
        }
    }

    public void addQuarter(int year)
    {
        Quarter quarter = new Quarter(year);
        quarters.add(quarter);
    }

    public void addDime(int year)
    {
        Dime dime = new Dime(year);
        dimes.add(dime);
    }

    public void addNickel(int year)
    {
        Nickel nickel = new Nickel(year);
        nickels.add(nickel);
    }

    public void addPenny(int year)
    {
        Penny penny = new Penny(year);
        pennys.add(penny);
    }

    public BigDecimal getPenniesFaceValue()
    {
        BigDecimal totalValue = new BigDecimal("0.00");
        for (Penny penny : pennys)
        {
            totalValue = totalValue.add(penny.getFaceValue());
        }
        return totalValue;
    }

    public BigDecimal getDimesFaceValue()
    {
        BigDecimal totalValue = new BigDecimal("0.00");
        for (Dime dime : dimes)
        {
            totalValue = totalValue.add(dime.getFaceValue());
        }
        return totalValue;
    }

    public BigDecimal getNickelsFaceValue()
    {
        BigDecimal totalValue = new BigDecimal("0.00");
        for (Nickel nickel : nickels)
        {
            totalValue = totalValue.add(nickel.getFaceValue());
        }
        return totalValue;
    }

    public BigDecimal getQuartersFaceValue()
    {
        BigDecimal totalValue = new BigDecimal("0.00");
        for (Quarter quarter : quarters)
        {
            totalValue = totalValue.add(quarter.getFaceValue());
        }
        return totalValue;
    }
    public BigDecimal getQuartersCollectibleValue()
    {
        BigDecimal totalValue = new BigDecimal("0.00");
        for (Quarter quarter : quarters)
        {
            totalValue = totalValue.add(quarter.getCollectibleValue());
        }
        return totalValue;
    }
    public BigDecimal getNickelsCollectibleValue()
    {
        BigDecimal totalValue = new BigDecimal("0.00");
        for (Nickel nickel : nickels)
        {
            totalValue = totalValue.add(nickel.getCollectibleValue());
        }
        return totalValue;
    }
    public BigDecimal getDimesCollectibleValue()
    {
        BigDecimal totalValue = new BigDecimal("0.00");
        for (Dime dime: dimes)
        {
            totalValue = totalValue.add(dime.getCollectibleValue());
        }
        return totalValue;
    }
    public BigDecimal getPenniesCollectibleValue()
    {
        BigDecimal totalValue = new BigDecimal("0.00");
        for (Penny penny: pennys)
        {
            totalValue = totalValue.add(penny.getCollectibleValue());
        }
        return totalValue;
    }
    public BigDecimal getFaceValue()
    {
        BigDecimal totalValue = new BigDecimal("0.00");
        totalValue = totalValue.add(getPenniesFaceValue().add(getDimesFaceValue().add(getNickelsFaceValue().add(getQuartersFaceValue()))));
        return totalValue;
    }
    public BigDecimal getCollectibleValue()
    {
        BigDecimal totalValue = new BigDecimal("0.00");
        totalValue = totalValue.add(getPenniesCollectibleValue().add(getDimesCollectibleValue().add(getNickelsCollectibleValue().add(getQuartersCollectibleValue()))));
        return totalValue;
    }
}


