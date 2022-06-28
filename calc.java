import java.util.Scanner;

public class calc 
{
        public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a,b,c,d,e and f");
        Double a = scan.nextDouble();           
        Double b = scan.nextDouble();
        Double c = scan.nextDouble();
        Double d = scan.nextDouble();
        Double e = scan.nextDouble();
        Double f = scan.nextDouble();
        Double x = (e*d-b*f);
        Double y = (a*f-e*c);
        Double q =  (a*d - b*c);
        scan.close();
        if ( q == 0)
            {
                System.out.println("The equation has no solution");
            }
         else
            {
                System.out.println("X = " + (x/q) + " and Y= " + (y/q));
            }
     }
}
