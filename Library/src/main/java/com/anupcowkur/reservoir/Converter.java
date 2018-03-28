package com.anupcowkur.reservoir;

import java.lang.reflect.Type;

/**
 * @author danxx
 * @date 2018/3/27
 * @desc Converter objects
 */

public interface Converter {

    <T> T fromJson(String json, Class<T> clazz);

    <T> T fromJson(String json, Type typeOfT);

    String toJson(Object src);

}
