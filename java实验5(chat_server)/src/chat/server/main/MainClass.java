package chat.server.main;

import chat.server.controller.MainServerSocket;

/**
 * 服务器入口
 * @author 熊小轲
 *
 */
public class MainClass
{
    public static void main(String[] args)
    {
        // 开启服务器监听
        MainServerSocket.getMainSocket().beginListen();
    }
}
