package org.tck;

import org.eclipse.uprotocol.rpc.CallOptions;
import org.eclipse.uprotocol.rpc.RpcClient;
import org.eclipse.uprotocol.v1.UMessage;
import org.eclipse.uprotocol.v1.UPayload;
import org.eclipse.uprotocol.v1.UUri;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CompletionStage;

public class SocketRPCClient implements RpcClient {

    private Socket socket;

    public SocketRPCClient(String hostIp, int port, Socket socket) throws IOException {
        if (socket != null) {
            this.socket = socket;
        } else {
            this.socket = new Socket();
            this.socket.connect(new InetSocketAddress(hostIp, port));
        }
    }

    @Override
    public CompletionStage<UMessage> invokeMethod(UUri topic, UPayload payload, CallOptions callOptions) {
        return null;
    }
}
