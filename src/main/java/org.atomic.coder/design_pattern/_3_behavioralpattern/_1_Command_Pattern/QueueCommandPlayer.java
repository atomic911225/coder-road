package org.atomic.coder.design_pattern._3_behavioralpattern._1_Command_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 80340897
 * @date 2021/8/25 16:02
 *
 * 命令队列
 *
 */
public class QueueCommandPlayer implements IQueueCommand {

    private static final List<ICommand> commands = new ArrayList<>();

    @Override
    public void add(ICommand command) {
        if(check(command)) {
            commands.add(command);
        }
    }

    @Override
    public void execute() {
        for (ICommand command : commands) {
            command.execute();
        }
    }

    /**
     * 校验方法
     * @return
     */
    private boolean check(ICommand command){
        //如果是 skip命令 则忽略
        return !(command instanceof SkipCommand);
    }

}
