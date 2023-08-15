
import java.util.*;

//////////////////////////////////////////////////
//
//  Function Name   :   CountLessSix
//  Description     :   Accept number from user and count frequency of 4 in it
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   07/08/2023
//  
//////////////////////////////////////////////////

class Digits
{
    public int CountLessSix(int iNo)
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
            if(iDigit < 6)
            {
                iCnt++;
            }
            iNo = iNo / 10;
        }  
        return iCnt;
    }
}

class program05
{
    public static void main(String args[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number 1 :");
        iValue = sobj.nextInt();
        
        Digits dobj = new Digits();
        iRet = dobj.CountLessSix(iValue);
        System.out.println("Count : "+iRet);
    }
}