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
 * A function of 0 parameter.
 * 
 * @see "http://www.scala-lang.org/api/2.9.1/index.html#scala.Function0"
 */
public abstract class Function0<R> {

    public R apply() throws Exception {
        return _();
    }

    /**
     * Apply the body of this function to the arguments.
     */
    public abstract R _() throws Exception;

    /**
     * Creates a String representation of this object.
     */
    @Override
    public String toString() {
        return "<function0>";
    }

}
