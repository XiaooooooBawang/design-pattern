package handler;

/**
 * 假条
 */
public class LeaveRequest {
    //请假人姓名
    private final String name;

    //请假时间天数
    private final int days;

    //请假内容
    private final String content;

    public LeaveRequest(String name, int days, String content) {
        this.name = name;
        this.days = days;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public String getContent() {
        return content;
    }
}
