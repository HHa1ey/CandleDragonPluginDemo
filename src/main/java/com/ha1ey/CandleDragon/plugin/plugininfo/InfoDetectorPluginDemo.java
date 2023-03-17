package com.ha1ey.CandleDragon.plugin.plugininfo;

import com.ha1ey.CandleDragon.plugin.HelpPluginInfo;
import com.ha1ey.CandleDragon.plugin.InfoDetector;
import com.ha1ey.CandleDragon.plugin.InfoDetectorPlugin;
import com.ha1ey.CandleDragon.plugin.InfoDetectorPluginInfo;
import com.ha1ey.CandleDragon.plugin.infodetector.TestInfoDetector;
import com.ha1ey.CandleDragon.plugin.infodetector.TestInfoDetector222;


import java.util.ArrayList;
import java.util.List;

public class InfoDetectorPluginDemo implements InfoDetectorPlugin {
    public static HelpPluginInfo helpPluginInfo;
    @Override
    public void InfoDetectorPluginMain(InfoDetectorPluginInfo infoDetectorPluginInfo) {
        helpPluginInfo = infoDetectorPluginInfo.getHelpPluginInfo();

        infoDetectorPluginInfo.setInfoDetectorPluginAuthor("信息探测插件作者");
        infoDetectorPluginInfo.setInfoDetectorPluginName("信息探测插件名字3");
        infoDetectorPluginInfo.setInfoDetectorPluginVersion("信息探测插件版本");
        infoDetectorPluginInfo.setInfoDetectorPluginDescription("信息探测插件描述3");


        List<InfoDetector> infoDetectors = new ArrayList<>();
        infoDetectors.add(new TestInfoDetector());
        infoDetectors.add(new TestInfoDetector222());

        infoDetectorPluginInfo.registerInfoDetector(infoDetectors);

    }
}
