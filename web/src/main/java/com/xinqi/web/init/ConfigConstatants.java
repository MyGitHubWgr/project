package com.xinqi.web.init;

import com.jfinal.config.Constants;
import com.jfinal.render.ViewType;

/**
 * Created by dell on 2016/8/25.
 */
public class ConfigConstatants {

    public static void config(Constants constants){
            constants.setDevMode(false);
            constants.setViewType(ViewType.JSP);
    }
}