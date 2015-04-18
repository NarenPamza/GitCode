package com.galaxy.core;

public class SampleMain
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Input");
        try
        {
            ParserManager aConvertor = ParserManager.getInstance();
            aConvertor.parse();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
