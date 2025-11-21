package org.bridgelabz;

public class SearchingNumber
{
    public static void main( String[] args )
    {
       int[] arr = {10,12,10,20};
       int num = 42;
       boolean isPresent = false;
       for(int i =0;i<arr.length;i++)
       {
           if(num == arr[i])
           {
               isPresent = true;
           }
       }
       if(isPresent)
       {
        System.out.println("given number "+num+" is present in array");
       }else {
           System.out.println("given number "+num+" is not present in array");
       }
    }
}
