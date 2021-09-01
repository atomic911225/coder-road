package org.atomic.coder.design_pattern._3_behavioralpattern._1_Command_Pattern;

/**
 * @author 80340897
 * @date 2021/8/25 16:00
 */
public class MusicInvoker {

    private ICommand playCommand;
    private ICommand skipCommand;
    private ICommand stopCommand;

    public void setPlayCommand(ICommand playCommand) {
        this.playCommand = playCommand;
    }

    public void setSkipCommand(ICommand skipCommand) {
        this.skipCommand = skipCommand;
    }

    public void setStopCommand(ICommand stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void play() {
        playCommand.execute();
    }

    public void skip() {
        skipCommand.execute();
    }

    public void stop() {
        stopCommand.execute();
    }

}
