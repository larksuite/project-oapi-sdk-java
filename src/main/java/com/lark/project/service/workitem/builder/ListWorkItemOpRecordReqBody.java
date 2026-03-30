package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ListWorkItemOpRecordReqBody {
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("work_item_ids")
    private List<Long> workItemIds;
    @SerializedName("start_from")
    private String startFrom;
    @SerializedName("operator")
    private List<String> operator;
    @SerializedName("operator_type")
    private List<String> operatorType;
    @SerializedName("source_type")
    private List<String> sourceType;
    @SerializedName("source")
    private List<String> source;
    @SerializedName("operation_type")
    private List<String> operationType;
    @SerializedName("start")
    private Long start;
    @SerializedName("end")
    private Long end;
    @SerializedName("op_record_module")
    private List<String> opRecordModule;
    @SerializedName("page_size")
    private Long pageSize;

    public String getProjectKey() { return projectKey; }
    public void setProjectKey(String projectKey) { this.projectKey = projectKey; }

    public List<Long> getWorkItemIds() { return workItemIds; }
    public void setWorkItemIds(List<Long> workItemIds) { this.workItemIds = workItemIds; }

    public String getStartFrom() { return startFrom; }
    public void setStartFrom(String startFrom) { this.startFrom = startFrom; }

    public List<String> getOperator() { return operator; }
    public void setOperator(List<String> operator) { this.operator = operator; }

    public List<String> getOperatorType() { return operatorType; }
    public void setOperatorType(List<String> operatorType) { this.operatorType = operatorType; }

    public List<String> getSourceType() { return sourceType; }
    public void setSourceType(List<String> sourceType) { this.sourceType = sourceType; }

    public List<String> getSource() { return source; }
    public void setSource(List<String> source) { this.source = source; }

    public List<String> getOperationType() { return operationType; }
    public void setOperationType(List<String> operationType) { this.operationType = operationType; }

    public Long getStart() { return start; }
    public void setStart(Long start) { this.start = start; }

    public Long getEnd() { return end; }
    public void setEnd(Long end) { this.end = end; }

    public List<String> getOpRecordModule() { return opRecordModule; }
    public void setOpRecordModule(List<String> opRecordModule) { this.opRecordModule = opRecordModule; }

    public Long getPageSize() { return pageSize; }
    public void setPageSize(Long pageSize) { this.pageSize = pageSize; }
}
