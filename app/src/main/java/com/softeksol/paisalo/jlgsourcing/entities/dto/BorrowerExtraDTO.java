package com.softeksol.paisalo.jlgsourcing.entities.dto;

import com.google.gson.annotations.Expose;

/**
 * Created by sachindra on 2016-10-04.
 */

public class BorrowerExtraDTO {
    @Expose
    private long Code;

    @Expose
    private String Tag;

    @Expose
    private String Creator;

    @Expose
    private int FutureIncome;

    @Expose
    private int OtherDependents;

    @Expose
    private int NoOfChildren;

    @Expose
    private int SchoolingChildren;

    @Expose
    private int SpendOnChildren;

    @Expose
    private String FamIncomeSource;

    @Expose
    private int FamMonthlyIncome;

    @Expose
    private String FamOccupation;

    @Expose
    private String FamJobCompType;

    @Expose
    private String FamJobCompName;

    @Expose
    private String FamBusinessType;

    @Expose
    private String FamBusinessShopType;

    @Expose
    private String FamAgriLandOwner;

    @Expose
    private String FamAgriLandType;

    @Expose
    private int FamAgriLandArea;

    @Expose
    private String FamOtherIncomeType;

    @Expose
    private String OtherContactPerson;

    @Expose
    private String OtherContactMob;

    @Expose
    private String IMEINO;

    public long getCode() {
        return Code;
    }

    public void setCode(long code) {
        Code = code;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public String getCreator() {
        return Creator;
    }

    public void setCreator(String creator) {
        Creator = creator;
    }

    public int getFutureIncome() {
        return FutureIncome;
    }

    public void setFutureIncome(int futureIncome) {
        FutureIncome = futureIncome;
    }

    public int getOtherDependents() {
        return OtherDependents;
    }

    public void setOtherDependents(int otherDependents) {
        OtherDependents = otherDependents;
    }

    public int getNoOfChildren() {
        return NoOfChildren;
    }

    public void setNoOfChildren(int noOfChildren) {
        NoOfChildren = noOfChildren;
    }

    public int getSchoolingChildren() {
        return SchoolingChildren;
    }

    public void setSchoolingChildren(int schoolingChildren) {
        SchoolingChildren = schoolingChildren;
    }

    public int getSpendOnChildren() {
        return SpendOnChildren;
    }

    public void setSpendOnChildren(int spendOnChildren) {
        SpendOnChildren = spendOnChildren;
    }

    public String getFamIncomeSource() {
        return FamIncomeSource;
    }

    public void setFamIncomeSource(String famIncomeSource) {
        FamIncomeSource = famIncomeSource;
    }

    public int getFamMonthlyIncome() {
        return FamMonthlyIncome;
    }

    public void setFamMonthlyIncome(int famMonthlyIncome) {
        FamMonthlyIncome = famMonthlyIncome;
    }

    public String getFamOccupation() {
        return FamOccupation;
    }

    public void setFamOccupation(String famOccupation) {
        FamOccupation = famOccupation;
    }

    public String getFamJobCompType() {
        return FamJobCompType;
    }

    public void setFamJobCompType(String famJobCompType) {
        FamJobCompType = famJobCompType;
    }

    public String getFamJobCompName() {
        return FamJobCompName;
    }

    public void setFamJobCompName(String famJobCompName) {
        FamJobCompName = famJobCompName;
    }

    public String getFamBusinessType() {
        return FamBusinessType;
    }

    public void setFamBusinessType(String famBusinessType) {
        FamBusinessType = famBusinessType;
    }

    public String getFamBusinessShopType() {
        return FamBusinessShopType;
    }

    public void setFamBusinessShopType(String famBusinessShopType) {
        FamBusinessShopType = famBusinessShopType;
    }

    public String getFamAgriLandOwner() {
        return FamAgriLandOwner;
    }

    public void setFamAgriLandOwner(String famAgriLandOwner) {
        FamAgriLandOwner = famAgriLandOwner;
    }

    public String getFamAgriLandType() {
        return FamAgriLandType;
    }

    public void setFamAgriLandType(String famAgriLandType) {
        FamAgriLandType = famAgriLandType;
    }

    public int getFamAgriLandArea() {
        return FamAgriLandArea;
    }

    public void setFamAgriLandArea(int famAgriLandArea) {
        FamAgriLandArea = famAgriLandArea;
    }

    public String getFamOtherIncomeType() {
        return FamOtherIncomeType;
    }

    public void setFamOtherIncomeType(String famOtherIncomeType) {
        FamOtherIncomeType = famOtherIncomeType;
    }

    public String getOtherContactPerson() {
        return OtherContactPerson;
    }

    public void setOtherContactPerson(String otherContactPerson) {
        OtherContactPerson = otherContactPerson;
    }

    public String getOtherContactMob() {
        return OtherContactMob;
    }

    public void setOtherContactMob(String otherContactMob) {
        OtherContactMob = otherContactMob;
    }

    public String getIMEINO() {
        return IMEINO;
    }

    public void setIMEINO(String IMEINO) {
        this.IMEINO = IMEINO;
    }

    @Override
    public String toString() {
        return "BorrowerExtraDTO{" +
                "Code=" + Code +
                ", Tag='" + Tag + '\'' +
                ", Creator='" + Creator + '\'' +
                ", FutureIncome=" + FutureIncome +
                ", OtherDependents=" + OtherDependents +
                ", NoOfChildren=" + NoOfChildren +
                ", SchoolingChildren=" + SchoolingChildren +
                ", SpendOnChildren=" + SpendOnChildren +
                ", FamIncomeSource='" + FamIncomeSource + '\'' +
                ", FamMonthlyIncome=" + FamMonthlyIncome +
                ", FamOccupation='" + FamOccupation + '\'' +
                ", FamJobCompType='" + FamJobCompType + '\'' +
                ", FamJobCompName='" + FamJobCompName + '\'' +
                ", FamBusinessType='" + FamBusinessType + '\'' +
                ", FamBusinessShopType='" + FamBusinessShopType + '\'' +
                ", FamAgriLandOwner='" + FamAgriLandOwner + '\'' +
                ", FamAgriLandType='" + FamAgriLandType + '\'' +
                ", FamAgriLandArea=" + FamAgriLandArea +
                ", FamOtherIncomeType='" + FamOtherIncomeType + '\'' +
                ", OtherContactPerson='" + OtherContactPerson + '\'' +
                ", OtherContactMob='" + OtherContactMob + '\'' +
                ", IMEINO='" + IMEINO + '\'' +
                '}';
    }
}
