package com.ha1ey.CandleDragon.plugin.poc;


import com.ha1ey.CandleDragon.plugin.Poc;
import com.ha1ey.CandleDragon.plugin.ResultOutput;
import com.ha1ey.CandleDragon.plugin.ScanResult;
import com.ha1ey.CandleDragon.plugin.TargetInfo;
import com.ha1ey.CandleDragon.plugin.plugininfo.VulPluginDemo;

import java.util.Date;

public class TestPoc implements Poc {
    @Override
    public ScanResult doCheck(TargetInfo targetInfo, ResultOutput resultOutput) throws Throwable {
        ScanResult scanResult =  VulPluginDemo.helpPluginInfo.createScanResult();

        //其他编写参考信息探测插件写法

        //发包，响应包等判断逻辑


        //输出信息到前台（可不全写）
        resultOutput.successPrint("这是测试打印success信息");


        scanResult.setTarget(targetInfo.getAddress());
        scanResult.setMsg("输出信息");
        scanResult.setVul(true);   //是否存在漏洞
        return scanResult;
    }


}
