public enum Glyphe {
    HACKER("\uE210"),
    ENERGIE("\uE237"),
    AGENT("\uE2F0"),
    PORTE_DEROBEE("\uE05E"),
    CODE_CORROMPU("\uE2EA"),
    TERMINAL("\uE1FB"),

    // Honeynet
    INTERSECTION_4("\u254B"),  // ╋
    INTERSECTION_3_NORD("\u2533"),  // ┳
    INTERSECTION_3_EST("\u252B"),  // ┫
    INTERSECTION_3_SUD("\u253B"),  // ┻
    INTERSECTION_3_OUEST("\u2523"),  // ┣
    SEGMENT_HORIZONTAL("\u2501"),  // ━
    SEGMENT_VERTICAL("\u2503"),  // ┃
    COIN_NORD_OUEST("\u250F"),  // ┏
    COIN_NORD_EST("\u2513"),  // ┓
    COIN_SUD_EST("\u251B"),  // ┛
    COIN_SUD_OUEST("\u2517");  // ┗

    public final String unicode;

    Glyphe(String unicode) {
        this.unicode = unicode;
    }
}
