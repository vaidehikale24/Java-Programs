import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   FactDiff
//  Description     :   Accept number from user and return difference sum of all its factors and non factors
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////

class Numbers
{
    public int FactDiff(int iNo)
    {
        int iSumF = 0;
        int iSumNF = 0;
        int iCnt = 0;
    
        for(iCnt = 1;iCnt < iNo ;iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSumF = iSumF+iCnt;
            }
            else
            {
                iSumNF = iSumNF+iCnt;
            }
        }
        return iSumF - iSumNF;
    }
}

class program15
{
    public static void main(String args[])
    {
        int iValue = 0,iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        iRet=nobj.FactDiff(iValue);

        System.out.println("Summation of non factors : "+iRet);

    }
}