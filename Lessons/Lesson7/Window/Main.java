package Lesson7.Window;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//class SimpleMouseListener implements MouseListener{
//
//    @Override
//    public void mouseClicked(MouseEvent e) {
//        System.out.println(e.getX() + " " + e.getY());
//    }
//
//    @Override
//    public void mousePressed(MouseEvent e) {}
//
//    @Override
//    public void mouseReleased(MouseEvent e) {}
//
//    @Override
//    public void mouseEntered(MouseEvent e) {}
//
//    @Override
//    public void mouseExited(MouseEvent e) {}
//}
//
//public class Main {

class MyFrame extends JFrame {
    MyFrame() {
        setSize(400, 300);
        setVisible(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setLocation(e.getXOnScreen() - getWidth() / 2, e.getYOnScreen() - getHeight() / 2);
            }
        });
}

    public static void main(String[] args) {
        new MyFrame();

    }
}

