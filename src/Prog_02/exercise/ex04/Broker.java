package ex04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Broker {

    // set this to true if you want to examine the sent messages
    // copy the output between @startuml and @enduml in PlantUML
    // online version: http://www.plantuml.com/plantuml/
    private final boolean debug = false;

    private final ExecutorService executor = Executors.newCachedThreadPool();

    /**
     * Adds an endpoint with the specified name, if the name is not already used.
     *
     * @param endpointName the name of the new endpoint
     * @param endpoint     the endpoint implementation
     * @return true if the endpoint was added, false if an endpoint with that name already exists
     */
    public boolean addEndpoint(String endpointName, Endpoint endpoint) {
        // TODO: implement
        return false;
    }

    /**
     * Removes the endpoint with the specified name.
     * If no endpoint with the specified name exists, this method does nothing.
     *
     * @param endpointName the name of the endpoint
     */
    public void removeEndpoint(String endpointName) {
        // TODO: implement and keep the following debug line, but execute it only if endpoint existed
        if (debug) {
            System.out.printf("destroy %s\n", endpointName);
        }
    }

    /**
     * Shuts down the broker service.
     */
    public void shutdown() {
        executor.shutdown();
    }

    /**
     * Sends a message to the specified receiver.
     *
     * @param sender       the originating session
     * @param receiverName the target's name
     * @param msg          the message data
     */
    public void send(Session sender, String receiverName, Message msg) {
        final var senderName = findNameForSession(sender);
        final var clientEndpoint = findEndpointForName(receiverName);
        if (clientEndpoint != null) {
            executor.submit(() -> {
                if (debug) {
                    System.out.printf("%s %s %s : %s\n%s\n",
                            senderName,
                            msg.getType().equals(MessageType.Call) ? "->" : "-->",
                            receiverName,
                            msg.getText(),
                            msg.getType().equals(MessageType.Call)
                                    ? String.format("activate %s", receiverName)
                                    : String.format("deactivate %s", senderName));
                }
                clientEndpoint.onMessage(senderName, msg);
            });
        }
    }

    /**
     * Broadcasts a message to all other participants.
     *
     * @param sender the originating session
     * @param msg    the message data
     */
    public void broadcast(Session sender, Message msg) {
        // TODO: implement (tip: you should use the send() method)
    }

    /**
     * Returns the name of the endpoint that is associated with the specified session.
     *
     * @param session the session
     * @return the endpoint associated with the session
     * @throws IllegalStateException if the endpoint for the specified session is already removed
     */
    private String findNameForSession(Session session) throws IllegalStateException {
        // TODO: implement
        return null;
    }

    /**
     * Returns the endpoint with the specified name.
     *
     * @param name the name of the endpoint
     * @return the endpoint for the specified name
     * @throws IllegalStateException if no endpoint for the specified name exists
     */
    private Endpoint findEndpointForName(String name) {
        // TODO: implement
        return null;
    }
}
