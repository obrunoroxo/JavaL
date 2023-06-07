package subComponents;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;

public class ManipulatingDatas {
    public void manipulatingDatas(String login, String password) {
        
        ClearTerminal Clear = new ClearTerminal();
        
        try (FileReader reader = new FileReader("/home/napp/NetBeansProjects/FinancialControl/src/main/java/Datas/DataBase.json")) {
            // Cria um objeto JsonParser
            JsonParser jsonParser = new JsonParser();
            
            // Lê o arquivo JSON e converte para um elemento JsonElement
            JsonElement jsonElement = jsonParser.parse(reader);
            
            // Converte o elemento JsonElement para um objeto JsonObject
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            
            // Lê os campos do objeto JsonObject
            String loginField = jsonObject.get("login").getAsString();
            
            String passowordField = jsonObject.get("password").getAsString();
            
            Clear.clearTerminal();

            if (login.equals(loginField) && password.equals(passowordField)) {
                System.out.println("Your credentials:\n");
                System.out.println("Your login: " + loginField + "\nYour password: " + passowordField);
            } else {
                System.out.println("You typed wrong credentials!");
            }
              
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
