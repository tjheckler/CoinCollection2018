package com.arkansascodingacademy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
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
       return getFaceValue(pennys);
    }

    public BigDecimal getDimesFaceValue()
    {

        return getFaceValue(dimes);
    }

    public BigDecimal getNickelsFaceValue()
    {

        return getFaceValue(nickels);
    }

    public BigDecimal getQuartersFaceValue()
    {

        return getFaceValue(quarters);
    }
    public BigDecimal getQuartersCollectibleValue()
    {
       return getCollectibleValue(quarters);
    }
    public BigDecimal getNickelsCollectibleValue()
    {
       return getCollectibleValue(nickels);
    }
    public BigDecimal getDimesCollectibleValue()
    {
        return getCollectibleValue(dimes);
    }
    public BigDecimal getPenniesCollectibleValue()
    {
       return getCollectibleValue(pennys);
    }
    public BigDecimal getFaceValue()
    {
        BigDecimal totalValue = new BigDecimal("0.00");
        totalValue = totalValue.add(getPenniesFaceValue());
        totalValue = totalValue.add(getNickelsFaceValue());
        totalValue = totalValue.add(getDimesFaceValue());
        totalValue = totalValue.add(getQuartersFaceValue());
        return totalValue;
    }
    public BigDecimal getCollectibleValue()
    {
        BigDecimal totalValue = new BigDecimal("0.00");
        totalValue = totalValue.add(getPenniesCollectibleValue());
        totalValue = totalValue.add(getNickelsCollectibleValue());
        totalValue = totalValue.add(getDimesCollectibleValue());
        totalValue = totalValue.add(getQuartersCollectibleValue());
        return totalValue;
    }
    public BigDecimal getCollectibleValue(Collection<? extends ICurrency> currencies)
    {
        BigDecimal totalValue = new BigDecimal("0.00");
        for (ICurrency currency : currencies)
        {

            totalValue = totalValue.add(currency.getFaceValue());
        }
        return totalValue;
    }
    private BigDecimal getFaceValue(Collection<? extends ICurrency> currencies)
    {
        BigDecimal total = new BigDecimal("0.00");
        for (ICurrency currency : currencies)
        {

            total = total.add(currency.getFaceValue());
        }
        return total;
    }
}


