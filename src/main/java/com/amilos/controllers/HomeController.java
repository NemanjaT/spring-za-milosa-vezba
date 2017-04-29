
package com.amilos.controllers;

import com.amilos.models.Actor;
import com.amilos.services.ActorService;
import com.amilos.servicesimplementations.ActorServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * HomeController
 */
@Controller
@SessionAttributes("mojaSesija")
public class HomeController {
    private final Logger log = Logger.getLogger(getClass());
    private final Environment environment;

    @Autowired
    private ActorService actorService;

    public HomeController(Environment environment) {
        this.environment = environment;
    }

    @Bean
    private ActorService getActorService() {
        return new ActorServiceImpl();
    }

    @RequestMapping("/page")
    public String getPage() {
        return "index";
    }

    @RequestMapping(value = {"/", "/home"})
    @ResponseBody
    public Actor getUser(@RequestParam(value = "fn", required = false) String firstName, HttpSession session) {
        log.info("Home controller from env: " + environment.getActiveProfiles().length);
        Actor actor = actorService.getFirstByFirstName("ED");
        if (session.getAttribute("mojaSesija") == null) {
            session.setAttribute("mojaSesija", 0L);
        }
        actor.setMyInt((Long) session.getAttribute("mojaSesija"));
        session.setAttribute("mojaSesija", ((Long) session.getAttribute("mojaSesija")) + 1);
        return actor;
    }

    @ModelAttribute("mojaSesija")
    public Long defineMojaSesija() {
        return 0L;
    }

}
