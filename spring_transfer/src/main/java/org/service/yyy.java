package org.service;

import org.springframework.stereotype.Component;

@Component
public class yyy implements SSService{

    @Override
    public void sun(int i) {
        System.out.println(666);
    }
}
