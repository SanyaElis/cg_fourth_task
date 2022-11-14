package ru.vsu.eliseev.cg.screen;

import ru.vsu.eliseev.cg.Math.Vector3;

public class ScreenConverter {
    private int width, height;
    private double xr, yr, wr, hr;

    public ScreenConverter(int width, int height, double xr, double yr, double wr, double hr) {
        this.width = width;
        this.height = height;
        this.xr = xr;
        this.yr = yr;
        this.wr = wr;
        this.hr = hr;
    }
    public ScreenPoint r2s(Vector3 p){
        double x = (p.getX() - xr) / wr * width;
        double y = (yr - p.getY()) / hr * height;
        return new ScreenPoint((int)x, (int) y);
    }
    public Vector3 s2r(ScreenPoint p, float z){
        double x = xr + p.getX() * wr / width;
        double y = yr - p.getY() * hr / height;
        return new Vector3((float)x, (float)y, z);
    }

    public Vector3 s2r(ScreenPoint p){
        return s2r(p, 0f);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getXr() {
        return xr;
    }

    public double getYr() {
        return yr;
    }

    public double getWr() {
        return wr;
    }

    public double getHr() {
        return hr;
    }
}
