import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;


public class doHoa extends Canvas {
    public void paint(Graphics g) {
       g.drawLine(100, 150, 300, 150);
       g.drawLine(200, 50, 200,250);
       g.setColor(Color.red);
    }


    public static void main(String[] args) {
//        doHoa m = new doHoa();
//        JFrame f = new JFrame();
//        f.add(m);
//        f.setSize(400, 400);
//        f.setLocationRelativeTo(null);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);
        JFrame frame = new JFrame();
        frame.setContentPane(new Paint());
        frame.setSize(1000,700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}