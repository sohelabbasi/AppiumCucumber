package util;

import pages.HomePage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage lp;
    public static HomePage hp;

    public static void initializeObject() {
        lp = new LoginPage();
        hp = new HomePage();
    }
}
