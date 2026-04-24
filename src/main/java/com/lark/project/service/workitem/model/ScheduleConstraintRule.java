package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class ScheduleConstraintRule {
    @SerializedName("node")
    private Boolean node;

    @SerializedName("sub_task")
    private Boolean subTask;

    @SerializedName("sub_process_node")
    private Boolean subProcessNode;

    @SerializedName("wbs_sub_instance_type")
    private Map<String, Object> wbsSubInstanceType;

    public Boolean getNode() {
        return node;
    }

    public void setNode(Boolean node) {
        this.node = node;
    }

    public Boolean getSubTask() {
        return subTask;
    }

    public void setSubTask(Boolean subTask) {
        this.subTask = subTask;
    }

    public Boolean getSubProcessNode() {
        return subProcessNode;
    }

    public void setSubProcessNode(Boolean subProcessNode) {
        this.subProcessNode = subProcessNode;
    }

    public Map<String, Object> getWbsSubInstanceType() {
        return wbsSubInstanceType;
    }

    public void setWbsSubInstanceType(Map<String, Object> wbsSubInstanceType) {
        this.wbsSubInstanceType = wbsSubInstanceType;
    }
}
