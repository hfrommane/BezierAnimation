package com.fun.bezieranimation;

import android.animation.TypeEvaluator;

/**
 * Created by HZF on 2016/10/26.
 */

public class BezierEvaluator implements TypeEvaluator<Point> {

    private Point controlPoint;

    public BezierEvaluator(Point controlPoint) {
        this.controlPoint = controlPoint;
    }

    @Override
    public Point evaluate(float t, Point startValue, Point endValue) {
        int x = (int) ((1 - t) * (1 - t) * startValue.getX() + 2 * t * (1 - t) * controlPoint.getX() + t * t * endValue.getX());
        int y = (int) ((1 - t) * (1 - t) * startValue.getY() + 2 * t * (1 - t) * controlPoint.getY() + t * t * endValue.getY());
        return new Point(x, y);
    }

}
