package survival.game.launcher;


import survival.game.net.server.GameServer;

public class ServerLauncher {
    public static void main(String[] args) {
        new GameServer(4357);
    }
}
