public class Zach_ProjectIDea
{
    public static void main(String[] args)
    {

        System.out.println("Hello team, my name is Zach Bowman. " +
                "\nI think a mortgage calculator would be neat, since I am looking for houses to buy.");

        // Testing the formula

        double C = .005;

        double c_and_1 = 1 + C;

        double math_pow = Math.pow(c_and_1,360);


        double answer = 100000*(C*(math_pow))/((math_pow)-1);

        System.out.println(
                "\n\n\n\n This is the math test."
        );

        System.out.println(answer);

    }
}

