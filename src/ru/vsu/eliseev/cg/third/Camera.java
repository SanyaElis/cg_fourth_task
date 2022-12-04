package ru.vsu.eliseev.cg.third;

import ru.vsu.eliseev.cg.Math.Matrix4;
import ru.vsu.eliseev.cg.Math.Vector3;
import ru.vsu.eliseev.cg.Math.Vector4;

public class Camera implements ICamera{
    private Matrix4 translate, rotate, scale, projection;

    public Camera() {
        translate = Matrix4.one();
        rotate = Matrix4.one();
        scale = Matrix4.one();
        projection = Matrix4.one();
    }

    @Override
    public Vector4 w2s(Vector3 v) {
        return projection.mul(
                translate.mul(
                        rotate.mul(
                                scale.mul(new Vector4(v)))));
    }
}
