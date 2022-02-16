package com.giousa.mybatisgenerator.web.controller;

import com.alibaba.fastjson.JSON;
import com.giousa.mybatisgenerator.MybatisGeneratorApplication;
import com.giousa.mybatisgenerator.core.model.TBaby;
import com.giousa.mybatisgenerator.web.request.IdReq;
import com.giousa.mybatisgenerator.web.request.TBodyReq;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {MybatisGeneratorApplication.class})
@ActiveProfiles("test")
class TBabyControllerTest {

    @Resource
    private TBabyController controller;

    @Test
    void insert() {
        TBodyReq tBodyReq = new TBodyReq();
        tBodyReq.setName("不笑猫-test");
        tBodyReq.setBStatus(1);
        controller.insert(tBodyReq);
    }

    @Test
    void update() {
        TBodyReq tBodyReq = new TBodyReq();
        tBodyReq.setId(2);
        tBodyReq.setName("不笑猫-test-修改");
        tBodyReq.setSex((short) 2);
        tBodyReq.setBStatus(0);
        controller.update(tBodyReq);
    }

    @Test
    void selectByPrimaryKey() {
        IdReq idReq = new IdReq();
        idReq.setId(1);
        TBaby tBaby = controller.selectByPrimaryKey(idReq);
        System.out.println(JSON.toJSONString(tBaby));
    }
}