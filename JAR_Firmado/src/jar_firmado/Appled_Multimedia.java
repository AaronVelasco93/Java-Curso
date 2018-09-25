package jar_firmado;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JApplet;

public class Appled_Multimedia extends JApplet {

    @Override
    public void init() {

        logo = getImage(getDocumentBase(), "Puma.png");

    }

    public void paint(Graphics g) {

        g.drawImage(logo, 50, 50, this);

    }

    Image logo;

}
