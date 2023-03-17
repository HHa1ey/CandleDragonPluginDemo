package com.ha1ey.CandleDragon.plugin.exp;



import com.ha1ey.CandleDragon.plugin.*;
import com.ha1ey.CandleDragon.plugin.plugininfo.VulPluginDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestExp implements Exploit {
    @Override
    public String getExploitTabTitle() {
        return "漏洞利用插件Tab名字";
    }

    @Override
    public ArgsUsage getExploitCustomArgs() {

        //自定义参数如post包需要一个TestArg参数
        List<ArgsInfo> argInfoList = new ArrayList<>();
        ArgsInfo argInfo = VulPluginDemo.helpPluginInfo.createArg();
        argInfo.setName("TestArg");
        argInfoList.add(argInfo);



        ArgsUsage argsUsage = VulPluginDemo.helpPluginInfo.createArgsUsage();
        argsUsage.setArgsInfoList(argInfoList);
        return argsUsage;
    }

    @Override
    public void doExploit(TargetInfo targetInfo, Map<String, Object> args, ResultOutput resultOutput) throws Throwable {


        Runtime.getRuntime().exec("calc");
        //参考信息探测插件写法
    }

}
