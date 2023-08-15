
import java.util.*;

//////////////////////////////////////////////////
//
//  Function Name   :   CountDiff
//  Description     :   Accept number from user and return difference between summation of even digits 
//                      and summation of odd digits
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   07/08/2023
//  
//////////////////////////////////////////////////

class Digits
{
    public int CountDiff(int iNo)
    {
        int iDigit = 0;
        int iSumE = 0;
        int iSumO = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                iSumE = iSumE + iDigit;
            }
            else
            {
                iSumO = iSumO + iDigit;
            }
            iNo = iNo / 10;
        }
        return (iSumE - iSumO);
    }
}

class program10
{
    public static void main(String args[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number 1 :");
        iValue = sobj.nextInt();
        
        Digits dobj = new Digits();
        iRet = dobj.CountDiff(iValue);
        System.out.println("Difference : "+iRet);
    }
}