package com.ohgiraffers.setction05.custom;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Tag("development")
@EnabledOnOs(value = OS.WINDOWS)
@Test
public @interface DevelopmentTest {
}
// 어노테이션 만드는 과정
