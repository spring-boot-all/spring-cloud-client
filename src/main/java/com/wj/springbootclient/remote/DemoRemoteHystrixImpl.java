package com.wj.springbootclient.remote;

import org.springframework.stereotype.Component;

/**
 * com.wj.springbootclient.remote
 *
 * @date  2020-01-09 14:25
 * @author wangjun
 */

@Component
public class DemoRemoteHystrixImpl implements DemoRemote {

    @Override
    public String getPortInfo(String name) {
        return  "hello" +name+", this messge send failed ";
    }
}
