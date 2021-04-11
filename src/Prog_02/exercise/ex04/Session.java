package ex04;

import java.util.Objects;

/**
 * Represents a session handle for communication.
 */
public class Session {

    private final long id;
    private final Broker broker;

    /**
     * Creates a new session handle for the specified broker.
     *
     * @param broker the broker maintaining the session
     */
    public Session(Broker broker) {
        id = 0; // TODO: generate a unique ID for each session
        this.broker = broker;
    }

    /**
     * Sends a message to a specific target.
     *
     * @param target the name of the endpoint the message shall be sent to
     * @param msg    the message data
     */
    public void send(String target, Message msg) {
        broker.send(this, target, msg);
    }

    /**
     * Sends a message to all other active participants.
     *
     * @param msg the message data
     */
    public void broadcast(Message msg) {
        broker.broadcast(this, msg);
    }

}
