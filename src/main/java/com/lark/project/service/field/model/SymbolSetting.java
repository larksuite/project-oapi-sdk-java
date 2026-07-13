package com.lark.project.service.field.model;

import com.google.gson.annotations.SerializedName;

public class SymbolSetting {
    @SerializedName("display")
    private String display;
    @SerializedName("value")
    private String value;
    @SerializedName("layout")
    private String layout;

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }
}
