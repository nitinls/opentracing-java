/**
 * Copyright 2016 The OpenTracing Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.opentracing.tag;

public class StringTag extends AbstractTag<String> {
    StringTag(String key) {
        super(key);
    }

    @Override
    public void set(io.opentracing.Span span, String tagValue) {
        span.setTag(super.key, tagValue);
    }

    public void set(io.opentracing.Span span, StringTag tag) {
        span.setTag(super.key, tag.key);
    }
}