package ex04;

public class PingEndpoint extends Endpoint {

    @Override
    protected void onConnect(Session session) {
        // TODO: implement something that sends a "ping" broadcast every second
    }

    @Override
    protected void onMessage(String sender, Message message) {
        if (message.getType().equals(MessageType.Call)) {
            System.err.println("Programing mistake: Ping Endpoint is not supposed to receive a Call.");
        }
    }

    @Override
    public void onClose() {
    }
}
