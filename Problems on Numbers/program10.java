import java.util.*;

/////////////////////////////////////////////////
//
//  Function Name   :   ChkEven
//  Description     :   Check if the accepted number is Even or Odd
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//
/////////////////////////////////////////////////


class Numbers
{
    public boolean ChkEven(int iNo)
    {
    
        if(iNo % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program10
{
    public static void main(String args[])
    {
        int iValue = 0;
        boolean bRet = false;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        bRet = nobj.ChkEven(iValue);

        if(bRet == true)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }

    }
}