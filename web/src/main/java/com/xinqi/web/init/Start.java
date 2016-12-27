package com.xinqi.web.init;

import com.jfinal.core.JFinal;

/**
 * Created by dell on 2016/8/25.
 */
public class Start {

    public static void main(String[] args) {
        JFinal.start("src/main/web",80,"/",5);
    }
}
