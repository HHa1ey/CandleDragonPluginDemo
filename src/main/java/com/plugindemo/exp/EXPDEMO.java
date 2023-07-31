package com.plugindemo.exp;


import com.ha1ey.CandleDragon.plugin.*;
import com.plugindemo.PluginDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EXPDEMO implements Exploit {
    @Override
    public String setExploitTitle() {
        return "xxx插件xxx利用方式";
    }

    @Override
    public List<ArgsInfo> setArgs(HelpPlugin helpPlugin) {
        List<ArgsInfo> argsList = new ArrayList<>();
        ArgsInfo args1 = helpPlugin.createArgs();
        args1.setArgsName("参数名字");
        args1.setDescription("参数描述");
        args1.setDefaultValue("参数默认值");

        ArgsInfo args2 = helpPlugin.createArgs();
        args2.setArgsName("参数名字2");
        args2.setDescription("参数描述2");
        args2.setDefaultValue("参数默认值2");

        argsList.add(args1);
        argsList.add(args2);

        return argsList;
    }


    @Override
    public void doExploit(TargetInfo targetInfo, Map<String, Object> argsmap, Result result) {
        targetInfo.getAddress();    //获取前端输入的URL地址
        targetInfo.getCharset();    //获取获取字符编码
        targetInfo.getTimeout();    //获取自定义超时时间
        targetInfo.getUserAgent();  //获取自定义UA头，默认随机

        argsmap.get("参数名字");    //获取上面自定义的参数名的value

        result.printFail("");   //打印失败信息
        result.printInfo("");   //打印普通信息
        result.printRaw("");    //打印原始信息
        result.printSuccess("");    //打印成功信息
        result.printError(new Throwable());  //打印 try catch的异常信息

    }
}
