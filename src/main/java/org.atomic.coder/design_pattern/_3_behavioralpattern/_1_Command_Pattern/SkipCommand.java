package org.atomic.coder.design_pattern._3_behavioralpattern._1_Command_Pattern;

/**
 * @author 80340897
 * @date 2021/8/25 15:58
 */
public class SkipCommand implements ICommand{

    private MusicPlayer player;

    public SkipCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.skip();
    }
}
