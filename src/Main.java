public class Main
{
    public static void main(String[] args)
    {
        {
            String menuChoice = "D";
            String menu = "D - Democrat R - Republican I - Independant";
            menuChoice = "z";

            if (menuChoice.equalsIgnoreCase ("D"))
            {
                System.out.println("You get a Democrat Donkey");
            }
            else if (menuChoice.equalsIgnoreCase ("R"))
            {
                System.out.println("You get Republican Elephant");
            }
            if (menuChoice.equalsIgnoreCase("I"))
            {
                System.out.println("You get a person");
            }
            else if  (menuChoice.equalsIgnoreCase("O"))
            {
                System.out.println("Other");

            }
        }
    }
}