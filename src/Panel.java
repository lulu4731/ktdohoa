import javax.swing.*;
import java.awt.*;

public class Panel extends Canvas {

    int[][] board = new int[120][120];
    int x1 = 10, y1 = 10, x2 = 100, y2 = 10, x4 = 10, y4 = 80, x3= 100, y3 = 80;

    public Panel() {
        setSize(600, 600);

    }

    public void putPixel(int i, int j, int color) {
        board[i][j] = color;
        Graphics g = getGraphics();
        g.setColor(new Color(color));
        g.fillRect(i * 5, j * 5, 5, 5);
        g.dispose();

    }

    void lineBresenham(int x1, int y1, int x2, int y2){
        int x, y, Dx, Dy, p;
        Dx = Math.abs(x2 - x1);
        Dy = Math.abs(y2 - y1);
        p = 2*Dy - Dx;
        x = x1;
        y = y1;

        int x_unit = 1, y_unit = 1;


        if (x2 - x1 < 0)
            x_unit = -x_unit;
        if (y2 - y1 < 0)
            y_unit = -y_unit;

        if (x1 == x2)
        {
            while (y != y2)
            {

                y += y_unit;
                putPixel(x, y, 0xfffffc);
            }
        }

        else if (y1 == y2 + 1)
        {
            while (x != x2)
            {

                x += x_unit;
                putPixel(x, y, 0xfffffc);
            }
        }

        else{
            putPixel(x, y, 0xfffffc);
            while(x != x2){

                if (p<0) p += 2*Dy;
                else{
                    p += 2*(Dy-Dx);
                    y += y_unit;
                }
                x += x_unit;
                putPixel(x, y, 0xfffffc);
            }
        }
    }
    void LineBresy (int x1, int y1, int x2, int y2)
    {
        int Dx, Dy, p, Const1, Const2;
        int x, y;

        Dx 	=y2 - y1;
        Dy 	= x2 - x1;
        p 	= 2*Dy - Dx; 	//   (Dy <<1)  - Dx
        Const1 = 2*Dy; 		// Dy <<1
        Const2 = 2*(Dy-Dx); 	// (Dy-Dx) <<1
        x = y1;
        y = x1;
        putPixel(x, y, 0xfffffc);
        for(int i=y1; i<y2; i++)
        {
            if (p<0)   p += Const1;
            else
            {
                p += Const2;
                x++;
            }
            y++;
            putPixel(x, y, 0xffffcc);
        }
    } // LineBres
    void LineBres2(int x1, int y1, int x2, int y2) {
        int Dx, Dy, p, Const1, Const2;
        int x, y;


        Dx = x2 - x1;
        Dy = y2 - y1;
        p = 2 * Dy - Dx;    //   (Dy <<1)  - Dx
        Const1 = 2 * Dy;        // Dy <<1
        Const2 = 2 * (Dy - Dx);    // (Dy-Dx) <<1
        x = x1;
        y = y1;
        int c = 1;
        putPixel(x, y, 0xff0000);
        for (int i = x1; i < x2; i++) {
            if (p < 0) p += Const1;
            else {
                p += Const2;
                y++;
            }
            x++;
            c++;
            if (c < 5) putPixel(x, y, 0xff0000);
            else if (c < 7) {

            } else if (c == 8) {
                putPixel(x, y, 0xff00ff);
            } else if (c < 11) {

            } else {
                c = 0;
            }
        }
    }

    void LineBres3(int x1, int y1, int x2, int y2) {
        int Dx, Dy, p, Const1, Const2;
        int x, y;


        Dx = x2 - x1;
        Dy = y2 - y1;
        p = 2 * Dy - Dx;    //   (Dy <<1)  - Dx
        Const1 = 2 * Dy;        // Dy <<1
        Const2 = 2 * (Dy - Dx);    // (Dy-Dx) <<1
        x = x1;
        y = y1;
        int c = 1;
        putPixel(x, y, 0xff0000);
        for (int i = x1; i < x2; i++) {
            if (p < 0) p += Const1;
            else {
                p += Const2;
                y++;
            }
            x++;
            c++;
            if (c < 5) putPixel(x, y, 0xff0000);
            else if (c < 7) {

            } else if (c == 8) {
                putPixel(x, y, 0xff0000);
            } else if (c < 11) {

            } else {
                c = 0;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        g.fillRect(0, 0, 600, 600);
        lineBresenham(x1, y1, x2, y2);
        lineBresenham(x3, y3, x2, y2);
        lineBresenham(x4, y4, x1, y1);
        lineBresenham(x3, y3, x4, y4);
//        LineBres(x1, y1, x2, y2);
////        LineBresy(x3, y3, x1, y1);
//        LineBresy(x3, y3, x2, y2);
////        LineBres(x4, y4, x1, y1);
////        LineBres(x3, y3, x4, y4);

    }
}
