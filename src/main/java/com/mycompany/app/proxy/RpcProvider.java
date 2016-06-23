package com.mycompany.app.proxy;

/**
 * Created by lzz on 6/22/16.
 */
public class RpcProvider {
    public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        RpcFramework.export(service, 1234);
    }
}
