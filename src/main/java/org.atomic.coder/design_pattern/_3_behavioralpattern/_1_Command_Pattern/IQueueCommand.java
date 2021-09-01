package org.atomic.coder.design_pattern._3_behavioralpattern._1_Command_Pattern;

/**
 * @author 80340897
 * @date 2021/8/25 16:02
 */
public interface IQueueCommand {

    void add(ICommand command);

    void execute();

}
