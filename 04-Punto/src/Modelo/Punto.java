package Modelo;

import Geometria.Geometria;

public class Punto {

    private float x;
    private float y;

	public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistanciaCentro(){
        return Geometria.calcularDistancia(this, new Punto(0,0));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
