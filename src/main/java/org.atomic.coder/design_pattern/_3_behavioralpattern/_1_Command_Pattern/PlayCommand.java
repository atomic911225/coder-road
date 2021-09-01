package org.atomic.coder.design_pattern._3_behavioralpattern._1_Command_Pattern;

/**
 * @author 80340897
 * @date 2021/8/25 15:57
 */
public class PlayCommand implements ICommand {

    private MusicPlayer player;

    public PlayCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }

}
