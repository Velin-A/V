import java.util.Scanner;
import java.util.Random;
public class main {
    public static void main(String[] args) {
        System.out.println("Hi. You have a rat problem, well I am the right robot for you!\n"
                + "You'll have to help me a little though. Just type:\n- 'wall' if one is near\n" +
                "- 'chair' if it is ahead or\n- 'nothing' if I can keep on forward.\nSo, let's begin!\n");

        int strikeCount = 4;
        boolean hunting = true;

        while (hunting) {
            checkingForObstacles();
                while (gettingReadyToStrike()) {
                    checkingForObstacles();
                }
                strikeCount--;

                if (strikeCount <= 0){
                    rechargingBattery();
                    strikeCount  = 4;
                }
                if(!keepTheHuntGoing())
                break;
            }
            givingReport();
        }

    public static void checkingForObstacles() {
        while (true) {
            Scanner Obstacle = new Scanner(System.in);
            System.out.println("Is there something ahead?");
            String obstacle = Obstacle.nextLine();
            switch (obstacle) {
                case "nothing":
                    System.out.println("Executing: Forward");
                    break;
                case "wall":
                    System.out.println("Executing: Go Sideways");
                    break;
                case "chair":
                    System.out.println("Executing: Jump");
                    break;
                default:
                    System.out.println("Object is not recognized...");
            }
            if (obstacle.equals("nothing") || obstacle.equals("wall") || obstacle.equals("chair")) {
                break;
            }
        }
    }

    public static boolean gettingReadyToStrike() {
        boolean IsThisAMouse = false;
        Scanner Pixels       = new Scanner(System.in);
        System.out.println("How many pixels does the object in front of me have?");
        int pixels           = Pixels.nextInt();
        Random Smash         = new Random();

        if (pixels % 2 == 0) {
            System.out.println("IT'S A MOUSE! PREPARING FOR STRIKE!\n............");
            int superSmash = Smash.nextInt(10);

            if ((superSmash + 1) == 5) {
                System.out.println("Sorry I couldn't kill it, I would've damaged your furniture.");
            } else System.out.println("The mouse was terminated.\n");

        } else System.out.println("OK, let's keep looking...");

        if (pixels % 2 != 0) {
            IsThisAMouse = true;
        }
        return IsThisAMouse;
    }

    public static void rechargingBattery() {
        System.out.println("I am out of power, moving to the nearest plug for recharge...");
        while (true) {
            Random Minus        = new Random();
            int powerOnTheMinus = Minus.nextInt(1000);
            int powerOnThePlus  = Minus.nextInt(1000);
            if (powerOnTheMinus == powerOnThePlus) {
                System.out.println("Checking for power, unsuccessful, repeating...");

            } else if (powerOnTheMinus < powerOnThePlus) {
                System.out.println("This plug is corupted, moving to another one");
            }
            if (powerOnTheMinus > powerOnThePlus) {
                System.out.println("Recharging successful! Ready to strike again");
                break;
            }
        }
    }

    public static boolean keepTheHuntGoing() {
        boolean keepHunting = true;
        while (true) {
            Scanner Hunt    = new Scanner(System.in);
            System.out.println("Should I keep hunting? (y/n)");
            String huntCommand = Hunt.nextLine();
            switch (huntCommand) {
                case "y":
                    keepHunting = true;
                    break;
                case "n":
                    keepHunting = false;
                    break;
            }
            if (huntCommand.equals("y") || huntCommand.equals("n")) {
                break;
            }
        }
        return keepHunting;
    }

    public static void givingReport() {
        for (int speech = 10; speech > 0; speech--) {
            if (speech % 2 == 0) {
                System.out.println("I am a Robottttt" + speech);
            }
        }
    }

}
