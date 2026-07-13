package com.lark.project.service.field.model;

import com.google.gson.annotations.SerializedName;

public class NumberConfig {
    @SerializedName("thousandth")
    private Boolean thousandth;
    @SerializedName("scaling_ratio")
    private String scalingRatio;
    @SerializedName("display_digits")
    private Integer displayDigits;
    @SerializedName("symbol_setting")
    private SymbolSetting symbolSetting;

    public Boolean getThousandth() {
        return thousandth;
    }

    public void setThousandth(Boolean thousandth) {
        this.thousandth = thousandth;
    }

    public String getScalingRatio() {
        return scalingRatio;
    }

    public void setScalingRatio(String scalingRatio) {
        this.scalingRatio = scalingRatio;
    }

    public Integer getDisplayDigits() {
        return displayDigits;
    }

    public void setDisplayDigits(Integer displayDigits) {
        this.displayDigits = displayDigits;
    }

    public SymbolSetting getSymbolSetting() {
        return symbolSetting;
    }

    public void setSymbolSetting(SymbolSetting symbolSetting) {
        this.symbolSetting = symbolSetting;
    }
}
