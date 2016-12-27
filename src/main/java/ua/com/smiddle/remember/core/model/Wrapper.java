package ua.com.smiddle.remember.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author ksa on 27.12.16.
 * @project remember
 */
@JsonIgnoreProperties
public class Wrapper {
    private String value;


    //Constructors
    public Wrapper(String value) {
        this.value = value;
    }

    public Wrapper() {
    }


    //Getters and setters
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    //Methods
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wrapper{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
