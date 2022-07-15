package ide.tools.indirection;

/**
 * When you need to add behavior around a method that you can't modify (ex: a library)
 * 
 * you can introduce an indirection to this call in all your code and add the behavior here
 * 
 * Here : put a sysout before & after the call of unmodifiableMethode 
 *
 */

public class IntroduceIndirection {

	
	public void call() {
		new OutOfScopeClass().unmodifiableMethod();
	}

	public void call2() {
		new OutOfScopeClass().unmodifiableMethod();
	}

	public void call3() {
		new OutOfScopeClass().unmodifiableMethod();
	}

}

class AnotherClassSomewhereElse {
	public void call3() {
		new OutOfScopeClass().unmodifiableMethod();
	}
}

class PutIndirectionHere {
	
}