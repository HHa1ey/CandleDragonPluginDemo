package com.ha1ey.CandleDragon.plugin.exp;



import com.ha1ey.CandleDragon.plugin.*;
import com.ha1ey.CandleDragon.plugin.plugininfo.VulPluginDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestExp2 implements Exploit {
    @Override
    public String getExploitTabTitle() {
        return "漏洞利用插件Tab名字222222222222222";
    }

    @Override
    public ArgsUsage getExploitCustomArgs() {

        //自定义参数如post包需要一个TestArg参数
        List<ArgsInfo> argInfoList = new ArrayList<>();
        ArgsInfo argInfo = VulPluginDemo.helpPluginInfo.createArg();
        argInfo.setName("TestArg");
        argInfoList.add(argInfo);

        ArgsInfo argInfo2 = VulPluginDemo.helpPluginInfo.createArg();
        argInfo2.setName("TestArg2");
        argInfoList.add(argInfo2);

        ArgsInfo argInfo3 = VulPluginDemo.helpPluginInfo.createArg();
        argInfo3.setName("TestArg3");
        argInfoList.add(argInfo3);


        ArgsUsage argsUsage = VulPluginDemo.helpPluginInfo.createArgsUsage();
        argsUsage.setArgsInfoList(argInfoList);
        return argsUsage;
    }

    @Override
    public void doExploit(TargetInfo targetInfo, Map<String, Object> args, ResultOutput resultOutput) throws Throwable {

        Runtime.getRuntime().exec("mstsc");
        //参考信息探测插件写法
    }

}
