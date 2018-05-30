package com.test.controller;

import com.test.config.Sender;
import com.test.redis.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dangsl
 * @description
 * @date ${date} ${time}.
 * ${tags}.
 */
@RestController
@RequestMapping(value = "web")
public class WebController {

    @Autowired
    private Sender sender;

    @Autowired
    private Cache cache;

    @RequestMapping(value = "getName",method = RequestMethod.GET)
    public String getName(String name){
        System.out.println(name);
        return name;
    }

    @RequestMapping(value = "testMq",method = RequestMethod.GET)
    public void tetMq(){
        sender.send();
        System.out.println("测试mq............................");
    }

    @RequestMapping(value = "redisAdd",method = RequestMethod.GET)
    public void redisAddName(String name){
        System.out.println(name);
        cache.stringSetValueAndExpireTime("name",name,20*1000);
    }
}
