package com.gaozhengxing.server;


/**
 *
 * <p>
 * Description: 服务实现类
 * <p>
 *
 */
public class SayHelloServiceImpl implements SayHelloService{


    public String sayHello(String str) {
        if("hello".equals(str)){
            return "hello world!";
        }else{
            return "error!";
        }
    }

}
