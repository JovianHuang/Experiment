package Hello_applet;

import java.applet.Applet;
import java.awt.*;

public class Hello_applet extends Applet {
  public void paint(Graphics g) {
    g.drawString("Hello World", 5, 35);
  }
}
