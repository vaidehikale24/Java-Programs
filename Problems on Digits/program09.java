
import java.util.*;

//////////////////////////////////////////////////
//
//  Function Name   :   MultDigits
//  Description     :   Accept number from user and return multiplication of all digits
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   07/08/2023
//  
//////////////////////////////////////////////////

class Digits
{
    public int MultDigits(int iNo)
    {
        int iMult = 1;
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            iMult = iMult * iDigit;

            iNo = iNo / 10;
        }  
        return iMult;
    }
}

class program09
{
    public static void main(String args[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number 1 :");
        iValue = sobj.nextInt();
        
        Digits dobj = new Digits();
        iRet = dobj.MultDigits(iValue);
        System.out.println("Multiplication : "+iRet);
    }
}