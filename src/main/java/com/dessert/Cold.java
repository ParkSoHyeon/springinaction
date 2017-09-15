package com.dessert;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE.CONSTRUCTOR, ElementType.ANNOTATION_TYPE.FIELD, ElementType.ANNOTATION_TYPE.METHOD, ElementType.ANNOTATION_TYPE.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Cold {
}
