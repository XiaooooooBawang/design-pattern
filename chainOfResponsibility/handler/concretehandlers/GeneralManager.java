package handler.concretehandlers;

import handler.Handler;
import handler.LeaveRequest;

/**
 * 具体处理者：总经理，处理7-14天的请假
 */
public class GeneralManager extends Handler {
    public GeneralManager() {
        super(Handler.SEVEN_DAY, Handler.FOURTEEN_DAY);
    }

    /**
     * 该处理者具体的处理过程
     *
     * @param leaveRequest 假条
     * @return 总经理是否批准
     */
    @Override
    protected boolean handleLeaveRequest(LeaveRequest leaveRequest) {
        if ("请假去面试跳槽公司".equals(leaveRequest.getContent())) {
            System.out.println("总经理不同意请假");
            return false;
        }
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getDays() + "天，" + leaveRequest.getContent() + "!");
        System.out.println("总经理审批通过：同意！");
        return true;
    }
}
