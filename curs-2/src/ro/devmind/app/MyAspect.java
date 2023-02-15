package ro.devmind.app;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    @Pointcut("execution(public * *(..))")
    private void anyPublicOperation() {}

    @Pointcut("execution(* loggable*(..))")
    private void anyLoggableMethod() {}

    @Pointcut("execution(* throw*(..))")
    private void anyThrowableMethod() {}

    @Before(value = "anyPublicOperation() || anyLoggableMethod()", argNames = "joinPoint")
    public void beforeCall(JoinPoint joinPoint) {
        System.out.println("Method Name :" + joinPoint.getSignature().toShortString() +
                "| Args => " + Arrays.asList(joinPoint.getArgs()));
    }

    @AfterThrowing(value = "anyThrowableMethod()", throwing = "e")
    public void afterThrow(JoinPoint joinPoint, Throwable e) {
        System.out.println("Method Name :" + joinPoint.getSignature().toShortString() +
                    " Threw " + e.getMessage());
    }

}
