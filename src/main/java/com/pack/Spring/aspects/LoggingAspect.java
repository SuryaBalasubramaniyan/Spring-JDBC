package com.pack.Spring.aspects;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import com.pack.Spring.service.Employeeservice;
import com.pack.Spring.model.*;

@Component
@Aspect
public class LoggingAspect {

	/* @Before("execution(* com.pack.Spring.service.EmployeeserviceImpl.saveEmployee(..))")
	    public void logBefore(JoinPoint target) {
	        System.out.println("------------logging before the method is getting executed-------------------");
	        System.out.println(target.getArgs()[0]);
	        System.out.println(target.getTarget() instanceof Employeeservice);
	        }
	 
	 @After("execution(* com.pack.Spring.service..EmployeeserviceImpl.deleteEmployee(..))")
	    public void logAfter(JoinPoint target) {
	        System.out.println("------------logging after the method is getting executed-------------------");
	       // System.out.println(target.getArgs()[0]);
	        System.out.println(target.getTarget() instanceof Employeeservice);
	        }
	 @Around("execution(* com.pack.Spring.service..EmployeeserviceImpl.saveEmployee(..))")
	    public void logAround(ProceedingJoinPoint target) {
	        System.out.println("------------logging before the method is getting executed-------------------");
	       // System.out.println(target.getArgs()[0]);
	        if(target.getArgs()[0] instanceof Employee) {
	        	try {
	        		target.proceed();
	        	}
	        	catch(Throwable throwable) {
	        		throwable.printStackTrace();
	        	}
	        }
	        System.out.println("---------logging after the successful execution of method------");
	        }*/
}
