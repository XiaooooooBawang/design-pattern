package handler;

/**
 * 抽象处理者（Handler）角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 */
public abstract class Handler {
    //时间天数常量
    protected static final int ONE_DAY = 1;
    protected static final int THREE_DAY = 3;
    protected static final int SEVEN_DAY = 7;
    protected static final int FOURTEEN_DAY = 14;

    //处理者负责处理的请假时间区间
    private final int start;
    private final int end;

    //下一个处理者，这里是该处理者的上司
    private Handler nextHandler;

    protected Handler(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 抽象处理方法
     *
     * @param leaveRequest 假条
     * @return 是否批准请假
     */
    protected abstract boolean handleLeaveRequest(LeaveRequest leaveRequest);

    /**
     * 该责任链的流动逻辑，这里是给该位领导提交假条
     *
     * @param leaveRequest 假条
     */
    public final void submitLeaveRequest(LeaveRequest leaveRequest) {
        int leaveDays = leaveRequest.getDays();
        if (leaveDays <= 0 || leaveDays > 14) {
            System.out.println("请假天数不符合规定");
            return;
        }
        if (leaveDays > start) {
            boolean permitted = handleLeaveRequest(leaveRequest);
            //有上级，且请假天数大于该领导的处理范围，且该领导同意，才能再向上级提交假条，否则请假流程结束
            if (nextHandler != null && leaveDays > end && permitted) {
                nextHandler.submitLeaveRequest(leaveRequest);
            } else {
                System.out.println("请假流程结束！");
            }
        }
    }
}
