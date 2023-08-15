
import java.util.*;

//////////////////////////////////////////////////
//
//  Function Name   :   ChkZero
//  Description     :   Accept number from user and check whether it contains
//                      0 in it or not
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   07/08/2023
//  
//////////////////////////////////////////////////

class Digits
{
    public boolean ChkZero(int iNo)
    {
        int iDigit = 0;
        boolean bFlag = false;

        if (iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 0)
            {
                bFlag = true;
                break;
            }
            iNo = iNo / 10;
        }
        return bFlag;
    }
}

class program02
{
    public static void main(String args[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number 1 :");
        iValue = sobj.nextInt();
        
        Digits dobj = new Digits();
        bRet = dobj.ChkZero(iValue);
        if(bRet == true)
        {
            System.out.println("It Contains Zero");
        }
        else
        {
            System.out.println("There is no Zero");
        }

    }
}