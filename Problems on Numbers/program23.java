import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   OddDisplay
//  Description     :   Accept number from user and print all odd number upto N
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   07/08/2023
//  
//////////////////////////////////////////////////////////////////////////

class Numbers
{
    public void OddDisplay(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1;iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2) != 0)
            {
                System.out.print(iCnt+" ");
            }
            
        }

    }
}

class program23
{
    public static void main(String args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        nobj.OddDisplay(iValue);

    }
}