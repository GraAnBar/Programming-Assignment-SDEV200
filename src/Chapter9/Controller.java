package Chapter9;


public class Controller {
    enum Style{
        PLAYSTATION, XBOX, STEAM, NINTENDO
    }
    
    private Style style;
    private boolean playstyle;
    private String favoritegames;
    
    public Controller() {
    }
    
    public Controller(Style style, String favoritegames) {
        this.style = style;
        this.favoritegames = favoritegames;
    }
    
    public Style getStyle() {
        return style;
    }
    
    public void setStyle(Style style) {
        this.style= style;
    }
    
    public boolean isPlaystyle() {
        return playstyle;
    }
    
    public void setPlaystyle(boolean playstyle) {
        this.playstyle = playstyle;
    }
    
    public String getFavoritegames() {
        return favoritegames;
    }
    
    public void setFavoritegames(String favoritegames) {
        this.favoritegames = favoritegames;
    }

    @Override
    public String toString() {
        return "Controller{" + "style=" + style + ", playstyle=" + playstyle + ", favoritegames=" + favoritegames + '}';
    }     
    
    @Override
    public boolean equals(Object obj) {
        Controller other = (Controller)obj;
        return this.getFavoritegames() == other.getFavoritegames();
    }
    
    
}
