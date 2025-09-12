package com.prisma77.repository;

import org.springframework.stereotype.Service;

@Service //service는 곧 비즈니스입니다
public class ActionServiceImp implements ActionService{

    @Override
    public void showMessage() {//핵심소스
        System.out.println("showMessage 비즈니스 로직수행");
    }
    @Override
    public void makeProcess() {
        System.out.println("makeProcess 비즈니스 로직수행");
    }
}