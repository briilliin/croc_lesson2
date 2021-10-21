package com.croc.task5;

public class AnnotatedImage {

    private final String imagePath;
    private final Annotation[] annotations;

    public AnnotatedImage(String imagePath, Annotation... annotations) {
        this.imagePath = imagePath;
        this.annotations = annotations;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public Annotation[] getAnnotations() {
        return this.annotations;
    }


    Annotation findByPoint(int x, int y) {
        for (Annotation annotation : annotations) {
            if (annotation.getFigure().isPointInside(x, y)) {
                return annotation;
            }
        }
        return null;
    }

    Annotation findByLabel(String label) {
        for (Annotation annotation : annotations) {
            if (label.contains(annotation.getLabel())) {
                return annotation;
            }
        }
        return null;
    }

}
