
import javax.swing.JOptionPane;

public class MidtermC1_Rosete {
    public static void main (String[] args) {
        String bread =JOptionPane.showInputDialog(
            null,
            "Do you want to make a loaf o' bread?",
            "The Ritual of Baking.",
            JOptionPane.QUESTION_MESSAGE
            );

            if (bread == null) {
            bread = "";
            }
            bread = bread.trim().toLowerCase();

            switch (bread) {
            case "yes":
                JOptionPane.showMessageDialog(
                    null,
                    "Open the sourdough starter.",
                    "The Ritual of Baking.",
                    JOptionPane.INFORMATION_MESSAGE
                );
                break;
            case "no":
                JOptionPane.showMessageDialog(
                    null,
                    "Then go hungry.",
                    "The Ritual of Baking.",
                    JOptionPane.INFORMATION_MESSAGE
                );
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(
                    null,
                    "Empty.",
                    "The Ritual of Baking.",
                    JOptionPane.INFORMATION_MESSAGE
                );
                System.exit(0);
                break;
            }

        String soul =JOptionPane.showInputDialog(
            null,
            "Did the starter have eyes? If so, did it see your soul?",
            "Instructions.",
            JOptionPane.QUESTION_MESSAGE
            );

            if (soul == null) {
            soul = "";
            }
            soul = soul.trim().toLowerCase();

            switch (soul) { 
                case "yes":    
                    JOptionPane.showMessageDialog(
                        null,
                        "It's too late, it has been cursed.\nNow go buy bread from the store.",
                        "Instructions.",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    System.exit(0);
                    break;
                case "no":
                    JOptionPane.showMessageDialog(
                        null,
                        "Great!\nContinue with the ritual of baking.\nKeep following the instructions.",
                        "Instructions.",
                        JOptionPane.INFORMATION_MESSAGE
                    ); 
                    break;
                case "i have none.":
                    JOptionPane.showMessageDialog(
                        null,
                        "Do you feel it?\nI know that feeling well.\nEmpty.",
                        "Instructions.",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    System.exit(0);
                    break;
                case "there is no starter":
                    JOptionPane.showMessageDialog(
                        null,
                        "Oh.",
                        "Instructions.",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(
                        null,
                        "Empty.",
                        "Instructions.",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    System.exit(0);
                    break;
            }

        String baked =JOptionPane.showInputDialog(
            null,
            "Did you bake it well? Is it burnt?",
            "The Consumption.",
            JOptionPane.QUESTION_MESSAGE
            );

            if (baked == null) {
            baked = "";
            }
            baked = baked.trim().toLowerCase();

            switch (baked) {
                case "no":
                    JOptionPane.showMessageDialog(
                        null,
                        "It's perfect.\nLeave it to cool.\nAdmire it with pride.\nYou earned it.",
                        "Full.",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    System.exit(0);
                    break;
                case "yes":
                    JOptionPane.showMessageDialog(
                        null,
                        "BREAD EATEN AND CONSUMED SUCCESSFULLY",
                        "Empty.",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    System.exit(0);
                    break;
                case "cake":
                    JOptionPane.showMessageDialog( 
                        null,
                        "What.\nHow?\nThe instructions were to bake bread!\n.\nFine, have your cake.\n\nCAKE EATEN AND CONSUMED SUCCESSFULLY",
                        "Cake...?",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(
                        null,
                        "Empty.",
                        "Empty.",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    System.exit(0);
                    break;
            }

        JOptionPane.showMessageDialog(
            null,
            "BREAD EATEN AND CONSUMED SUCCESSFULLY",
            "Full.",
            JOptionPane.INFORMATION_MESSAGE
        );

        System.exit(0);

    }
}
            



        
        