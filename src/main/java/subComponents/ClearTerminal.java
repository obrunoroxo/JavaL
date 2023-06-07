package subComponents;

public class ClearTerminal {
    public void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
