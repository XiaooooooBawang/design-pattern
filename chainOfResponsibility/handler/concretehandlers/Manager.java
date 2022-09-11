package handler.concretehandlers;

import handler.Handler;
import handler.LeaveRequest;

/**
 * 具体处理者：经理，处理3-7天的请假
 */
public class Manager extends Handler {
    public Manager() {
        super(Handler.THREE_DAY, Handler.SEVEN_DAY);
    }

    /**
     * 该处理者具体的处理过程
     *
     * @param leaveRequest 假条
     * @return 经理是否批准
     */
    @Override
    protected boolean handleLeaveRequest(LeaveRequest leaveRequest) {
        if ("请假去面试跳槽公司".equals(leaveRequest.getContent())) {
            System.out.println("部门经理不同意请假");
            return false;
        }
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getDays() + "天，" + leaveRequest.getContent() + "!");
        System.out.println("部门经理审批通过：同意！");
        return true;
    }
}
