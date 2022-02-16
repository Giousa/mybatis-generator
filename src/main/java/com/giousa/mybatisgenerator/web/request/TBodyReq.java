package com.giousa.mybatisgenerator.web.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class TBodyReq implements Serializable {
    private Integer id;

    private Integer areaId;

    private Integer hId;

    private String name;

    private Short sex;

    private String birth;

    private Short isechocardiography;

    private String number;

    private String mother;

    private Short cardType;

    private String maIdcart;

    private String nation;

    private String city;

    private String address1;

    private String address;

    private Short guardian;

    private String mobile;

    private String tel;

    private Short guardianT;

    private String mobileT;

    private String telT;

    private Short guardianS;

    private String mobileS;

    private String telS;

    private Short mode;

    private String createdate;

    private String updatedate;

    private Integer operatorId;

    private Short status;

    private Short agree;

    private Short step;

    private String jscode;

    private String jsimg;

    private Short additional;

    private Integer followup;

    private Integer followupresult;

    private String deletedate;

    private String createuser;

    private String updateuser;

    private String deleteuser;

    private Integer screenId;

    private Integer diagnosisId;

    private Integer treatId;

    private Integer dr;

    private Integer bStatus;

    private String issupplement;

    private Short problem;

    private Short isinterface;

    private Integer interfaceid;
}
