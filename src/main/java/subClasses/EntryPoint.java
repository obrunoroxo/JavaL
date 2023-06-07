package subClasses;

import java.util.Scanner;

import subComponents.ClearTerminal;
import subComponents.TimerSystem;

public class EntryPoint {
    public void entryPoint() {
        Scanner reader = new Scanner(System.in);
        ClearTerminal Clear = new ClearTerminal();
        TimerSystem Timer = new TimerSystem();
        LoginSystem Login = new LoginSystem();
        
        Clear.clearTerminal();
        
        System.out.println("Wellcome to Financial Project!\n");
        
        System.out.printf("1 - If you wanna do a login.\n2 - If you wanna create a new register.\n3 - If you wanna exit.\nAnswer: ");
    
        int response = reader.nextInt();
        
        do {
            if (response == 1) {
                Clear.clearTerminal();
                Timer.timerSystem(2000);
                Login.loginSystem();
            } else if (response == 2) {
                System.out.println("Make your new register!");
            } else if (response == 3) {
                System.out.println("Exit...");
                break;
            } else {
                Clear.clearTerminal();
                System.out.println("Please, type an avaiable answer!\n");
            }
            
            System.out.printf("1 - If you wanna do a login.\n2 - If you wanna create a new register.\n3 - If you wanna exit.\nAnswer: ");
            
            response = reader.nextInt();
            
        } while (response != 3);
    }
}
