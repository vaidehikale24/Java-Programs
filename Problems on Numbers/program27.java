import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Factorial
//  Description     :   Accept number from user and find its factorial 
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   07/08/2023
//  
//////////////////////////////////////////////////////////////////////////

class Numbers
{
    public int Factorial(int iNo)
    {
        int iCnt = 0;
        int iFact = 1;

        if(iNo < 0){
            iNo = -iNo;
        }

        for(iCnt = 1;iCnt <= iNo;iCnt++)
        {
            iFact = iFact*iCnt;
        }
        return iFact;
    }
}

class program27
{
    public static void main(String args[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        iRet = nobj.Factorial(iValue);

        System.out.println("Factorial : "+iRet);
    }
}