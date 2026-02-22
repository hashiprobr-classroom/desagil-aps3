package br.edu.insper.desagil.aps3.horizon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubTerritory extends Region {
    private List<Point> points;
    private Map<Point, Unit> units;

    public SubTerritory(String name, List<Point> points) {
        super(name);
        this.points = points;
        this.units = new HashMap<>();
    }

    public List<Point> getPoints() {
        return points;
    }

    public Map<Point, Unit> getUnits() {
        return units;
    }

    @Override
    public double area() {
        return hull();
    }

    private double hull() {
        return 0;
    }
}
