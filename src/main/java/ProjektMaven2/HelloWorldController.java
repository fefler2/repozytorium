package ProjektMaven2;

import org.apache.commons.io.FileUtils;
import org.apache.commons.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.StringUtils.*;
import org.apache.commons.collections4.*;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class HelloWorldController {


    public static void main(String[] args) {
        System.out.println("asa");

        BasicConfigurator.configure();
        Logger logger = Logger.getLogger("Alleluja");
        logger.debug("HW");

        for (int i = 16; i < 33; i++) {
            System.out.println(i + ". \n");
        }

        System.out.println("19:01");
        System.out.println("19:12");

    }
}