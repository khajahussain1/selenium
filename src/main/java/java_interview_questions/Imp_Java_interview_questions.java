package java_interview_questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

/*

  1)  How garbage collector knows that the object is not in use and needs to be removed?
   Ans:- Garbage collector reclaims objects that are no longer being used, clears their memory, and keeps the memory 
      available for future allocations. This is done via bookkeeping the references to the objects. Any unreferenced 
      object is a garbage and will be collected. 
      
  2)  Can Java thread object invoke start method twice?
   Ans:- No, it throws IllegalThreadStateException
   
  3)  Give the list of Java Object class methods.
   Ans:- clone() - Creates and returns a copy of this object.
	     equals() - Indicates whether some other object is "equal to" this one.
	     finalize() - Called by the garbage collector on an object when garbage collection
		              determines that there are no more references to the object.
	     getClass() - Returns the runtime class of an object.
	     hashCode() - Returns a hash code value for the object.
	     notify() - Wakes up a single thread that is waiting on this object's monitor.
	     notifyAll() - Wakes up all threads that are waiting on this object's monitor.
	     toString() - Returns a string representation of the object.
	     wait() - Causes current thread to wait until another thread invokes the notify() method
		          or the notifyAll() method for this object.
		 
		 public Object()
         public final Class getClass()
         public int hashCode()
         public boolean equals(Object obj)
         protected Object clone() throws CloneNotSupportedException
         public String toString()
         public final void notify()
         public final void notifyAll()
         public final void wait(long timeout) throws InterruptedException
         public final void wait(long timeout, int nanoseconds) throws InterruptedException
         public final void wait() throws InterruptedException
         protected void finalize() throws Throwable	
			
  4)   Can we call servlet destory() from service()?
   Ans:-As you know, destory() is part of servlet life cycle methods, it is used to kill the
       servlet instance. Servlet Engine is used to call destory(). In case, if you call destory
       method from service(), it just execute the code written in the destory(), but it wont
       kill the servlet instance. destroy() will be called before killing the servlet instance
       by servlet engine.
       
  5)   Can we override static method?
   Ans:- We cannot override static methods. Static methods are belogs to class, not belongs
       to object. Inheritance will not be applicable for class members
       
  6)  Can you list serialization methods?
   Ans:-Serialization interface does not have any methods. It is a marker interface.
      It just tells that your class can be serializable.
      
  7)  What is the difference between super() and this()?
   Ans:-super() key word is used to call super class constructor, whereas this() key word is used to call
      constructors in the same class, means to call parameterized constructors.
      
  8)  How to prevent a method from being overridden?
   Ans:-By specifying final keyword to the method you can avoid overriding
     in a subcalss. Similarlly one can use final at class level to
     prevent creating subclasses.
     
  9)  Can we create abstract classes without any abstract methods?
   Ans:-Yes, we can create abstract classes without any abstract methods.
   
 10) Can we have static methods in interface?
   Ans:-By default, all methods in an interface are decleared as public, abstract. It will never be static. But this concept 
     is changed with java 8. Java 8 came with new feature called "default methods" with in interfaces
   
  11)  What is transient variable?
    Ans:-Transient variables cannot be serialized. During serialization process,
       transient variable states will not be serialized. State of the value will
       be always defaulted after deserialization.
    
  12)  Incase, there is a return at the end of try block, will execute finally block?
    Ans:-Yes, the finally block will be executed even after writing return statement
      at the end fo try block. It returns after executing finally block.

    
  18)  What is abstract class or abstract method?
    Ans:-We cannot create instance for an abstract class. We can able to create
       instance for its subclass only. By specifying abstract keyword just before
       class, we can make a class as abstract class.

       public abstract class MyAbstractClass{

       }

       Abstract class may or may not contains abstract methods. Abstract method is
       just method signature, it does not containes any implementation. Its subclass
       must provide implementation for abstract methods. Abstract methods are looks
       like as given below:

       public abstract int getLength();

  19)  What is default value of a boolean?
    Ans:-Default value of a boolean is false.
    
  20)  When to use LinkedList or ArrayList?
    Ans:-Accessing elements are faster with ArrayList, because it is index based.
       But accessing is difficult with LinkedList. It is slow access. This is
       to access any element, you need to navigate through the elements one by
       one. But insertion and deletion is much faster with LinkedList, because
       if you know the node, just change the pointers before or after nodes.
       Insertion and deletion is slow with ArrayList, this is because, during
       these operations ArrayList need to adjust the indexes according to
       deletion or insetion if you are performing on middle indexes. Means,
       an ArrayList having 10 elements, if you are inserting at index 5, then
       you need to shift the indexes above 5 to one more.
    
  21) What is daemon thread?
    Ans:-Daemon thread is a low priority thread. It runs intermittently
      in the back ground, and takes care of the garbage collection
      operation for the java runtime system. By calling setDaemon()
      method is used to create a daemon thread.
    
  22)  Does each thread in java uses seperate stack?
    Ans:-In Java every thread maintains its own separate stack. It is
       called Runtime Stack but they share the same memory.
    
  23)  Does system.exit() in try block executes finally block?
    Ans:-try{
		System.out.println("I am in try block");
		System.exit(1);
	    } catch(Exception ex){
		ex.printStackTrace();
	   } finally {
		System.out.println("I am in finally block!!!");
	   }
	 
	 Answer: It will not execute finally block. The program will be terminated
      after System.exit() statement.
    
  24)   What is fail-fast in java?
    Ans:- A fail-fast system is nothing but immediately report any failure that
        is likely to lead to failure. When a problem occurs, a fail-fast system
        fails immediately. In Java, we can find this behavior with iterators.
        Incase, you have called iterator on a collection object, and another
        thread tries to modify the collection object, then concurrent modification
        exception will be thrown. This is called fail-fast.
    
  25)  What is final, finally and finalize?
    Ans:-final:
	   final is a keyword. The variable decleared as final should be
	   initialized only once and cannot be changed. Java classes
	   declared as final cannot be extended. Methods declared as final
	   cannot be overridden.
	
   finally:
	   finally is a block. The finally block always executes when the
	   try block exits. This ensures that the finally block is executed
	   even if an unexpected exception occurs. But finally is useful for
	   more than just exception handling - it allows the programmer to
	   avoid having cleanup code accidentally bypassed by a return,
	   continue, or break. Putting cleanup code in a finally block is
	   always a good practice, even when no exceptions are anticipated.
	
  finalize:
	  finalize is a method. Before an object is garbage collected, the
	  runtime system calls its finalize() method. You can write system
	  resources release code in finalize() method before getting garbage
	  collected.
    
 26)  In java, are true and false keywords?
   Ans:-true, false, and null might seem like keywords, but they are actually
      literals. You cannot use them as identifiers in your programs.
   
 27)  What are the different session tracking methods?
   Ans:- Cookies:
	  You can use HTTP cookies to store information. Cookies will be
	  stored at browser side.

  URL rewriting:
	  With this method, the information is carried through url as
	  request parameters. In general added parameter will be sessionid,
	  userid. 

  HttpSession:
	 Using HttpSession, we can store information at server side. Http
	 Session provides methods to handle session related information.
	
  Hidden form fields:
	 By using hidden form fields we can insert information in the webpages
	 and these information will be sent to the server. These fields are not
	 visible directly to the user, but can be viewed	using view source
	 option from the browsers. The hidden form fields are as given below:
	
	 <input type='hidden' name='siteName' value='java2novice'/>
   
 28)  What is the purpose of garbage collection?
   Ans:- The garbage collection process is to identify the objects which are
      no longer referenced or needed by a program so that their resources can be
      reclaimed and reused. These identified objects will be discarded
   
 29) What are the types of ResultSet?
   Ans:-
     The type of a ResultSet object determines the level of its functionality in
     two areas: the ways in which the cursor can be manipulated, and how concurrent
     changes made to the underlying data source are reflected by the ResultSet object.
     The sensitivity of a ResultSet object is determined by one of three different
   
   ResultSet types:

  TYPE_FORWARD_ONLY:
	 The result set cannot be scrolled; its cursor moves forward only, from
	 before the first row to after the last row. The rows contained in the
	 result set depend on how the underlying database generates the results.
	 That is, it contains the rows that satisfy the query at either the time
	 the query is executed or as the rows are retrieved.
	
  TYPE_SCROLL_INSENSITIVE:
	 The result can be scrolled; its cursor can move both forward and backward
	 relative to the current position, and it can move to an absolute position.
	 The result set is insensitive to changes made to the underlying data source
	 while it is open. It contains the rows that satisfy the query at either the
	 time the query is executed or as the rows are retrieved.
	
TYPE_SCROLL_SENSITIVE:
	 The result can be scrolled; its cursor can move both forward and backward
	 relative to the current position, and it can move to an absolute position.
	 The result set reflects changes made to the underlying data source while
	 the result set remains open.

     The default ResultSet type is TYPE_FORWARD_ONLY.
   
 30)  What is difference between wait and sleep methods in java?
   Ans:-
    sleep():
	  It is a static method on Thread class. It makes the current thread into the
	  "Not Runnable" state for specified amount of time. During this time, the thread
	  keeps the lock (monitors) it has acquired.
	 
  wait():
	  It is a method on Object class. It makes the current thread into the "Not Runnable"
	  state. Wait is called on a object, not a thread. Before calling wait() method, the
	  object should be synchronized, means the object should be inside synchronized block.
	 The call to wait() releases the acquired lock.
    
  31) What is servlet context?
    Ans:- The servlet context is an interface which helps to communicate with
      other servlets. It contains information about the Web application and
      container. It is kind of application environment. Using the context, a
      servlet can obtain URL references to resources, and store attributes that
      other servlets in the context can use.
    
  32) What happens if one of the members in a class does not implement Serializable interface?
    Ans:- When you try to serialize an object which implements Serializable
      interface, incase if the object includes a reference of an non
      serializable object then NotSerializableException will be thrown.
    
  33)  What is race condition?
    Ans:- A race condition is a situation in which two or more threads or
       processes are reading or writing some shared data, and the final
       result depends on the timing of how the threads are scheduled.
       Race conditions can lead to unpredictable results and subtle
       program bugs. A thread can prevent this from happening by locking
       an object. When an object is locked by one thread and another
       thread tries to call a synchronized method on the same object,
       the second thread will block until the object is unlocked.
    
  34) How to get current time in milli seconds?
    Ans:- System.currentTimeMillis() returns the current time in milliseconds.
      It is a static method, returns long type.
    
  35) How can you convert Map to List?
    Ans:- 
      We know that Map contains key-value pairs, whereas a list contains
      only objects. 
      Since Entry class contains both key-value pair,
      Entry class will helps us to convert from Map (HashMap) to
      List (ArrayList). By using Map.entrySet() you will get Set
      object, which intern you can use it to convert to list object.
       
      public static void main(String a[]){
	  Map<String, String> m=new HashMap<String, String>();
		m.put("1", "khaja");
		m.put("2", "vali");
		Set<Entry<String,String>> hs=m.entrySet();
		List<Entry<String, String>> l=new ArrayList<Entry<String, String>>(hs);
		System.out.println(l);
      }
  36)  What is strictfp keyword?
    Ans:- By using strictfp keyword, we can ensure that floating point operations
       take place precisely.
    
  37) What is System.out in Java?
    Ans:- Here out is an instance of PrintStream. It is a static member variable in
      System class. This is called standard output stream, connected to console.
    
  38) What is java static import?
    Ans:- By using static imports, we can import the static members from a class
     rather than the classes from a given package.  For example, Thread class has
     static sleep method, below example gives an idea:

     import static java.lang.Thread;
     public class MyStaticImportTest {
	 public static void main(String[] a) {
		try{
			sleep(100);
		} catch(Exception ex){
		
		}
	  } 
     }
   
 39) When to use String and StringBuffer?
   Ans:- We know that String is immutable object. We can not change the value
     of a String object once it is initiated. If we try to change the value of
     the existing String object then it creates new object rather than changing
     the value of the existing object. So incase, we are going to do more
     modificatios on String, then use StringBuffer. StringBuffer updates the
     existing objects value, rather creating new object.
   
  40) What is difference between StringBuffer and StringBuilder?
    Ans:- The only difference between StringBuffer and StringBuilder is StringBuffer
      is thread-safe, that is StringBuffer is synchronized.
    
  41) What is wrapper class in java?
    Ans:- Everything in java is an object, except primitives. Primitives are
      int, short, long, boolean, etc. Since they are not objects, they cannot
      return as objects, and collection of objects. To support this, java provides
      wrapper classes to move primitives to objects. Some of the wrapper classes
      are Integer, Long, Boolean, etc.
    
  42) Is Iterator a Class?
    Ans:- Iterator is an interface. It is not a class. It is used to
      iterate through each and every element in a list. Iterator is
      implemented Iterator design pattern.
    
  43) What is java classpath?
    Ans:- The classpath is an environment variable. It is used to
      let the compiler know where the class files are available
      for import.
    
  44) Can a class in java be private?
    Ans:- We can not declare top level class as private. Java allows
      only public and default modifier for top level classes in java.
      Inner classes can be private.
    
  45) Is null a keyword in java?
    Ans:- The null value is not a keyword in java. true and flase are also not
      keywords in java. They are reserved words in java language.
    
  46) What is the initial state of a thread when it is started?
    Ans:- When the thread is created and started, initially it will be
      in the ready state.
    
  47) What is the super class for Exception and Error?
    Ans:- The super class or base class for Exception and Error is Throwable.
    
  48) What is Class.forName()?
    Ans:- Class.forName() loads the class into the ClassLoader.
    
  49) Can interface be final?
    Ans:- No. We can not instantiate interfaces, so in order to make interfaces
     useful we must create subclasses. The final keyword makes a class unable
     to be extended.
    
    What is the difference between exception and error?
    What is default value of a local variables?
    What is local class in java?
    Can we initialise uninitialized final variable?
    Can we declare abstract method as final?
    Can we have finally block without catch block?
    What is pass by value and pass by reference?
    Can we declare main method as private?
    What is the difference between preemptive scheduling and time slicing?
    Can non-static member classes (Local classes) have static members?
    What are the environment variables do we neet to set to run Java?
    Can you serialize static fields of a class?
    What is the difference between declaring a variable and defining a variable?
    Where can we use serialization?
    What modifiers are allowed for methods in an Interface?
    What is the purpose of Runtime and System class?
    Which one is faster? ArrayList or Vector? Why?
    What is the difference between static synchronized and synchronized methods?
    What is the order of catch blocks when catching more than one exception?
    What is the difference between the prefix and postfix forms of the increment(++) operator?
    What is hashCode?
    What is the difference between Hashtable and HashMap?
    What are the restrictions when overriding a method?
    What is the use of assert keyword?
    What is adapter class?
    What is difference between break, continue and return statements?
    What is the difference between while and do-while statements?
    When does the compiler provides the default constructor?
    Difference between C++ and Java.
    Usages of java packages.
    What is dynamic class loading?
    What happens if you do not provide a constructor?
    Difference between shallow cloning and deep cloning of objects?
    Can we have interfaces with no defined methods in java?
    What is the difference between “==” and equals() method?
    How can you create an immutable class in java?
    What are access modifiers?
    Can we have private constructor in java?
    Why do we need generics in java?
    What is the difference between a product and a project?
    How does substring() method works on a string?
    What is the difference between a Java Library and a framework?
    Next set of java interview questions
*
*
*/
   /*

*  The Methods of java.lang.Object
   java.lang.Object provides a number of methods that are common to all objects.
    toString() is the most common such method. Since the default toString() method only produces the name of the class, 
    you should override it in all classes you define.

   public Object()
   public final Class getClass()
   public int hashCode()
   public boolean equals(Object obj)
   protected Object clone() throws CloneNotSupportedException
   public String toString()
   public final void notify()
   public final void notifyAll()
   public final void wait(long timeout) throws InterruptedException
   public final void wait(long timeout, int nanoseconds) throws InterruptedException
   public final void wait() throws InterruptedException
   protected void finalize() throws Throwable
*
*
*/
public class Imp_Java_interview_questions {
	@Test
	public void map_to_list() {
		
		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("khaja", "hussain");
		hm.put("poola", "vali");
		
		Set<Entry<String,Object>> set = hm.entrySet();
		List<Entry<String, Object>> list = new ArrayList<Entry<String, Object>>(set);
		System.out.println(list);

	}
}
