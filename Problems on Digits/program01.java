
import java.util.*;

//////////////////////////////////////////////////
//
//  Function Name   :   DisplayDigit
//  Description     :   Accept number from user and display its digits in 
//                      reverse order
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   07/08/2023
//  
//////////////////////////////////////////////////

class Digits
{
    public void DisplayDigit(int iNo)
    {
        int iDigit = 0;

        if (iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.print(iDigit+" ");
            iNo = iNo / 10;
        }
    }
}

class program01
{
    public static void main(String args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number 1 :");
        iValue = sobj.nextInt();
        
        Digits dobj = new Digits();
        dobj.DisplayDigit(iValue);

    }
}
