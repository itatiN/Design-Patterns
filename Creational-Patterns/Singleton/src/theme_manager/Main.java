package theme_manager;

public class Main {
    public static void main(String[] args) {
        // Here it would create an instance or take the instance already created
        ThemeManager themeManager = ThemeManager.getInstance();

        System.out.println("Current Theme: " + themeManager.getCurrentTheme());

        Theme purpleTheme = new Theme("Purple", "White");

        themeManager.setCurrentTheme(purpleTheme);

        System.out.println("Current Theme: " + themeManager.getCurrentTheme());
    }
}
