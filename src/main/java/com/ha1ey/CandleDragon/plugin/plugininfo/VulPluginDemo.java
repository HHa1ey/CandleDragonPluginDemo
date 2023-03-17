package com.ha1ey.CandleDragon.plugin.plugininfo;

import com.ha1ey.CandleDragon.plugin.*;
import com.ha1ey.CandleDragon.plugin.exp.TestExp;
import com.ha1ey.CandleDragon.plugin.exp.TestExp2;
import com.ha1ey.CandleDragon.plugin.poc.TestPoc;


import java.util.ArrayList;
import java.util.List;

public class VulPluginDemo implements VulPlugin {
    public static HelpPluginInfo helpPluginInfo;
    @Override
    public void VulPluginMain(VulPluginInfo vulPluginInfo) {
        helpPluginInfo = vulPluginInfo.getHelpPluginInfo();

        vulPluginInfo.setVulPluginName("漏洞插件的名字");
        vulPluginInfo.setVulPluginAuthor("漏洞插件的作者");
        vulPluginInfo.setVulName("漏洞名");
        vulPluginInfo.setVulId("漏洞CVE/CNVD");
        vulPluginInfo.setVulDescription("漏洞插件描述");
        vulPluginInfo.setVulCVSS(10.0);
        vulPluginInfo.setVulSeverity("漏洞类型");
        vulPluginInfo.setVulProduct("漏洞厂商");
        vulPluginInfo.setVulPluginVersion("插件的版本");
        vulPluginInfo.setVulDisclosureTime("漏洞发现时间");
        vulPluginInfo.setVulScope("漏洞适用范围");


        vulPluginInfo.registerPoc(new TestPoc());


        List<Exploit> exploitList = new ArrayList<>();
        exploitList.add(new TestExp());
        exploitList.add(new TestExp2());
        vulPluginInfo.registerExploit(exploitList);


    }

}
