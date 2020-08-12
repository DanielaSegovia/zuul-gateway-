package com.myweb.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Persons")
public class Person {//implements Serializable {

    //private static final long serialVersionUID = 16237612783867L;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Id
    @Column(columnDefinition = "serial")

    private Long id;
    private String name;
    private String document;

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
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
    

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
    */
}
