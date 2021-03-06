package com.cmr.beans.mongo;

/**
 * @author : rajith
 */
public class ValueObject {

    private String id;
    private String value;

    public ValueObject() {
    }

    public ValueObject(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
