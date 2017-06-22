package com.nullpoint.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 一句话功能简述.
 * <pre>
 * 功能详细描述
 * </pre>
 *
 * @author ZhangGe
 * @version v1.0
 * @create 2017年06月17日 14:14
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    private static final String UI_ROOT = "/customer/";

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home() {
        return UI_ROOT + "customer";
    }

    @RequestMapping(value = "/link/add", method = RequestMethod.GET)
    public String linkAdd() {
        return UI_ROOT + "/add";
    }
}
