import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userString;
        userString= input.nextLine();

        //Spice Calculation
        float spice;
        spice = input.nextFloat();
        double val = Math.pow(2.0,(Math.sqrt(5.0)/Math.pow(spice,3)))*(4.0/3.0);

        //TODO : Replace this comment with your code
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        System.out.println("Enter a floating-point number:");
        System.out.println("Well " +userString + ", the spice value resulted in " + val);
        System.out.println("And the converted value is " + (val));



    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
        double wallArea = wallWidth*wallHeight;
        System.out.println("Wall area: "+wallArea +" square feet");

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        double gallonsNeeded =wallArea/squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons\n",gallonsNeeded);
        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        double gallonCansNeeded = (gallonsNeeded/gallonsPerCan);
        System.out.printf("Cans needed: " +(int)Math.ceil(gallonCansNeeded) +" can(s)");
    }

}
