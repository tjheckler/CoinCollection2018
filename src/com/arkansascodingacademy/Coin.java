package com.arkansascodingacademy;

public abstract class Coin
{
    private int year;

    public Coin(int year)
    {
        this.year = year;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }
}
