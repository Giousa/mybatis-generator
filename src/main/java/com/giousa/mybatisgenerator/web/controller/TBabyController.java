package com.giousa.mybatisgenerator.web.controller;

import com.alibaba.fastjson.JSON;
import com.giousa.mybatisgenerator.convert.TBabyConvert;
import com.giousa.mybatisgenerator.core.mapper.TBabyMapper;
import com.giousa.mybatisgenerator.core.model.TBaby;
import com.giousa.mybatisgenerator.web.request.IdReq;
import com.giousa.mybatisgenerator.web.request.TBodyReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("tbody")
public class TBabyController {

    @Resource
    private TBabyMapper tBabyMapper;

    @PostMapping("insert")
    public Object insert(@RequestBody TBodyReq tBodyReq) {
        TBaby tBaby = TBabyConvert.convert(tBodyReq);
        System.out.println("入参："+ JSON.toJSONString(tBaby));
        tBabyMapper.insert(tBaby);
        return "insert ok";
    }

    @PostMapping("update")
    public Object update(@RequestBody TBodyReq tBodyReq) {
        tBabyMapper.updateByPrimaryKeySelective(TBabyConvert.convert(tBodyReq));
        return "update ok";
    }

    @PostMapping("selectByPrimaryKey")
    public TBaby selectByPrimaryKey(@RequestBody IdReq idReq) {
        return tBabyMapper.selectByPrimaryKey(idReq.getId());
    }
}
