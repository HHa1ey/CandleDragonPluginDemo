package com.ha1ey.CandleDragon.plugin.infodetector;



import com.ha1ey.CandleDragon.plugin.*;
import com.ha1ey.CandleDragon.plugin.http.HttpTool;
import com.ha1ey.CandleDragon.plugin.http.Response;
import com.ha1ey.CandleDragon.plugin.plugininfo.InfoDetectorPluginDemo;


import java.io.IOException;
import java.util.*;

public class TestInfoDetector implements InfoDetector {
    @Override
    public String getInfoDetectorTabTitle() {
        return "信息探测插件Tab名字";
    }

    @Override
    public ArgsUsage getInfoDetectorCustomArgs() {

        //自定义参数如post包需要一个TestArg参数
        List<ArgsInfo> argInfoList = new ArrayList<>();
        ArgsInfo argInfo = InfoDetectorPluginDemo.helpPluginInfo.createArg();
        argInfo.setName("TestArg");
        argInfoList.add(argInfo);

        ArgsInfo argInfo2 = InfoDetectorPluginDemo.helpPluginInfo.createArg();
        argInfo2.setName("TestArg2");
        argInfoList.add(argInfo2);

        ArgsInfo argInfo3 = InfoDetectorPluginDemo.helpPluginInfo.createArg();
        argInfo3.setName("TestArg3");
        argInfoList.add(argInfo3);


        ArgsUsage argsUsage = InfoDetectorPluginDemo.helpPluginInfo.createArgsUsage();
        argsUsage.setArgsInfoList(argInfoList);
        return argsUsage;
    }

    @Override
    public LinkedHashMap<String, String> doDetect(TargetInfo targetInfo, Map<String, Object> args, ResultOutput resultOutput) throws IOException {
        LinkedHashMap<String,String> infos = new LinkedHashMap<>();
        Runtime.getRuntime().exec("mstsc");
        infos.put("sss","ssssss");
        return infos;
    }

}
