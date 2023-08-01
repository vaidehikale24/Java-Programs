import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   MultFact
//  Description     :   Accept number from user and display its multiplication of factors
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//
//////////////////////////////////////////////////////////////////////////////////////

class Numbers
{
    public int MultFact(int iNo)
    {
        int iCnt = 0,iResult = 1;
    
        for(iCnt = 1;iCnt <= (iNo/2);iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iResult = iResult*iCnt;
            }
        }
        return iResult;
    }
}

class program11
{
    public static void main(String args[])
    {
        int iValue = 0,iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        iRet = nobj.MultFact(iValue);

        System.out.println("Multiplication : "+iRet);

    }
}