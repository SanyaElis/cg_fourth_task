package ru.vsu.eliseev.cg.models;

import ru.vsu.eliseev.cg.third.IModel;
import ru.vsu.eliseev.cg.Math.Vector3;
import ru.vsu.eliseev.cg.third.PolyLine3D;

import java.util.ArrayList;
import java.util.List;

public class Line3D implements IModel {
    private Vector3 p1, p2;

    public Line3D(Vector3 p1, Vector3 p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public List<PolyLine3D> getLines() {
        List<Vector3> points = new ArrayList<>();
        points.add(p1);
        points.add(p2);
        PolyLine3D p = new PolyLine3D(points, false);
        List<PolyLine3D> answer = new ArrayList<>();
        answer.add(p);
        return answer;
    }
}
