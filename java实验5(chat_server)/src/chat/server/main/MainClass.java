package chat.server.main;

import chat.server.controller.MainServerSocket;

/**
 * ���������
 * @author ��С��
 *
 */
public class MainClass
{
    public static void main(String[] args)
    {
        // ��������������
        MainServerSocket.getMainSocket().beginListen();
    }
}
