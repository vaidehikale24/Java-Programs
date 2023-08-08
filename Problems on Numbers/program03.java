

/////////////////////////////////////////////////
//
//  Function Name   :   Display
//  Description     :   Display numbers from 5 to 1
//  Author          :   Vaidehi Vishwanath Kale
//  Date            :   31/07/2023
/////////////////////////////////////////////////

class Numbers
{
    public void Display()
    {
        int i = 0;
    
        for(i = 5;i > 0;i--)
        {
            System.out.print(i+" ");
        }
    }
}

class program03
{
    public static void main(String args[])
    {
        
        Numbers nobj = new Numbers();
        nobj.Display();

    }
}
