/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.tencent.samples.quic_sample.data;

public class ImageRepository {
    private static String[] imageUrls= {
            "https://stgwhttps.kof.qq.com/1.jpg",
            "https://stgwhttps.kof.qq.com/2.jpg",
            "https://stgwhttps.kof.qq.com/3.jpg",
            "https://stgwhttps.kof.qq.com/4.jpg",
            "https://stgwhttps.kof.qq.com/5.jpg",
            "https://stgwhttps.kof.qq.com/6.jpg",
            "https://stgwhttps.kof.qq.com/7.jpg",
            "https://stgwhttps.kof.qq.com/8.jpg"

    };

    public static int numberOfImages() {
        return imageUrls.length;
    }

    public static String getImage(int position) {
        return imageUrls[position];
    }
}
