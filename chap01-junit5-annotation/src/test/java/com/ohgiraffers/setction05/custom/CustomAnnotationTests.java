package com.ohgiraffers.setction05.custom;

public class CustomAnnotationTests {
    //커스텀어노테이션
    @WindowsTests
    public void testOnWindowOs(){}

    @DevelopmentTest
    public void testDevelopmentCustomTag(){}

    @ProductionTest
    public void testProductionCustomTag(){}
}
