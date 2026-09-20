package WeekFour;

public class ArrayReturn {
    
     
    public static void main(String[] args)
    {
    
        int number = 20;
        makeItHalf(number);
        number = makeItHalf_v2(number);
        //System.out.println(number);

        PassByRefrence newData = new PassByRefrence();
        newData.number = 100;

        makeItHalf(newData);
        System.out.println(newData.number);
    }
    public static void makeItHalf(int number)
    {
        number = number / 2;
        //System.out.println(number);   
    }

    public static int makeItHalf_v2(int number)
    {
        number = number / 2;
        return number;   
    }

    public static void makeItHalf(PassByRefrence Data)
    {
        Data.number = Data.number / 2;  
    }
}
