
import java.util.*;

public class MidtermC1_Rosete {
    public static void main (String[] args) {
        Scanner Carcosa = new Scanner(System.in);

        System.out.println("Do you want to make a loaf o' bread?");
        String bread = Carcosa.nextLine();

        switch (bread) {
            case "yes":
                System.out.println("");
                System.out.println("Open the sourdough starter.");
                break;
            case "no":
                System.out.println("");
                System.out.println("Then go hungry.");
                return;
            default:
                System.out.println("");
                System.out.println("Empty.");
                return;
        }

        System.out.println("Did the starter have eyes? If so, did it see your soul?");
        String soul = Carcosa.nextLine();

        switch (soul) {
            case "yes":
                System.out.println("");
                System.out.println("It's too late, it has been cursed.");
                System.out.println("Now go buy bread from the store.");
                return;
            case "no":
                System.out.println("");
                System.out.println("Great!");
                System.out.println("Continue with the ritual of baking.");
                System.out.println("Keep following the instructions.");
                break;
            case "i have none.":
                System.out.println("");
                System.out.println("Do you feel it?");
                System.out.println("I know that feeling well.");
                System.out.println("Empty.");
                return;
            case "there is no starter":
                System.out.println("");
                System.out.println("Oh.");
                return;
            default:
                System.out.println("");
                System.out.println("Empty.");
                return;
        }

        System.out.println("");
        System.out.println("Did you bake it well? Is it burnt?");
        String baked = Carcosa.nextLine();
        switch (baked) {
            case "no":
                System.out.println("");
                System.out.println("It's perfect.");
                System.out.println("Leave it to cool.");
                System.out.println("Admire it with pride.");
                System.out.println("You earned it.");
                break;
            case "yes":
                System.out.println("");
                System.out.println("Oh.");
                System.out.println("Now go buy bread from the store.");
                System.out.println("Or don't waste it.");
                System.out.println("Cut of the carcinogen.");
                return;
            case "cake":
                System.out.println("");
                System.out.println("What.");
                System.out.println("How?");
                System.out.println("The instructions were to bake bread!");
                System.out.println(".");
                System.out.println("Fine, have your cake.");
                System.out.println("");
                System.out.println("CAKE EATEN AND CONSUMED SUCCESSFULLY");
                return;
            default:
                System.out.println("");
                System.out.println("Empty.");
                return;
        }

        System.out.println("");
        System.out.println("BREAD EATEN AND CONSUMED SUCCESSFULLY");
    }
}
