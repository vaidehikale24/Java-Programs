import java.util.*;

//////////////////////////////////////////////////
//
//  Function Name   :   Division
//  Description     :   Performs division of 2 numbers
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//  
//////////////////////////////////////////////////

class Numbers
{
    public int Division(int iNo1,int iNo2)
    {
        if(iNo2 == 0)
        {
            return -1;
        }
        return iNo1/iNo2;
    }
}

class program1
{
    public static void main(String args[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number 1 :");
        iValue1 = sobj.nextInt();
        System.out.println("Enter number 2 :");
        iValue2 = sobj.nextInt();
        
        Numbers nobj = new Numbers();
        System.out.println("Division : "+nobj.Division(iValue1, iValue2));

    }
}
