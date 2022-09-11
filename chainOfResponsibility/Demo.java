import handler.Handler;
import handler.concretehandlers.GeneralManager;
import handler.concretehandlers.GroupLeader;
import handler.concretehandlers.Manager;
import handler.LeaveRequest;

/**
 * 责任链模式是一种行为设计模式， 允许你将请求沿着处理者链进行发送。 收到请求后， 每个处理者均可对请求进行处理， 或将其传递给链上的下个处理者。
 */
public class Demo {
    public static void main(String[] args) {
        //假条
        //LeaveRequest leaveRequest = new LeaveRequest("xbw", 4, "请假去面试跳槽公司");
        LeaveRequest leaveRequest = new LeaveRequest("xbw", 10, "休息一下");

        //各位领导
        Handler groupLeader = new GroupLeader();
        Handler manager = new Manager();
        Handler generalManager = new GeneralManager();

        //各位领导的领导是谁
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        //向小组长提交假条
        groupLeader.submitLeaveRequest(leaveRequest);
    }
}
