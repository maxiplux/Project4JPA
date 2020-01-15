package com.packt.webstore.config;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interceptor extends HandlerInterceptorAdapter {
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

        String displayMsg="No User Authenticated yet!!!";

        if(request.getUserPrincipal()!=null) {

            displayMsg="Basic Authorization";

            if(request.isUserInRole("ROLE_ADMIN"))

            {
                displayMsg="Full Authorization";
            }

        }

        modelAndView.getModelMap().addAttribute("msg",displayMsg);
    }

}
