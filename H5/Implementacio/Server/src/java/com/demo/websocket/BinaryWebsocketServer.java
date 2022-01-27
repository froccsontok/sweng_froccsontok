/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.websocket;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.websocket.Session;
import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.OnMessage;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Main
 */
@javax.websocket.server.ServerEndpoint("/images")
public class BinaryWebsocketServer {

    private
    static final Set<Session> sessions =
    Collections.synchronizedSet(new HashSet<Session>());
    
    @javax.websocket.OnMessage
    public String onMessage(String message) {
        return null;
    }
    
    @OnOpen
    public void onOpen(Session session) {
      sessions.add(session);
    }

    @OnClose
    public void onClose(Session session) {
      sessions.remove(session);
    }
    
    @OnMessage
    public void onMessage(ByteBuffer byteBuffer) {
      for (Session session : sessions) {
        try {
          session.getBasicRemote().sendBinary(byteBuffer);
        } catch (IOException ex) {
          Logger.getLogger(BinaryWebsocketServer.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }
    
}
