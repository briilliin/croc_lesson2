package com.croc.task5;

public class Annotation {
    private Figure figure;
    private String label;

    public Annotation(Figure figure, String label) {
        this.figure = figure;
        this.label = label;
    }

    public Figure getFigure() {
        return figure;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return getFigure().toString() + ": " + getLabel();
    }
}