package com.plugindemo.poc;


import com.ha1ey.CandleDragon.plugin.Poc;
import com.ha1ey.CandleDragon.plugin.Result;

import com.ha1ey.CandleDragon.plugin.TargetInfo;

public class POCDEMO implements Poc {
    @Override
    public void doPoc(TargetInfo targetInfo, Result result) {
        targetInfo.getAddress();    //获取前端输入的URL地址
        targetInfo.getCharset();    //获取获取字符编码
        targetInfo.getTimeout();    //获取自定义超时时间
        targetInfo.getUserAgent();  //获取自定义UA头，默认随机


        result.setPocVul(true);     //是否存在漏洞，最后会在扫描结果的表格中显示
        result.setPocVul(false);
        result.setPocMsg("Poc message");    //Poc扫描结果表格中显示的提示信息


        result.printFail("");   //打印失败信息
        result.printInfo("");   //打印普通信息
        result.printRaw("");    //打印原始信息
        result.printSuccess("");    //打印成功信息
        result.printError(new Throwable());  //打印 try catch的异常信息

    }

}
