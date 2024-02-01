package com.ohgiraffers.section02.lifecycle;

import org.junit.jupiter.api.*;

public class LifecycleAnnotationTests {
    /*
    * 모든 테스트 메소드와 라이프 사이클 관련 메소드는 abstract이면 안되고, void 형으로 작성해야 한다.
    * 또한 접근 제한자는 사용하지 않아도 되지만 (default), private이면 안된다.
    * */
    @BeforeAll //테스트가 실행하기전에 딱 한번 실행됨
    public static void beforeAll(){
        System.out.println("beforeAll");
    }

    @BeforeEach // 테스트 메서드 실행 이전에 수행
    public void beforeEach(){
        System.out.println("beforeEach");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    /*
    * 각각의 테스트 메소드가 동작한 직후 동작한다.
    * @Test, @ReperatedTest, @ParameterizedTest, @testFactory가 실행된 이후 동작한다.
    * 주로 단위 테스트들이 수행된 이후 사용한 자원을 해제할 목적으로 사용한다.
    * */

    @AfterEach // 테스트 메서드 실행 이후 수행
    public void afterEach(){
        System.out.println("afterEach");
    }

    @AfterAll // 테스트 메서드를 모두 실행한후 딱 한번 실행됨 static 넣어야됨
    public static void afterAll(){
        System.out.println("afterAll");
    }
}

