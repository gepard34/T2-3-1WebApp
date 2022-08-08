package ru.nikita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.nikita.dao.UserDao;

import javax.persistence.EntityManagerFactory;
//@Controller
//@RequestMapping("/users")
//public class UserController {
//    private final UserDao userDao;
//
//    public UserController(UserDao userDao) {
//        this.userDao = userDao;
//    }
//    @GetMapping()
//    public String index(Model model) {
//        model.addAttribute("users", userDao.index());
//        return "user/index";
//    }
//
//}
