package com.example.demo.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DwgTable {
    private Integer id;

    private String dwgName;

    private String dwgCode;

    private String partNumber;

    private String designer;

    private String auditor;

    private String approver;

    private Date designerTime;

    private Date updateTime;

    private Date auditTime;

    private Date approveTime;

    private Integer count;

    private Integer dwgTypeCode;

    private Integer partTypeCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDwgName() {
        return dwgName;
    }

    public void setDwgName(String dwgName) {
        this.dwgName = dwgName == null ? null : dwgName.trim();
    }

    public String getDwgCode() {
        return dwgCode;
    }

    public void setDwgCode(String dwgCode) {
        this.dwgCode = dwgCode == null ? null : dwgCode.trim();
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber == null ? null : partNumber.trim();
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer == null ? null : designer.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }

    public Date getDesignerTime() {
        return designerTime;
    }

    public void setDesignerTime(Date designerTime) {
        this.designerTime = designerTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getDwgTypeCode() {
        return dwgTypeCode;
    }

    public void setDwgTypeCode(Integer dwgTypeCode) {
        this.dwgTypeCode = dwgTypeCode;
    }

    public Integer getPartTypeCode() {
        return partTypeCode;
    }

    public void setPartTypeCode(Integer partTypeCode) {
        this.partTypeCode = partTypeCode;
    }
}