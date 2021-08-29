package aop.aspects;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу " );
    }
}
