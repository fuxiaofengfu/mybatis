/**
 * Copyright (c) 2018-2028 - huawei
 */
package com.my.build.po;

import java.util.Date;

/**
 * tableName : agreement_base
 * remarks : 
 *
 * @mbg.generated 2018-3-4 11:25:33
 */
public class AgreementBase {
    /**
     * columnName : AGREEMENT_BASE_ID jdbcType : VARCHAR
     * remarks : 基地协议连接表id
     *
     * @mbg.generated 2018-3-4 11:25:33
     */
    private String agreementBaseId;

    /**
     * columnName : AGREEMENT_ID jdbcType : VARCHAR
     * remarks : 协议ID
     *
     * @mbg.generated 2018-3-4 11:25:33
     */
    private String agreementId;

    /**
     * columnName : BASE_AND_NURSERY_ID jdbcType : VARCHAR
     * remarks : 苗圃基地ID/苗圃ID
     *
     * @mbg.generated 2018-3-4 11:25:33
     */
    private String baseAndNurseryId;

    /**
     * columnName : TYPE jdbcType : DECIMAL
     * remarks : 类型：1 - 基地，2 - 苗圃
     *
     * @mbg.generated 2018-3-4 11:25:33
     */
    private Byte type;

    /**
     * columnName : LAST_UPDATED_STAMP jdbcType : TIMESTAMP
     * remarks : 
     *
     * @mbg.generated 2018-3-4 11:25:33
     */
    private Date lastUpdatedStamp;

    public String getAgreementBaseId() {
        return agreementBaseId;
    }

    public void setAgreementBaseId(String agreementBaseId) {
        this.agreementBaseId = agreementBaseId;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public String getBaseAndNurseryId() {
        return baseAndNurseryId;
    }

    public void setBaseAndNurseryId(String baseAndNurseryId) {
        this.baseAndNurseryId = baseAndNurseryId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
}