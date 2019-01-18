package design.practice1;

public class Application {

    private static ScreenUI currentScreen = null;

    public static void main(String[] args) {
        String sourceId = "menu2";

        if(sourceId.equals("menu1")){
            currentScreen = new Menu1ScreenUI();
            currentScreen.show();
        }
        else if(sourceId.equals("menu2")){
            currentScreen = new Menu2ScreenUI();
            currentScreen.show();
        }
        else if(sourceId.equals("button1")){
            if (currentScreen == null)
                return;
            currentScreen.handleButton1Click();
        }

    }
}
