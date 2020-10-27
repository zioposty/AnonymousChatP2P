package it.isislab.p2p.anonymouschat;

import it.isislab.p2p.anonymouschat.utilities.PeerManager;
import javafx.application.Application;

import org.kohsuke.args4j.Option;

/**
 * AppLauncher
 */
public class AppLauncher {

    @Option(name="-m", aliases="--masterip", usage="the master peer ip address", required=true)
    private static String master;

    @Option(name="-id", aliases="--identifierpeer", usage="the unique identifier for this peer", required=true)
    private static int id;


    public static void main(String[] args) {
        PeerManager peer = PeerManager.getInstance();
        peer.init(id, master);
        Application.launch(InitialManager.class, args);
    }
}
