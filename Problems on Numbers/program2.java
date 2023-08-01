
//////////////////////////////////////////////////
//
//  Function Name   :   Display
//  Description     :   Display "Marvellous" 5 times
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
//  
//////////////////////////////////////////////////
class Numbers
{
    public void Display()
    {
        int i = 0;

        for(i = 1; i <= 5; i++)
        {
            System.out.println("Marvellous ");
        }
    }
}

class program2
{
    public static void main(String args[])
    {
        
        Numbers nobj = new Numbers();
        nobj.Display();

    }
}