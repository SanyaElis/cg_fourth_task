package ru.vsu.eliseev.cg.Math;

public class Vector4 {
    private final float[] values;

    public Vector4(float x, float y, float z, float w) {
        values = new float[]{x, y, z, w};
    }

    public Vector4(float x, float y, float z) {
        this(x, y, z, 0);
    }

    public Vector4(Vector3 v, float w) {
        this(v.getX(), v.getY(), v.getZ(), w);
    }

    public Vector4(Vector3 v) {
        this(v, 0);
    }

    private Vector4(float[] array) {
        this.values = array;
    }

    public static Vector4 zero(){
        return new Vector4(new float[4]);
    }

    public Vector4 mul(float n){
        float[] a = new float[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = at(i) * n;
        }
        return new Vector4(a);
    }

    public Vector4 add(Vector4 v){
        float[] a = new float[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = at(i) + v.at(i);
        }
        return new Vector4(a);
    }

    public Vector3 asV3() {
        Vector4 v = normolizedW();
        return new Vector3(v.getX(), v.getY(), v.getZ());
    }

    private static final float EPS = 1e-8f;

    public Vector4 normolizedW() {
        if (Math.abs(getW()) < EPS) {
            return new Vector4(getX(), getY(), getZ(), getW());
        }
        return new Vector4(getX() / getW(), getY() / getW(), getZ() / getW(), 1f);
    }

    public float getX() {
        return values[0];
    }

    public float getY() {
        return values[1];
    }

    public float getZ() {
        return values[2];
    }

    public float getW() {
        return values[3];
    }

    public float at(int index) {
        return values[index];
    }
}