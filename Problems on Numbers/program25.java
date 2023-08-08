import java.util.*;

/////////////////////////////////////////////////////////////////////////
//
//  Function Name   :   Number
//  Description     :   Accept number from user and if number is less than 50 then print small
//                      if it is greater than 50 and less than 100 then print medium, it it is
//                      greater than 100 then print large
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   07/08/2023
//  
//////////////////////////////////////////////////////////////////////////

class Numbers
{
    public void Number(int iNo)
    {
        if(iNo < 50)
        {
            System.out.println("Small");
        }
        else if(iNo > 50 && iNo < 100)
        {
            System.out.println("Medium");
        }
        else if(iNo > 100)
        {
            System.out.println("Large");
        }

    }
}

class program25
{
    public static void main(String args[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Numbers nobj = new Numbers();
        nobj.Number(iValue);

    }
}