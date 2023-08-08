import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Pattern
//  Description     :   Accept number from user and print that number of $ & *
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   07/08/2023
//  
//////////////////////////////////////////////////////////////////////////

class Numbers
{
    public void Pattern(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1;iCnt <= iNo; iCnt++)
        {
            System.out.print("$ *\t");
        }

    }
}

class program20
{
    public static void main(String args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        nobj.Pattern(iValue);

    }
}