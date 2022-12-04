package ru.vsu.eliseev.cg.third;

import ru.vsu.eliseev.cg.Math.Vector3;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Scene {
    private List<IModel> models = new ArrayList<>();

    public List<IModel> getModels(){
        return models;
    }
    public void draw(Graphics2D g2d, ICamera camera){

        List<PolyLine3D> toDraw = new LinkedList<>();
        for (IModel m : models) {
            for (PolyLine3D p : m.getLines()){
                List<Vector3> points = new LinkedList<>();
                for (Vector3 v : p.getPoints()){

                }
            }
        }
    }
}
