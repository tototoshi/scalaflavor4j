package com.m3.scalaflavor4j;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Tuple3Test {

    @Test
    public void type() throws Exception {
        assertThat(Tuple3.class, notNullValue());
    }

    @Test
    public void _1_A$() throws Exception {
        String _1 = "foo";
        Integer _2 = 123;
        Long _3 = 456L;
        Tuple3<String, Integer, Long> target = Tuple3.apply(_1, _2, _3);
        String actual = target._1();
        String expected = "foo";
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void _2_A$() throws Exception {
        String _1 = "foo";
        Integer _2 = 123;
        Long _3 = 456L;
        Tuple3<String, Integer, Long> target = Tuple3.apply(_1, _2, _3);
        Integer actual = target._2();
        Integer expected = 123;
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void _3_A$() throws Exception {
        String _1 = "foo";
        Integer _2 = 123;
        Long _3 = 456L;
        Tuple3<String, Integer, Long> target = Tuple3.apply(_1, _2, _3);
        Long actual = target._3();
        Long expected = 456L;
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void apply_A$Object$Object$Object() throws Exception {
        Tuple3<String, Integer, Long> actual = Tuple3.apply("a", 1, 2L);
        assertThat(actual, is(notNullValue()));
    }

    @Test
    public void __A$Object$Object$Object() throws Exception {
        Tuple3<String, Integer, Long> actual = Tuple3._("a", 1, 2L);
        assertThat(actual, is(notNullValue()));
    }

    @Test
    public void instantiation() throws Exception {
        Tuple3<String, Integer, Long> tuple = new Tuple3<String, Integer, Long>("a", 1, 2L);
        assertThat(tuple, notNullValue());
    }

    @Test
    public void unapply_A$Tuple3() throws Exception {
        Tuple3<String, Integer, Long> tuple = Tuple3._("a", 1, 2L);
        Option<Tuple3<String, Integer, Long>> actual = Tuple3.unapply(tuple);
        assertThat(actual, notNullValue());
    }

    @Test
    public void toString_A$() throws Exception {
        String actual = Tuple3._(1, 2, 3).toString();
        String expected = "(1,2,3)";
        assertThat(actual, is(equalTo(expected)));
    }

}
