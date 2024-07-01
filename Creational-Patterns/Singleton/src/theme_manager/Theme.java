package theme_manager;

public class Theme{
    private String backgroundColor;
    private String fontColor;

    public Theme(String backgroundColor, String fontColor){
        this.backgroundColor = backgroundColor;
        this.fontColor = fontColor;
    }

    public String getBackgroundColor(){
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor){
        this.backgroundColor = backgroundColor;
    }

    public String getFontColor(){
        return fontColor;
    }

    public void setFontColor(String fontColor){
        this.fontColor = fontColor;
    }

    @Override
    public String toString() {
        return "Theme [backgroundColor=" + backgroundColor + ", fontColor=" + fontColor + "]";
    }

}