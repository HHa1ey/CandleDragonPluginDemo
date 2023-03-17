package com.ha1ey.CandleDragon.plugin.register;

import com.ha1ey.CandleDragon.plugin.PluginManager;
import com.ha1ey.CandleDragon.plugin.Registers;
import com.ha1ey.CandleDragon.plugin.plugininfo.InfoDetectorPluginDemo;
import com.ha1ey.CandleDragon.plugin.plugininfo.VulPluginDemo;


//注：此类不可修改
public class PluginRegister implements PluginManager {
    @Override
    public void registerPlugin(Registers registers)  {
        registers.registerVulPlugin(new VulPluginDemo());
        registers.registerInfoDetectorPlugin( new InfoDetectorPluginDemo());
    }
}
