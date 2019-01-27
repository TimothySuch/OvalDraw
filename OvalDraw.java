import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Color;

// Author - Timothy Suchomel
// Class  - CPSC-24500-LT1 Object-Oriented Programming
// Week 2 - OvalDraw Lab


class Oval extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        Color myColor = new Color(255, 50, 15);
        g.setColor(myColor);
        g.fillOval(0, 0, panelWidth, panelHeight);

    }
}

class OvalFrame extends JFrame {
    OvalFrame() {
        setTitle("OvalDraw");
        setBounds(200,200,300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Oval myOval = new Oval();
        Container contentPane = getContentPane();
        contentPane.add(myOval);
    }
}

public class OvalDraw {
    public static void main(String[] args) {
        System.out.println("Starting OvalDraw...");

        OvalFrame myFrame = new OvalFrame();
        myFrame.setVisible(true);
    }
}