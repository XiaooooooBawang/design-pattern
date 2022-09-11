package handler.concretehandlers;

import handler.Handler;
import handler.LeaveRequest;

/**
 * 具体处理者：小组长，处理1-3天的请假
 */
public class GroupLeader extends Handler {
    public GroupLeader() {
        super(Handler.ONE_DAY, Handler.THREE_DAY);
    }

    /**
     * 该处理者具体的处理过程
     *
     * @param leaveRequest 假条
     * @return 小组长是否批准
     */
    @Override
    protected boolean handleLeaveRequest(LeaveRequest leaveRequest) {
        if ("请假去面试跳槽公司".equals(leaveRequest.getContent())) {
            System.out.println("小组长不同意请假");
            return false;
        }
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getDays() + "天，" + leaveRequest.getContent() + "!");
        System.out.println("小组长审批通过：同意！");
        return true;
    }
}
