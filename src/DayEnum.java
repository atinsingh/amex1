public enum DayEnum {
    MON (1),TUE(2),WED(3),THU(4),FRI(5),SAT(6),SUN(7);

    private final int val;
    DayEnum(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
