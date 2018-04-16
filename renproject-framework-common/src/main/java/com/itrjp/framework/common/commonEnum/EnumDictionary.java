package com.itrjp.framework.common.commonEnum;

/**
 * Created by huo on 2017/10/11.
 */
public enum EnumDictionary {
    FIRST_SERVER("52C5E1218A8A4BC2A23FEE75CC98E38B","服务器","1"),//一级分类-服务器
    FIRST_NETWORK("C0ADDEF83AF8468AB3FE2E41CBA2E8DE","网络设备","1"),//一级分类-网络设备
    FIRST_SAFETY("9EC96787375145D197E8D47A374E79BC","安全设备","1"),//一级分类-安全设备
    FIRST_TERMINAL("C10B18388DA440A8803F82F6F64B4F68","终端设备","1"),//一级分类-终端设备
    FIRST_MORE("FFD2FB1B9E504EC48E6BC47A218B4A85","更多IT设备","1"),//一级分类-更多IT设备
    FIRST_CONTROL("2717CB262CB94394A21267B156564039","控制器","1"),//一级分类-控制器
    FIRST_STORAGE("B248F29E22644DB78C28F45C7B082D4D","存储设备","1"),//一级分类-存储设备
    FIRST_KVM("D62CC293709D46E6AAD6692A4385E7AD","KVM","1"),//一级分类-KVM
    FIRST_CABINET("6095A2F779204B988DE334073368B86E","机柜","1"),//一级分类-机柜
    FIRST_DISTRIBUTION("D0B005EFC9AF49099D44B527E9C347CF","配线架","1"),//一级分类-配线架
    FIRST_CONDITIONER("C3CDD6E8683D4E2F887333395A6E40E1","空调设施","1"),//一级分类-空调设施
    FIRST_UPS("C8130802B79F4635B1E1F640AC04901D","UPS","1"),//一级分类-UPS
    FIRST_POC("67229E5530054E99BC284ADD78B30452","配电柜","1"),//一级分类-配电柜
    FIRST_PDU("CD423EEEB11548ACB05E69F27ECD570F","PDU","1"),//一级分类-PDU


    SECOND_SERVER_TOWER("0EC267F570644FB3994685568F2534E5","塔式服务器","2"),//二级分类-塔式服务器
    SECOND_SERVER_SMALL("6FC4AABC5D13434587D5945FE81A5DF2","小型机","2"),//二级分类-小型机
    SECOND_SERVER_TOOLBOX("94A8CACD5752499E9F1E1996638D8788","刀箱服务器","2"),//二级分类-刀箱服务器
    SECOND_SERVER_BLADE("2C860DE54FD643E891D971320B18860D","刀片服务器","2"),//二级分类-刀片服务器
    SECOND_SERVER_RACK("6EAB66BB50194CA4B71674FBEA4929C2","机架服务器","2"),//二级分类-机架服务器
    SECOND_NETWORK_RACK("21D67FE8394C43BB874A1E3788E52AFF","机架式设备","2"),//二级分类-网络设备-机架式设备
    SECOND_NETWORK_INTEGRATED("803C16FE113B4F93979EF932037A8A8D","集成化机箱","2"),//二级分类-网络设备-集成化机箱
    SECOND_MORE_POWER("C318F28BC0264220A9DDAA48D4B87D1E","配电箱","2"),//二级分类-更多IT设备-配电箱
    SECOND_MORE_ACCESS_CONTROL("04A1EB965F7A478784F1F51A45A57F76","门禁监控","2"),//二级分类-更多IT设备-门禁监控
    SECOND_MORE_MONITOR("14224C9400DC453999A99AAA09BB9149","监控设备","2"),//二级分类-更多IT设备-监控设备
    SECOND_MORE_SPECIAL_FLOOR("F4D6A19456314288A176250229AA7462","特殊地板","2"),//二级分类-更多IT设备-特殊地板
    SECOND_CONTROL_EMX("DFE4B7CAAB364D339612D2637B5E2C36","EMX-888","2"),//二级分类-控制器-EMX-888
    SECOND_CABINET("0F776A9E19764F28A5C4401BA2A4EA85","机柜","2"),//二级分类-机柜
    SECOND_DISTRIBUTION_TWINAX("065DA64478014B289381CE194C6EF6A1","铜缆配线架","2"),//二级分类-铜缆配线架
    SECOND_DISTRIBUTION_OPTICAL("D95E7D99AFD34D03BD6EFFBB7FD2845C","光纤配线架","2"),//二级分类-光纤配线架
    SECOND_DISTRIBUTION_CRAC("66F22BF0F53742CBBCDF4DB992880301","CRAC","2"),//二级分类-CRAC
    SECOND_UPS("D47CE7B72FF94713AFBB6CBFE1F2F3A8","UPS","2"),//二级分类-UPS
    SECOND_COLUMN_HEAD_CABINET("3200A7915A394ECEB0263004C5D1911B","列头柜","2"),//二级分类-列头柜
    SECOND_GENERAL_POC("EB9741CA070A47BAA283DAB1BAE285B4","普通配电柜","2"),//二级分类-普通配电柜
    SECOND_INTELLIGENCE_POC("EF9EFE81FA2242CCBA55C9DE5EFB00E9","智能配电柜","2"),//二级分类-智能配电柜
    SECOND_INTELLIGENCE_LOW("5B52BFB619594057AC38BED6EC7CD3F0","低压配电柜","2"),//二级分类-低压配电柜
    SECOND_IGENERAL_PDU("C1732298B1974C1787C088CA496B8EF4","普通PDU","2"),//二级分类-普通PDU
    SECOND_NTELLIGENCE_PDU("99E95938AE19417D9D1A43765ACB29BA","智能PDU","2"),//二级分类-智能PDU
    SECOND_GROUP_SWITCHBOARD("374BBCF6ED7B4634A1F5231D9EB11174","集团TOR交换机","2"),//二级分类-集团TOR交换机
    SECOND_SHARES_SWITCHBOARD("FAC35CA2010341AAB22BFA407F9E8C4B","股份TOR交换机","2"),//二级分类-股份TOR交换机
    SECOND_BAND_SWITCHBOARD("41A0FA037DDE468EA5224E8D426EC13A","带外管理交换机","2"),//二级分类-带外管理交换机
    SECOND_SWITCHBOARD("935E6CB432D841DA96531F22AB571C48","交换机","2"),//二级分类-交换机
    SECOND_CONDITIONER("1BCE8BC5621341EA8149D25641909C20","精密空调","2"),//二级分类-精密空调
    SECOND_CONDITIONER_END("D494D8816DD7461DAA75397633257211","末端精密空调","2"),//二级分类-末端精密空调
    SECOND_FIREWALL("E3034CC14E7245159DD45F0534B243D9","防火墙","2");//二级分类-防火墙



    private EnumDictionary(String id,String name,String level){
        this.id = id;
        this.name = name;
        this.level = level;
    }

    private String id;
    private String name;
    private String level;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
