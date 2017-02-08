/*
 * Copyright 2017-present The Material Motion Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.material.motion.streams.sources;

import com.google.android.material.motion.streams.MotionObservable;
import com.google.android.material.motion.streams.springs.FloatVectorizer;
import com.google.android.material.motion.streams.springs.MaterialSpring;
import com.google.android.material.motion.streams.springs.TypeVectorizer;

/**
 * The abstract base class for all spring sources.
 */
public abstract class SpringSource {

  /**
   * Creates a spring source for a float spring.
   * <p>
   * The properties on the <code>spring</code> param may be changed to dynamically modify the
   * behavior of this source.
   */
  public final <O> MotionObservable<Float> create(MaterialSpring<O, Float> spring) {
    return create(spring, new FloatVectorizer());
  }

  /**
   * Creates a spring source for a T valued spring.
   * <p>
   * The properties on the <code>spring</code> param may be changed to dynamically modify the
   * behavior of this source.
   */
  public abstract <O, T> MotionObservable<T> create(
    MaterialSpring<O, T> spring, TypeVectorizer<T> vectorizer);
}
