import javafx.scene.control.*;
import javafx.scene.paint.*;

public class Pixel extends Button {
  
  private int posX;
  private int posY;
  private Color farbe;

  public Pixel(int spalte, int zeile) {
    super();
    this.posX = spalte;
    this.posY = zeile; 
    this.farbe = Color.WHITE;
  }
  
  public int getX() {
    return this.posX;
  }
  
  public int getY() {
    return this.posY;
  }
  
  public void setFarbe(Color f) {
    this.farbe = f;  
  }
  
  public Color getFarbe() {
    return this.farbe;  
  }
  
}
