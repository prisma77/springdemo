package com.prisma77.di2;

public class UserServiceImp implements UserService{

    private UserDao userDao=new UserDaoJdbcImp();
    @Override
    public void register() {
        userDao.insert();//의존하는 객체를 통해서 기능구현...
    }

    @Override
    public void findUser() {
        userDao.select();

    }
}