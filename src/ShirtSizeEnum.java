public enum ShirtSizeEnum {
    XS("EXTRA SMALL"),
    S("SMALL"),
    M("MEDIUM"),
    L("LARGE");

    private String strValue;
    ShirtSizeEnum(String strValue ){
        this.strValue = strValue;
    }

    public String getStrValue() {
        return strValue;
    }
}
