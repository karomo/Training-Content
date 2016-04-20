package com.karomo.customlayoutlistview;


import java.util.Date;

/**
 * Created by karomo on 4/18/15.
 */
public class CountyModel {
    private String county_name;
    private String county_governor;
    private String county_desc;


    public CountyModel(String county_name, String county_governor, String county_desc) {
        this.county_name = county_name;
        this.county_governor = county_governor;
        this.county_desc = county_desc;
    }


    public String getCountyName() {
        return county_name;
    }

    public void setCountyName(String county_name) {
        this.county_name = county_name;
    }

    public String getCountyGovernor() {
        return county_governor;
    }

    public void setCountyGovernor(String county_governor) {
        this.county_governor = county_governor;
    }

    public String getCountyDesc() {
        return county_desc;
    }

    public void setCountyDesc(String county_desc) {
        this.county_desc = county_desc;
    }

  
}
