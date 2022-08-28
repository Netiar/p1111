
package com.example.p1111.models;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Category implements Serializable
{

    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("title")
    @Expose
    private String title;
    private final static long serialVersionUID = 5543291628433514173L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Category() {
    }

    /**
     * 
     * @param alias
     * @param title
     */
    public Category(String alias, String title) {
        super();
        this.alias = alias;
        this.title = title;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
