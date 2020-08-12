/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myweb.service.model;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Daniela Segovia
 */
public class Person {

    public Long id;
    public String name;
    public String document;

    public Person() {
    }

    public Person(Long id, String name, String document) {
        this.id = id;
        this.name = name;
        this.document = document;
    }
    
    /*
    public void set(Person other) {
        name = other.name;
        document = other.document;
    }
    */
    /*
    public Map<String, Object> reosurce() {
        Map<String, Object> result = new HashMap<>();
        for (Field field : getClass().getDeclaredFields()) {
            try {
                result.put(field.getName(), field.get(this));
            } catch (Exception err) {

            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Nombre:" + name + "Documento:" + document;

    }*/
}
