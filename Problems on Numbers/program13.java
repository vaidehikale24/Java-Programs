import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   NonFact
//  Description     :   Accept number from user and display its non factors 
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//
//////////////////////////////////////////////////////////////////////////////////////

class Numbers
{
    public void NonFact(int iNo)
    {
        int iCnt = 0;
    
        for(iCnt = 1;iCnt < iNo ;iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                System.out.println(iCnt+" ");
            }
        }
    }
}

class program13
{
    public static void main(String args[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        nobj.NonFact(iValue);

    }
}