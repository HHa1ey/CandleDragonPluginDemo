package com.plugindemo;


import com.ha1ey.CandleDragon.plugin.IPlugin;
import com.ha1ey.CandleDragon.plugin.PluginInfo;
import com.plugindemo.poc.POCDEMO;

public class PluginDemo implements IPlugin {
    @Override
    public void setPluginInfo(PluginInfo pluginInfo) {
        pluginInfo.setPluginName("插件名字");
        pluginInfo.setPluginAuthor("插件作者名");
        pluginInfo.setVulName("漏洞名");
        pluginInfo.setVulId("漏洞CNVD/cve");
        pluginInfo.setDescription("描述");
        pluginInfo.setVulCategory("漏洞类型");
        pluginInfo.setVulProduct("厂商");
        pluginInfo.setPluginVersion("插件版本");
        pluginInfo.setVulDisclosureTime("披露时间");
        pluginInfo.setVulScope("漏洞适应版本");

//        List<Exploit> exploits = new ArrayList<>();     //新建一个用来存放exp的list
//        exploits.add(new EXPDEMO());        //有几个exp就添加几个
//        exploits.add(new EXPDEMO1());
//        exploits.add(new EXPDEMO2());


        pluginInfo.addPoc(new POCDEMO());   //添加这个插件的检测POC

//        pluginInfo.addExploit(exploits);    //最后将所有的exp列表添加到插件信息
    }


}
