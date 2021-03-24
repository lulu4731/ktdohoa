import javax.swing.*;
import java.awt.*;

public class Paint extends JPanel {
    private JPanel rootPanel;
    private JPanel mainPanel;
    private JLabel label;

    public Paint() {
        setPreferredSize(new Dimension(1000, 700));
        add(rootPanel);
        Panel p = new Panel();

        mainPanel.add(p);

        repaint();
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);

        System.out.println("ddd");
        g.setColor(Color.red);
        g.fillRect(0, 0, 200, 200);

    }

}
