package ex_01_Java_Basic;

public class Lab006_Switch_2
{
    public static void main (String args[])
    {
        char a = 6;


        switch (a = 9)
        {
            case 1:
                System.out.println("Walking is good for health");break;
            case 2:
                System.out.println("Jogging is good for health");break;
            case 3:
                System.out.println("Drinking coffe is bad");break;
            case 4:
                System.out.println("Drinking milk is good");break;
            default:
                System.out.println("Invalid input");
        }

    }
}
