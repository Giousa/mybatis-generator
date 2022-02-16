package com.giousa.mybatisgenerator.convert;

import com.giousa.mybatisgenerator.core.model.TBaby;
import com.giousa.mybatisgenerator.web.request.TBodyReq;

public class TBabyConvert {

    public static TBaby convert(TBodyReq tBodyReq) {
        TBaby tBaby = new TBaby();
        tBaby.setId(tBodyReq.getId());
        tBaby.setAreaId(tBodyReq.getAreaId());
        tBaby.sethId(tBodyReq.getHId());
        tBaby.setName(tBodyReq.getName());
        tBaby.setSex(tBodyReq.getSex());
        tBaby.setBirth(tBodyReq.getBirth());
        tBaby.setIsechocardiography(tBodyReq.getIsechocardiography());
        tBaby.setNumber(tBodyReq.getNumber());
        tBaby.setMother(tBodyReq.getMother());
        tBaby.setCardType(tBodyReq.getCardType());
        tBaby.setMaIdcart(tBodyReq.getMaIdcart());
        tBaby.setNation(tBodyReq.getNation());
        tBaby.setCity(tBodyReq.getCity());
        tBaby.setAddress1(tBodyReq.getAddress1());
        tBaby.setAddress(tBodyReq.getAddress());
        tBaby.setGuardian(tBodyReq.getGuardian());
        tBaby.setMobile(tBodyReq.getMobile());
        tBaby.setTel(tBodyReq.getTel());
        tBaby.setGuardianT(tBodyReq.getGuardianT());
        tBaby.setMobileT(tBodyReq.getMobileT());
        tBaby.setTelT(tBodyReq.getTelT());
        tBaby.setGuardianS(tBodyReq.getGuardianS());
        tBaby.setMobileS(tBodyReq.getMobileS());
        tBaby.setTelS(tBodyReq.getTelS());
        tBaby.setMode(tBodyReq.getMode());
        tBaby.setCreatedate(tBodyReq.getCreatedate());
        tBaby.setUpdatedate(tBodyReq.getUpdatedate());
        tBaby.setOperatorId(tBodyReq.getOperatorId());
        tBaby.setStatus(tBodyReq.getStatus());
        tBaby.setAgree(tBodyReq.getAgree());
        tBaby.setStep(tBodyReq.getStep());
        tBaby.setJscode(tBodyReq.getJscode());
        tBaby.setJsimg(tBodyReq.getJsimg());
        tBaby.setAdditional(tBodyReq.getAdditional());
        tBaby.setFollowup(tBodyReq.getFollowup());
        tBaby.setFollowupresult(tBodyReq.getFollowupresult());
        tBaby.setDeletedate(tBodyReq.getDeletedate());
        tBaby.setCreateuser(tBodyReq.getCreateuser());
        tBaby.setUpdateuser(tBodyReq.getUpdateuser());
        tBaby.setDeleteuser(tBodyReq.getDeleteuser());
        tBaby.setScreenId(tBodyReq.getScreenId());
        tBaby.setDiagnosisId(tBodyReq.getDiagnosisId());
        tBaby.setTreatId(tBodyReq.getTreatId());
        tBaby.setDr(tBodyReq.getDr());
        tBaby.setbStatus(tBodyReq.getBStatus());
        tBaby.setIssupplement(tBodyReq.getIssupplement());
        tBaby.setProblem(tBodyReq.getProblem());
        tBaby.setIsinterface(tBodyReq.getIsinterface());
        tBaby.setInterfaceid(tBodyReq.getInterfaceid());
        return tBaby;
    }
}
