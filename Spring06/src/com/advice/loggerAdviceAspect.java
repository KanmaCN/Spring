package com.advice;

import org.aopalliance.intercept.Joinpoint;

public class loggerAdviceAspect {
    public void doBefore(Joinpoint jp) {
        System.out.println("开始添加学生");
    }
}
