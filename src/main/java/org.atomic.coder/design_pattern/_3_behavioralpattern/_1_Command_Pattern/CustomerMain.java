package org.atomic.coder.design_pattern._3_behavioralpattern._1_Command_Pattern;

/**
 * @author 80340897
 * @date 2021/8/25 16:01
 */
public class CustomerMain {

    public static void main(String[] args) {
        // 创建 Receiver(接收者)
        MusicPlayer musicPlayer = new MusicPlayer();

        // ICommand(抽象命令类)
        ICommand playCommand = new PlayCommand(musicPlayer);
        ICommand skipCommand = new SkipCommand(musicPlayer);
        ICommand stopCommand = new StopCommand(musicPlayer);

        // 创建 Invoker(调用者)
        MusicInvoker invoker = new MusicInvoker();
        invoker.setPlayCommand(playCommand);
        invoker.setSkipCommand(skipCommand);
        invoker.setStopCommand(stopCommand);

        // 测试
        invoker.play();
        invoker.skip();
        invoker.stop();
        invoker.play();
        invoker.stop();

    }

}
