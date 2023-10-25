package com.lark.project.service.project;

import com.lark.project.core.request.RequestOptions;
import com.lark.project.service.project.builder.*;

public interface ProjectService {

    // 获取空间详情
    public GetProjectDetailResp getProjectDetail(GetProjectDetailReq req, RequestOptions reqOptions) throws Exception;

    // 获取空间列表
    public ListProjectResp listProject(ListProjectReq req, RequestOptions reqOptions) throws Exception;

    // 获取空间下业务线详情
    public ListProjectBusinessResp listProjectBusiness(ListProjectBusinessReq req, RequestOptions reqOptions) throws Exception;

    // 获取空间下团队人员
    public ListProjectTeamResp listProjectTeam(ListProjectTeamReq req, RequestOptions reqOptions) throws Exception;

    // 获取空间下工作项类型
    public ListProjectWorkItemTypeResp listProjectWorkItemType(ListProjectWorkItemTypeReq req, RequestOptions reqOptions) throws Exception;

}
