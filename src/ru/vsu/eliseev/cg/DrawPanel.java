package ru.vsu.eliseev.cg;

import ru.vsu.eliseev.cg.Math.Vector3;
import ru.vsu.eliseev.cg.models.Line3D;
import ru.vsu.eliseev.cg.screen.ScreenConverter;
import ru.vsu.eliseev.cg.third.Scene;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class DrawPanel extends JPanel {
    private ScreenConverter sc;
    private Scene scene;

    public DrawPanel() {
        sc = new ScreenConverter(800, 600, -1, 1, 2, 2);

        scene = new Scene();
        scene.getModels().add(new Line3D(new Vector3(0, 0, 0), new Vector3(1, 0, 0)));
        scene.getModels().add(new Line3D(new Vector3(0, 0, 0), new Vector3(0, 1, 0)));
        scene.getModels().add(new Line3D(new Vector3(0, 0, 0), new Vector3(0, 0, 1)));

    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        sc.setSize(getWidth(), getHeight());
        BufferedImage bi = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bi.createGraphics();

        //scene.draw(g2d);
        g.drawImage(bi, 0, 0, null);
        g2d.dispose();
    }
}
