/**
 *  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.social.review.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0, 11-Apr-2016
 * @author vishesh
 */
@Controller
public class SocialController {

    @RequestMapping("/home")
    public String homePage() {
        return "home";
    }

}
