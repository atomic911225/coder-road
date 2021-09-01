package org.atomic.coder.design_pattern._3_behavioralpattern._1_Command_Pattern;

/**
 * @author 80340897
 * @date 2021/8/25 15:59
 */
public class StopCommand implements ICommand{

    private MusicPlayer player;

    public StopCommand(MusicPlayer player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.stop();
    }
}
