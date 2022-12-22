package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.Model.User;
import web.dao.UserDao;

import java.util.List;
    @Service
    public class UserServiceImpl implements UserService {
        @Autowired
        public UserServiceImpl(UserDao userDao) {
            this.userDao = userDao;
        }

        private UserDao userDao;

        @Override
        @Transactional
        public void save(User user) {
            userDao.save(user);
        }

        @Override
        @Transactional
        public void delete(User user) {
            userDao.delete(user);
        }

        @Override
        @Transactional
        public void update(User user) {
            userDao.update(user);
        }

        @Override
        @Transactional
        public List<User> listAllUsers() {
            return userDao.listAllUsers();
        }
    }

