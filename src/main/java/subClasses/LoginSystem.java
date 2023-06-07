package subClasses;

import java.util.Scanner;
import subComponents.ClearTerminal;
import subComponents.ManipulatingDatas;

public class LoginSystem {
    public void loginSystem() {
        ManipulatingDatas Datas = new ManipulatingDatas();
        ClearTerminal Clear = new ClearTerminal();
        Scanner Reader = new Scanner(System.in);
        
        System.out.println("Type your login: ");
        
        String login = Reader.next();
        
        Clear.clearTerminal();
        
        System.out.println("Type your password: ");
        
        String password = Reader.next();
        
        Clear.clearTerminal();
        
        Datas.manipulatingDatas(login, password);
        
//        System.exit(0);
    }
}
