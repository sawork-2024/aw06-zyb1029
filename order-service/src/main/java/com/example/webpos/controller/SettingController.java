package com.example.webpos.controller;

import com.example.webpos.model.Setting;
import com.example.webpos.model.SettingDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("settings")
public class SettingController {

    @GetMapping("")
    public List<Setting> getSettings() {
        List<Setting> settings = new ArrayList<>();
        SettingDetails details = new SettingDetails();
        details.setApp("Standalone Point of Sale");
        details.setStore("Store-Pos");
        details.setAddress_one("10086");
        details.setAddress_two("10087");
        details.setContact("15968774896");
        details.setTax("");
        details.setSymbol("$");
        details.setPercentage("10");
        details.setFooter("");
        details.setImg("");

        Setting setting = new Setting();
        setting.set_id(1);
        setting.setSettings(details);
        setting.setId("d36d");
        settings.add(setting);
        return settings;
    }
}
