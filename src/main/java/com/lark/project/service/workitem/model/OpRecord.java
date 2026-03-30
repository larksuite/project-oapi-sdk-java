package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class OpRecord {
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("operation_type")
    private String operationType;
    @SerializedName("operation_time")
    private Long operationTime;
    @SerializedName("work_item_id")
    private Long workItemID;
    @SerializedName("operator_type")
    private String operatorType;
    @SerializedName("operator")
    private String operator;
    @SerializedName("op_record_module")
    private String opRecordModule;
    @SerializedName("source_type")
    private String sourceType;
    @SerializedName("source")
    private String source;
    @SerializedName("record_contents")
    private List<RecordContent> recordContents;
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;

    public String getProjectKey() { return projectKey; }
    public void setProjectKey(String projectKey) { this.projectKey = projectKey; }

    public String getOperationType() { return operationType; }
    public void setOperationType(String operationType) { this.operationType = operationType; }

    public Long getOperationTime() { return operationTime; }
    public void setOperationTime(Long operationTime) { this.operationTime = operationTime; }

    public Long getWorkItemID() { return workItemID; }
    public void setWorkItemID(Long workItemID) { this.workItemID = workItemID; }

    public String getOperatorType() { return operatorType; }
    public void setOperatorType(String operatorType) { this.operatorType = operatorType; }

    public String getOperator() { return operator; }
    public void setOperator(String operator) { this.operator = operator; }

    public String getOpRecordModule() { return opRecordModule; }
    public void setOpRecordModule(String opRecordModule) { this.opRecordModule = opRecordModule; }

    public String getSourceType() { return sourceType; }
    public void setSourceType(String sourceType) { this.sourceType = sourceType; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public List<RecordContent> getRecordContents() { return recordContents; }
    public void setRecordContents(List<RecordContent> recordContents) { this.recordContents = recordContents; }

    public String getWorkItemTypeKey() { return workItemTypeKey; }
    public void setWorkItemTypeKey(String workItemTypeKey) { this.workItemTypeKey = workItemTypeKey; }
}
