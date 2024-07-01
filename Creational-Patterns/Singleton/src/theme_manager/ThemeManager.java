package theme_manager;

public class ThemeManager{
    private static ThemeManager instance;
    private Theme currentTheme;

    // Default settings 
    private ThemeManager(){
        currentTheme = new Theme("Pink", "White");
    }

    // Here we force it to use only one instance of the theme.
    public static synchronized ThemeManager getInstance(){
        if(instance == null){
            instance = new ThemeManager();
        }
        return instance;
    }

    public Theme getCurrentTheme(){
        return currentTheme;
    }

    public void setCurrentTheme(Theme theme){
        currentTheme = theme;
        System.out.println("Theme updated to: " + theme);
    }

}