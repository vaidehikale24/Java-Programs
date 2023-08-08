import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Display
//  Description     :   Accept number from user and print all numbers till that number 
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   07/08/2023
//  
//////////////////////////////////////////////////////////////////////////

class Numbers
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1;iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt+" ");
        }

    }
}

class program21
{
    public static void main(String args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        nobj.Display(iValue);

    }
}