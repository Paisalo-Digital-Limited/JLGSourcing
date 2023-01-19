package com.softeksol.paisalo.jlgsourcing.entities;

import com.google.gson.annotations.Expose;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ModelContainer;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;
import com.softeksol.paisalo.jlgsourcing.DbIGL;
import com.softeksol.paisalo.jlgsourcing.entities.dto.BorrowerExtraDTO;

import java.io.Serializable;

/**
 * Created by sachindra on 2016-10-04.
 */
@ModelContainer
@Table(database = DbIGL.class)
public class BorrowerExtra extends BaseModel implements Serializable {
    @Expose
    @Column
    public long Code;

    @Expose
    @Column
    public String Tag;

    @Expose
    @Column
    public String Creator;

    @Expose
    @Column
    public int FutureIncome;

    @Expose
    @Column
    public int OtherDependents;

    @Expose
    @Column
    public int NoOfChildren;

    @Expose
    @Column
    public int SchoolingChildren;

    @Expose
    @Column
    public int SpendOnChildren;

    @Expose
    @Column
    public String FamIncomeSource;

    @Expose
    @Column
    public int FamMonthlyIncome;

    @Expose
    @Column
    public String FamOccupation;

    @Expose
    @Column
    public String FamJobCompType;

    @Expose
    @Column
    public String FamJobCompName;

    @Expose
    @Column
    public String FamBusinessType;

    @Expose
    @Column
    public String FamBusinessShopType;

    @Expose
    @Column
    public String FamAgriLandOwner;

    @Expose
    @Column
    public String FamAgriLandType;

    @Expose
    @Column
    public int FamAgriLandArea;

    @Expose
    @Column
    public String FamOtherIncomeType;

    @Expose
    @Column
    public String OtherContactPerson;

    @Expose
    @Column
    public String OtherContactMob;

    @Expose
    @Column
    public String IMEINO;

    @Column
    @PrimaryKey(autoincrement = true)
    long id;

    @Column
    long FiID;

    @Override
    public String toString() {
        return "BorrowerExtra{" +
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
                ", id=" + id +
                ", FiID=" + FiID +
                '}';
    }

    public BorrowerExtraDTO getExtraDTO() {
        BorrowerExtraDTO borrowerExtraDTO = new BorrowerExtraDTO();
        borrowerExtraDTO.setCode(this.Code);
        borrowerExtraDTO.setCreator(this.Creator);
        borrowerExtraDTO.setFamAgriLandArea(this.FamAgriLandArea);
        borrowerExtraDTO.setFamAgriLandOwner(this.FamAgriLandOwner);
        borrowerExtraDTO.setFamAgriLandType(this.FamAgriLandType);
        borrowerExtraDTO.setFamBusinessShopType(this.FamBusinessShopType);
        borrowerExtraDTO.setFamBusinessType(this.FamBusinessType);
        borrowerExtraDTO.setFamIncomeSource(this.FamIncomeSource);
        borrowerExtraDTO.setFamJobCompName(this.FamJobCompName);
        borrowerExtraDTO.setFamJobCompType(this.FamJobCompType);
        borrowerExtraDTO.setFamMonthlyIncome(this.FamMonthlyIncome);
        borrowerExtraDTO.setFamOccupation(this.FamOccupation);
        borrowerExtraDTO.setFamOtherIncomeType(this.FamOtherIncomeType);
        borrowerExtraDTO.setFutureIncome(this.FutureIncome);
        borrowerExtraDTO.setIMEINO(this.IMEINO);
        borrowerExtraDTO.setNoOfChildren(this.NoOfChildren);
        borrowerExtraDTO.setOtherContactMob(this.OtherContactMob);
        borrowerExtraDTO.setOtherContactPerson(this.OtherContactPerson);
        borrowerExtraDTO.setOtherDependents(this.OtherDependents);
        borrowerExtraDTO.setSchoolingChildren(this.SchoolingChildren);
        borrowerExtraDTO.setSpendOnChildren(this.SpendOnChildren);
        borrowerExtraDTO.setTag(this.Tag);
        return borrowerExtraDTO;
    }

    public BorrowerExtra() {
    }

    public BorrowerExtra(BorrowerExtraDTO borrowerExtraDTO) {
        this.Code = borrowerExtraDTO.getCode();
        this.Creator = borrowerExtraDTO.getCreator();
        this.FamAgriLandArea = borrowerExtraDTO.getFamAgriLandArea();
        this.FamAgriLandOwner = borrowerExtraDTO.getFamAgriLandOwner();
        this.FamAgriLandType = borrowerExtraDTO.getFamAgriLandType();
        this.FamBusinessShopType = borrowerExtraDTO.getFamBusinessShopType();
        this.FamBusinessType = borrowerExtraDTO.getFamBusinessType();
        this.FamIncomeSource = borrowerExtraDTO.getFamIncomeSource();
        this.FamJobCompName = borrowerExtraDTO.getFamJobCompName();
        this.FamJobCompType = borrowerExtraDTO.getFamJobCompType();
        this.FamMonthlyIncome = borrowerExtraDTO.getFamMonthlyIncome();
        this.FamOccupation = borrowerExtraDTO.getFamOccupation();
        this.FamOtherIncomeType = borrowerExtraDTO.getFamOtherIncomeType();
        this.FutureIncome = borrowerExtraDTO.getFutureIncome();
        this.IMEINO = borrowerExtraDTO.getIMEINO();
        this.NoOfChildren = borrowerExtraDTO.getNoOfChildren();
        this.OtherContactMob = borrowerExtraDTO.getOtherContactMob();
        this.OtherContactPerson = borrowerExtraDTO.getOtherContactPerson();
        this.OtherDependents = borrowerExtraDTO.getOtherDependents();
        this.SchoolingChildren = borrowerExtraDTO.getSchoolingChildren();
        this.SpendOnChildren = borrowerExtraDTO.getSpendOnChildren();
        this.Tag = borrowerExtraDTO.getTag();
    }
}
