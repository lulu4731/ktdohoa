import javax.swing.*;
import java.awt.*;

public class Panel extends Canvas {

    int[][] board = new int[120][120];
    int x1 = 10, y1 = 10, x2 = 80, y2 = 10;

    public Panel() {
        setSize(600, 600);

    }

    public void putPixel(int i, int j, int color) {
        board[i][j] = color;
        Graphics g = getGraphics();
        g.setColor(new Color(color));
        g.fillRect(i*5, j*5,5,5);
        g.dispose();

    }

    void LineBres(int x1, int y1, int x2, int y2) {
        int Dx, Dy, p, Const1, Const2;
        int x, y;


//aaaadhjhfj



        Dx = x2 - x1;
        Dy = y2 - y1;
        p = 2 * Dy - Dx;    //   (Dy <<1)  - Dx
        Const1 = 2 * Dy;        // Dy <<1
        Const2 = 2 * (Dy - Dx);    // (Dy-Dx) <<1
        x = x1;
        y = y1;
        int c=1;
        putPixel(x, y, 0xff0000);
        for (int i = x1; i < x2; i++) {
            if (p < 0) p += Const1;
            else {
                p += Const2;
                y++;
            }
            x++;
            c++;
            if(c < 3) putPixel(x, y, 0xff0000);
            else{
                c=0;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        g.fillRect(0, 0, 600, 600);

        LineBres(x1,y1,x2,y2);

    }
}
