
import java.util.*;

//////////////////////////////////////////////////
//
//  Function Name   :   CountOdd
//  Description     :   Accept number from user and return count of odd digits
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   07/08/2023
//  
//////////////////////////////////////////////////

class Digits
{
    public int CountOdd(int iNo)
    {
        int iCnt = 0;
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit%2) == 1)
            {
                iCnt++;
            }
            iNo = iNo / 10;
        }  
        return iCnt;
    }
}

class program07
{
    public static void main(String args[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number 1 :");
        iValue = sobj.nextInt();
        
        Digits dobj = new Digits();
        iRet = dobj.CountOdd(iValue);
        System.out.println("Count : "+iRet);
    }
}