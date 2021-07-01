package com.tangguanglei.chapter20;

import java.lang.annotation.Annotation;

@AnnotationTest("你好")
public class AnnotationUseCase {

    public static void main(String[] args) {
        Class<AnnotationUseCase> clazz = AnnotationUseCase.class;
        AnnotationTest annotation = clazz.getAnnotation(AnnotationTest.class);
        Class<? extends Annotation> annotationClazz = annotation.annotationType();
        System.out.println(annotation.value());
    }
}
