package com.lark.project.service.role_conf.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RoleConfUpdate {
    @SerializedName("name")
    private String name;
    @SerializedName("is_owner")
    private Boolean isOwner;
    @SerializedName("role_alias")
    private String roleAlias;
    @SerializedName("member_assign_mode")
    private Integer memberAssignMode;
    @SerializedName("members")
    private List<String> members;
    @SerializedName("is_member_multi")
    private Boolean isMemberMulti;
    @SerializedName("auto_enter_group")
    private Boolean autoEnterGroup;
    @SerializedName("lock_scope")
    private List<String> lockScope;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsOwner() {
        return isOwner;
    }

    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    public String getRoleAlias() {
        return roleAlias;
    }

    public void setRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
    }

    public Integer getMemberAssignMode() {
        return memberAssignMode;
    }

    public void setMemberAssignMode(Integer memberAssignMode) {
        this.memberAssignMode = memberAssignMode;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public Boolean getIsMemberMulti() {
        return isMemberMulti;
    }

    public void setIsMemberMulti(Boolean isMemberMulti) {
        this.isMemberMulti = isMemberMulti;
    }

    public Boolean getAutoEnterGroup() {
        return autoEnterGroup;
    }

    public void setAutoEnterGroup(Boolean autoEnterGroup) {
        this.autoEnterGroup = autoEnterGroup;
    }

    public List<String> getLockScope() {
        return lockScope;
    }

    public void setLockScope(List<String> lockScope) {
        this.lockScope = lockScope;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private Boolean isOwner;
        private String roleAlias;
        private Integer memberAssignMode;
        private List<String> members;
        private Boolean isMemberMulti;
        private Boolean autoEnterGroup;
        private List<String> lockScope;

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder isOwner(Boolean isOwner) {
            this.isOwner = isOwner;
            return this;
        }
        public Builder roleAlias(String roleAlias) {
            this.roleAlias = roleAlias;
            return this;
        }
        public Builder memberAssignMode(Integer memberAssignMode) {
            this.memberAssignMode = memberAssignMode;
            return this;
        }
        public Builder members(List<String> members) {
            this.members = members;
            return this;
        }
        public Builder isMemberMulti(Boolean isMemberMulti) {
            this.isMemberMulti = isMemberMulti;
            return this;
        }
        public Builder autoEnterGroup(Boolean autoEnterGroup) {
            this.autoEnterGroup = autoEnterGroup;
            return this;
        }
        public Builder lockScope(List<String> lockScope) {
            this.lockScope = lockScope;
            return this;
        }
        public RoleConfUpdate build() {
            RoleConfUpdate obj = new RoleConfUpdate();
            obj.setName(name);
            obj.setIsOwner(isOwner);
            obj.setRoleAlias(roleAlias);
            obj.setMemberAssignMode(memberAssignMode);
            obj.setMembers(members);
            obj.setIsMemberMulti(isMemberMulti);
            obj.setAutoEnterGroup(autoEnterGroup);
            obj.setLockScope(lockScope);
            return obj;
        }
    }
}
