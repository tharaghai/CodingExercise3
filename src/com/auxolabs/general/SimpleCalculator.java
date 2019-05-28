package com.auxolabs.general;

public class SimpleCalculator
{
    double firstNumber;
    double secondNumber;
    public double getFirstNumber()
    {
        return firstNumber;
    }
    public double getSecondNumber()
    {
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber)
    {
        this.firstNumber=firstNumber;
    }
    public void setSecondNumber(double secondNumber)
    {
        this.secondNumber=secondNumber;
    }
    public double getAdditionResult()
    {
        return firstNumber+secondNumber;
    }
    public double getSubtractionResult()
    {
        return firstNumber-secondNumber;
    }
    public double getMultiplicationResult()
    {
        return firstNumber*secondNumber;
    }
    public double getDivisionResult()
    {
        if(secondNumber==0)
        {
            return 0;
        }
        return firstNumber/secondNumber;
    }
    public static void main (String[] args)
    {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(4.55);
        calculator.setSecondNumber(2.25);
        System.out.println("add="+calculator.getAdditionResult());
        System.out.println("subtract="+calculator.getSubtractionResult());
        System.out.println("multiply="+calculator.getMultiplicationResult());
        System.out.println("divide="+calculator.getDivisionResult());

    }
}
