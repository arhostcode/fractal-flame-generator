package ru.ardyc.fractalflamegenerator.transforms;

import ru.ardyc.fractalflamegenerator.model.world.Point;

public class HyperbolicTransformation implements Transformation {

    @Override
    public Point apply(Point point) {
        double x = point.x();
        double y = point.y();
        double atan = Math.atan(x / y);
        double sqrt = Math.sqrt(x * x + y * y);
        double newX = Math.sin(atan) / sqrt;
        double newY = sqrt * Math.cos(atan);
        return new Point(newX, newY);
    }
}
