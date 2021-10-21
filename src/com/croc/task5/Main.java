package com.croc.task5;

public class Main {



        public static void main(String[] args) {

            Annotation[] annotations = new Annotation[]{
                    new Annotation(new Circle(100, 100, 10), "Tree"),
                    new Annotation(new Rectangle(100, 100, 150, 200), "Car")
            };

            AnnotatedImage image = new AnnotatedImage("croc.jpeg", annotations);

            Annotation findLabel = image.findByLabel("Car");
            Annotation findPoint = image.findByPoint(100, 100);
            System.out.println(findLabel);
            System.out.println(findPoint);
            System.out.println("-----------------------------------------------------------------------------");


            System.out.println(image.findByPoint(0, 0));
            System.out.println(image.findByLabel("House"));
            System.out.println("-----------------------------------------------------------------------------");

            for (Annotation annotation : image.getAnnotations()) {
                System.out.println(annotation);
            }

            System.out.println("-----------------------------------------------------------------------------");

            for (Annotation annotation : image.getAnnotations()) {
                annotation.getFigure().move(100, 100);
                System.out.println(annotation);
            }


        }
}
