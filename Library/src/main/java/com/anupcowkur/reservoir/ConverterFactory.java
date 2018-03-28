package com.anupcowkur.reservoir;

import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * @author danxx
 * @date 2018/3/27
 * @desc default json converter factory
 */

public class ConverterFactory implements Converter {

    static Gson gson = new Gson();

    @Override
    public <T> T fromJson(String json, Class<T> clazz) {
        T bean = null;
        try {
            bean = gson.fromJson(json, clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    @Override
    public <T> T fromJson(String json, Type typeOfT) {
        T bean = null;
        try {
            bean = gson.fromJson(json, typeOfT);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    @Override
    public String toJson(Object src) {
        String str = null;
        try {
            str = gson.toJson(src);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}
