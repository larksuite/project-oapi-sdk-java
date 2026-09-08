package com.lark.project.service.file.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class MultipartInfo {
    @SerializedName("is_new")
    private Boolean isNew;
    @SerializedName("part_count")
    private Integer partCount;
    @SerializedName("part_size")
    private Long partSize;
    @SerializedName("need")
    private List<Integer> need;

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Integer getPartCount() {
        return partCount;
    }

    public void setPartCount(Integer partCount) {
        this.partCount = partCount;
    }

    public Long getPartSize() {
        return partSize;
    }

    public void setPartSize(Long partSize) {
        this.partSize = partSize;
    }

    public List<Integer> getNeed() {
        return need;
    }

    public void setNeed(List<Integer> need) {
        this.need = need;
    }
}
