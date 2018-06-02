package com.company;

public class AgrPrinter implements PrintString
{
    private PrintString[]arr;
    public AgrPrinter(PrintString[] printers)
    {
        arr=printers;
    }

    @Override
    public void Print(String str)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i].Print(str);
        }
    }
}
