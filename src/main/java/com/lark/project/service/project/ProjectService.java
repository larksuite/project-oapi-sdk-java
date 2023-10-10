package com.lark.project.service.project;

import com.lark.project.core.request.RequestOptions;
import com.lark.project.service.project.builder.*;

public interface ProjectService {

    public GetProjectDetailResp getProjectDetail(GetProjectDetailReq req, RequestOptions reqOptions) throws Exception;

    public ListProjectResp listProject(ListProjectReq req, RequestOptions reqOptions) throws Exception;

    public ListProjectBusinessResp listProjectBusiness(ListProjectBusinessReq req, RequestOptions reqOptions) throws Exception;

    public ListProjectTeamResp listProjectTeam(ListProjectTeamReq req, RequestOptions reqOptions) throws Exception;

    public ListProjectWorkItemTypeResp listProjectWorkItemType(ListProjectWorkItemTypeReq req, RequestOptions reqOptions) throws Exception;

}
