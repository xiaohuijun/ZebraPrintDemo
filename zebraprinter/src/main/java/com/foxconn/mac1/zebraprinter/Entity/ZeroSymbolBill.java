package com.foxconn.mac1.zebraprinter.Entity;

/**
 * Model of ZeroSymbolBill
 *
 * Example：
 *
 * W,NEW00182631190729C0001,P2a-J60102,2T459M000-000-G5,20190729,WmL-J76036,2200,PCS,VCN00182631190729C0001
 * W,NEW00182631190729C0002,P2a-J60102,2T459M000-000-G5,20190729,WmL-J76036,5000,PCS,VCN00182631190729C0001
 */
public class ZeroSymbolBill {

    /**
     * 类型：W
     */
    private String type;
    /**
     * 料号：2T459M000-000-G5
     */
    private String pn;
    /**
     * 数量：7200
     */
    private Integer qty;
    /**
     * 拆分：5000
     */
    private Integer splitQty;
    /**
     * 单位：PCS
     */
    private String unit;

    /**
     * 旧 GUID：VCN00182631190729C0001
     */
    private String oldGuid;
    /**
     * 新 GUID：NEW00182631190729C0001
     */
    private String newGuid;
    /**
     * 日期：20190729
     */
    private String date;

    /**
     * 预留字段 1：P2a-J60102
     */
    private String var1;
    /**
     * 预留字段 2：WmL-J76036
     */
    private String var2;


    /**
     * Getter & Setter
     */

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getSplitQty() {
        return splitQty;
    }

    public void setSplitQty(Integer splitQty) {
        this.splitQty = splitQty;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getOldGuid() {
        return oldGuid;
    }

    public void setOldGuid(String oldGuid) {
        this.oldGuid = oldGuid;
    }

    public String getNewGuid() {
        return newGuid;
    }

    public void setNewGuid(String newGuid) {
        this.newGuid = newGuid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }
}