package com.example.kyc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "WSSTATUS",schema = "CLNT0001")
public class WsStatus {

    @Id
    @Column(name = "WS_REQUEST_UUID", columnDefinition = "nvarchar(100)")
    public String uuid;

    @Column(name = "WS_METHOD_NAME", columnDefinition = "nvarchar(100)")
    public String wsMethodName;

    @Column(name = "REQUEST_TIME_START",columnDefinition = "nchar(100)")
    public String requestTimeStart;

    @Column(name = "REQUEST_TIME_END",columnDefinition = "nchar(100)")
    public String requestTimeEnd;

    @Column(name = "RETURNCODE",columnDefinition = "Integer(100)")
    public int returnCode;

    @Column(name = "SCORING_DIR",columnDefinition = "nchar(100)")
    public String scoringDir;

    @Column(name = "SCORING_TIME_START",columnDefinition = "nchar(100)")
    public String scoringTimeStart;

    @Column(name = "SCORING_TIME_END",columnDefinition = "nchar(100)")
    public String scoringTimeEnd;

    @Column(name = "RELATING_CUSTOMERS",columnDefinition = "nvarchar(2000)")
    public String relatingCustomers;

    @Column(name = "ASYNC_REQUEST_ID",columnDefinition = "nvarchar(300)")
    public String asyncRequestId;

    @Column(name = "TBQ_FORMID",columnDefinition = "INTEGER(100)")
    public Integer tbqFormid;

    @Column(name = "SERVERNAME",columnDefinition = "nvarchar(300)")
    public String serverName;

    public WsStatus(String uuid, String wsMethodName, String requestTimeStart, String requestTimeEnd, int returnCode, String scoringDir, String scoringTimeStart, String scoringTimeEnd, int tbqFormid, String asyncRequestId, String relatingCustomers, String serverName) {
        this.uuid = uuid;
        this.wsMethodName = wsMethodName;
        this.requestTimeStart = requestTimeStart;
        this.requestTimeEnd = requestTimeEnd;
        this.returnCode = returnCode;
        this.scoringDir = scoringDir;
        this.scoringTimeStart = scoringTimeStart;
        this.scoringTimeEnd = scoringTimeEnd;
        this.tbqFormid = tbqFormid;
        this.asyncRequestId = asyncRequestId;
        this.relatingCustomers = relatingCustomers;
        this.serverName = serverName;
    }

    public WsStatus() {}

    public String getRequestTimeEnd() {
        return requestTimeEnd;
    }

    public void setRequestTimeEnd(String requestTimeEnd) {
        this.requestTimeEnd = requestTimeEnd;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getWsMethodName() {
        return wsMethodName;
    }

    public void setWsMethodName(String wsMethodName) {
        this.wsMethodName = wsMethodName;
    }

    public String getRequestTimeStart() {
        return requestTimeStart;
    }

    public void setRequestTimeStart(String requestTimeStart) {
        this.requestTimeStart = requestTimeStart;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public String getScoringDir() {
        return scoringDir;
    }

    public void setScoringDir(String scoringDir) {
        this.scoringDir = scoringDir;
    }

    public String getScoringTimeStart() {
        return scoringTimeStart;
    }

    public void setScoringTimeStart(String scoringTimeStart) {
        this.scoringTimeStart = scoringTimeStart;
    }

    public String getScoringTimeEnd() {
        return scoringTimeEnd;
    }

    public void setScoringTimeEnd(String scoringTimeEnd) {
        this.scoringTimeEnd = scoringTimeEnd;
    }

    public String getRelatingCustomers() {
        return relatingCustomers;
    }

    public void setRelatingCustomers(String relatingCustomers) {
        this.relatingCustomers = relatingCustomers;
    }

    public String getAsyncRequestId() {
        return asyncRequestId;
    }

    public void setAsyncRequestId(String asyncRequestId) {
        this.asyncRequestId = asyncRequestId;
    }

    public Integer getTbqFormid() {return tbqFormid;}

    public void setTbqFormid(Integer tbqFormid) {this.tbqFormid = tbqFormid;}

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

}
