package com.xinqi.web.init;

import com.jfinal.config.Routes;
import com.xinqi.web.controller.IndexController;
import com.xinqi.web.controller.user.User;
import com.xinqi.web.controller.utils.UtilsController;

/**
 * Created by dell on 2016/8/25.
 */
public class ConfigRoutes {

    public static void config(Routes routes){

        routes.add("/", IndexController.class,"/");
        routes.add("/user", User.class,"/user");

        routes.add("/common", UtilsController.class);
    }
}
