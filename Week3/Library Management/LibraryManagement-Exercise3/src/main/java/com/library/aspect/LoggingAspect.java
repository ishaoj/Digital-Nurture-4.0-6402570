package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed(); // proceed to actual method
        long end = System.currentTimeMillis();
        System.out.println("Execution Time of " + joinPoint.getSignature().getName() + "(): " + (end - start) + " ms");
        return result;
    }
}
