package com.solid.o.good;

import com.solid.o.bad.BadClient;

public class GoodServer {
    public void reactToClient(Client_I client) {
        client.doSomething();
    }
}
