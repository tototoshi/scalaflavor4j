/*
 * Copyright 2012 M3, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.m3.scalaflavor4j;

/**
 * {@link com.m3.scalaflavor4j.Tuple3} alias
 * 
 * @see "http://www.scala-lang.org/api/2.9.1/index.html#scala.Tuple3"
 */
public class Triple<T1, T2, T3> extends Tuple3<T1, T2, T3> {

    protected Triple(T1 _1, T2 _2, T3 _3) {
        super(_1, _2, _3);
    }

    public static <T1, T2, T3> Triple<T1, T2, T3> apply(T1 _1, T2 _2, T3 _3) {
        return _(_1, _2, _3);
    }

    public static <T1, T2, T3> Triple<T1, T2, T3> _(T1 _1, T2 _2, T3 _3) {
        return new Triple<T1, T2, T3>(_1, _2, _3);
    }

    public static <T1, T2, T3> Option<Tuple3<T1, T2, T3>> unapply(Tuple3<T1, T2, T3> tuple) {
        return Option._(tuple);
    }

}
