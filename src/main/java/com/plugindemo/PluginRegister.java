package com.plugindemo;


import com.ha1ey.CandleDragon.plugin.PluginManager;
import com.ha1ey.CandleDragon.plugin.Register;


//全部的类名都可以随便，这个入口类必须实现PluginManager接口
public class PluginRegister implements PluginManager {
    @Override
    public void registerPlugin(Register register) {
        register.doRegister(new PluginDemo());      //有几个插件就注册几个以此类推
//        register.doRegister(new PluginDemo1());
//        register.doRegister(new PluginDemo2());
    }
}
