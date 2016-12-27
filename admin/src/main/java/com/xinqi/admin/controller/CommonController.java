package com.xinqi.admin.controller;

import com.xinqi.admin.utils.GenerateImg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by dell on 2016/8/25.
 */
@Controller
public class CommonController {

    @Autowired
    private GenerateImg generateImg;

    @RequestMapping("/common/chaptcha.do")
    public void chaptcha(HttpServletResponse response, HttpSession session) throws IOException {
//        GenerateImg generateImg = new GenerateImg();
        session.setAttribute("chaptcha",generateImg.getRandomString());
        BufferedImage image = generateImg.createImage();
        response.setContentType("image/png");
        ImageIO.write(image, "png", response.getOutputStream());
    }
}
