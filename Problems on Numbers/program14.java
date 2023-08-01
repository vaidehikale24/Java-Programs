import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   SumNonFact
//  Description     :   Accept number from user and return summation of all its non factors 
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//
///////////////////////////////////////////////////////////////////////////////////////////

class Numbers
{
    public int SumNonFact(int iNo)
    {
        int iCnt = 0,iSum = 0;
    
        for(iCnt = 1;iCnt < iNo ;iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                iSum = iSum+iCnt;
            }
        }
        return iSum;
    }
}

class program14
{
    public static void main(String args[])
    {
        int iValue = 0,iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        iRet=nobj.SumNonFact(iValue);

        System.out.println("Summation of non factors : "+iRet);

    }
}