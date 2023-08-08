import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   MultipleDisplay
//  Description     :   Accept number from user and print first 5 multiples of N
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   07/08/2023
//  
//////////////////////////////////////////////////////////////////////////

class Numbers
{
    public void MultipleDisplay(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1;iCnt <= 5; iCnt++)
        {
            System.out.print(iNo*iCnt+" ");
        }

    }
}

class program24
{
    public static void main(String args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        nobj.MultipleDisplay(iValue);

    }
}