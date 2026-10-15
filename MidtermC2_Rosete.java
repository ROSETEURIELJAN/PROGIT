import javax.swing.JOptionPane; // Required import for dialog interfaces

public class MidtermC1_Rosete {
    public static void main(String[] args) {

        // 1. Spawning input dialog for the bread question
        String bread = JOptionPane.showInputDialog(
            null,
            "Do you want to make a loaf o' bread?",
            "The Ritual",
            JOptionPane.QUESTION_MESSAGE
        );

        // Cancel/X returns null, so convert it to an empty String before switching
        if (bread == null) {
            bread = "";
        }
        bread = bread.trim().toLowerCase();

        switch (bread) {
            case "yes":
                JOptionPane.showMessageDialog(
                    null,
                    "Open the sourdough starter.",
                    "The Ritual",
                    JOptionPane.INFORMATION_MESSAGE
                );
                break;
            case "no":
                JOptionPane.showMessageDialog(
                    null,
                    "Then go hungry.",
                    "The Ritual",
                    JOptionPane.INFORMATION_MESSAGE
                );
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(
                    null,
                    "Empty.",
                    "The Ritual",
                    JOptionPane.INFORMATION_MESSAGE
                );
                System.exit(0);
                break;
        }

        // 2. Spawning input dialog for the starter question
        String soul = JOptionPane.showInputDialog(
            null,
            "Did the starter have eyes? If so, did it see your soul?",
            "The Starter",
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
                    "The Starter",
                    JOptionPane.INFORMATION_MESSAGE
                );
                System.exit(0);
                break;
            case "no":
                JOptionPane.showMessageDialog(
                    null,
                    "Great!\nContinue with the ritual of baking.\nKeep following the instructions.",
                    "The Starter",
                    JOptionPane.INFORMATION_MESSAGE
                );
                break;
            case "i have none.":
                JOptionPane.showMessageDialog(
                    null,
                    "Do you feel it?\nI know that feeling well.\nEmpty.",
                    "The Starter",
                    JOptionPane.INFORMATION_MESSAGE
                );
                break;
            case "there is no starter":
                JOptionPane.showMessageDialog(
                    null,
                    "Oh.",
                    "The Starter",
                    JOptionPane.INFORMATION_MESSAGE
                );
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(
                    null,
                    "Empty.",
                    "The Starter",
                    JOptionPane.INFORMATION_MESSAGE
                );
                System.exit(0);
                break;
        }

        // 3. Spawning input dialog for the baking question
        String baked = JOptionPane.showInputDialog(
            null,
            "Did you bake it well? Is it burnt?",
            "The Oven",
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
                    "The Oven",
                    JOptionPane.INFORMATION_MESSAGE
                );
                break;
            case "yes":
                JOptionPane.showMessageDialog(
                    null,
                    "Oh.\nNow go buy bread from the store.\nOr don't waste it.\nCut off the carcinogen.",
                    "The Oven",
                    JOptionPane.INFORMATION_MESSAGE
                );
                break;
            case "cake":
                JOptionPane.showMessageDialog(
                    null,
                    "What.\nHow?\nThe instructions were to bake bread!\n.\nFine, have your cake.\n\nCAKE EATEN AND CONSUMED SUCCESSFULLY",
                    "The Oven",
                    JOptionPane.INFORMATION_MESSAGE
                );
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(
                    null,
                    "Empty.",
                    "The Oven",
                    JOptionPane.INFORMATION_MESSAGE
                );
                System.exit(0);
                break;
        }

        // 4. Final output alert
        JOptionPane.showMessageDialog(
            null,
            "BREAD EATEN AND CONSUMED SUCCESSFULLY",
            "The Ritual",
            JOptionPane.INFORMATION_MESSAGE
        );

        // 5. Force JVM exit to terminate background GUI threads
        System.exit(0);
    }
}