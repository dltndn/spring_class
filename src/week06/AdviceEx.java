package week06;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AdviceEx {
	// @Pointcut 어노테이션은 메서드에 사용
	// 반드시 리턴 type은 void
	// 메서드 명은 Advice 관련 어노테이션에서 사용
	
	// XML의 <aop:pointct />과 같음
	@Pointcut("execution(public * week06..*(..))")
	// Pointcut의 이름, <aop:pointct />의 id 
	private void pointcutName() {}
	
	// Ex1.xml의 <aop:before /> 참고
	@Before("pointcutName()")
	
	// JoinPoint를 인자로 전달받을 때에는 반드시 첫번째 인자로 지정
	public void welcomeMessage(JoinPoint joinPoint) {
		System.out.println("반가워요. " + joinPoint.getSignature().toString() + "시작합니다. ");
		System.out.println("호출  메서드(toLongString) :  " + joinPoint.getSignature().toString());
		System.out.println("호출  메서드(toLongString) :  " + joinPoint.getSignature().toString());
		System.out.println("대상 객체: " + joinPoint.getTarget());
		System.out.println("======================================");
	}
	@AfterReturning(pointcut="pointcutName()", returning="retStr")
	public void goodbyeMessage(Object retStr) {
		System.out.println("======================================");
		System.out.println("핵심 로직구현 메서드에서 반환한 값 : " + retStr);
		System.out.println("메서드 종료");
	}
	@AfterThrowing(pointcut="pointcutName()", throwing="ex")
	public void exceptionProcess(Throwable ex) {
		System.out.println("======================================");
		System.out.println("예외 발생!!, 예외 = " + ex.getMessage());
	}
	@After("pointcutName()")
	public void afterFinally(JoinPoint joinPoint) {
		System.out.println("======================================");
		System.out.println("[Ex4] joinPoint.getArgs.length: " + joinPoint.getArgs().length);
		Object[] result = joinPoint.getArgs();
		for (int i=0; i<result.length; i++) {
			System.out.println("[Ex4] joinPoint.getArgs.toString: " + result[i].toString());
		}
		System.out.println("예외 발생 여부와 상관없이 적용되는 메서드 실행 완료");
	}
	@Around("pointcutName()")
	// ProceedingJoinPoint를 반드시 첫번째 인자로 받아야 함
	public void trace(ProceedingJoinPoint joinPoint) throws Throwable {
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString + " 시작합니다.");
		long start = System.currentTimeMillis();
		try {
			System.out.println("======================================");
			// 반드시 try 블럭에서 대상 메서드를 실행
			Object result = joinPoint.proceed();
			System.out.println(result);
		} finally {
			// finally 블럭을 사용하지 않을 경우 대상 메서드 실행 후 코드가 실행되지 않음
			long finish = System.currentTimeMillis();
			System.out.println("======================================");
			System.out.println(signatureString + " 종료");
			System.out.println(signatureString + " 실행시간: " + (finish - start) + "ms");
		}
	}
	
	public void argsEx(String objName) {
		System.out.println("======================================");
		System.out.println("[argsEx]: " + objName);
	}
}
