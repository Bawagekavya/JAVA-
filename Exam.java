1 . Java is a high level object orineted programming , Robust programming language and a popular platform for develpoing wide 
    range of applications such as web, enterprise etc.
	
	Features of Java :
	1.Object oriented: java is a objectoriented programming language. Everthing in java is a object. Its syantax are easy to understand.
	2.Security :java is well known for its security.
	3.Robust 
	4.Multi-threaded
	5.Platform Inependent : WORA (Write once run anywhere) we can write proograms and can run on any operating system such windows, mac , linux etc.
	6.open-source
	7.scalable
	
2. Platform Independent	:  we can write proograms and can run on any operating system such windows, mac , linux etc.
   WORA (Write once run anywhere)
   
   JDK : java development kit. It consists of a set of software tools used to develop applications.
   JRE : java Runtime environment.
   JVM : java virtual machine.  It converts the byte code to machine code 
   
3. JIT 


4.Association : To relate or link 2 classes

5.Packages : 
   There are 2 types of packages
            1.used-defined
			2.Built-in : java.lang , java.object
			
	To import package  : import_packagename_classname
	
	types of import :
	    1.Inline import
		2.Import statement
		3.Wildcard import
		4.Static import
				
  uses of Package :
  1. Naming conflicts
  2. TO assemble classes and interfaces correctly
  
  
6.Data types : 2 types of datatypes
  1.Primitive data type : java already defined 8 primitive datatypes
     1.Boolean : has only 2 values either true or false
	    ex : boolean a = true;
			 
	2. Char : it stores only single char in single quote
              default value : single space char or empty space
        ex : char n1 = 's';
		
	3.Int : it stores only numeric values . by default all numbers stores as a int
            default value : 0
		ex : int a=10;
		
	4.short : it is used to store a memory space  and stores numeric values
	          default value : 0
		ex : short a=99;
		
	5.Byte :it is 2 times smaller than int 
	        default value : 0
		ex : byte b = 542;

    6. long : It is used to store a very large numbers 
             default vale : 0
		ex : long l = 7259958546l;

	7.float : it is used to store a decimal values
	     default value : 0.0
		ex : decimal a=10.098d;
		
	8. Double : it is used to stor a large values of decimal value     
	      default value : 0.0
		ex : int a=876.09733;
		
   2. Non-primitive datatype : Arrays , Strings , classes etc
   
  
7.

8.Wrapper class : 

9.Default value of localvariables 
    For primitive data type : 0.0
    For Non-Primitive datatype : null

10.Constructor : is a special method in a class	. 
                 constructor name should be same as that of class name
                 keyword used : new 
				 new keyword is used to create a copy  
				 this() or super() is the 1st statement in a constructor
				 this() refers to current instance
				 super() refers to parent class constructor
	
	Types of constructor : 
	1. No-arg constructor : constructor with no parameters
	   ex : class Food {
	          int price;
			  String name;
			  
			  public Food()     // No-arg constructor
			  {
			    system.out.println("Created constructor using no-arg constructor");
			  }
	        }
			
			
	2. Parameterized constructor : constructor with parameters
	ex : class Food {
	          int price;
			  String name;
			  
			  public Food(int price , String name)
			  {
			    this.price=price;
				this.name=name;
			    system.out.println("Created constructor using no-arg constructor");
			  }
	        }
		
	Constructor chaining : chaining of constructor but differ in parameters 
        Constructor chaining is done by 2 ways : 1.this() chaining
     		                                      2.Super() chaining
												  
			one class cannot have both this() and super() keyword									  
												  
												  
	
		 1.this() chaining : this is keyword
		                     it refers to calling a constructor from another constructor within a same class
                             it refers to a current instance 		 
	        ex: class Science{
			
			       int totalNoOfSubjects ;
				   int totalNoOfLessons;
					
		    Public Science()
			{
			system.out.println("created no-arg constructor");
			}
			
			 Public Science(int totalNoOfSubjects)
			{
			this();  // calls no-arg constructor
			this.totalNoOfSubjects=totalNoOfSubjects;
			system.out.println("created parametrized constructor");
			}
			
			}
			
			output : when we create a copy
			    created no-arg constructor
			    created no-arg constructor
			   created parametrized constructor
          	
		2.Super() chaining : super is a keyword
		                     it refers to calling a constructor from another constructor in a another class
		
		 ex: class Science{
			
			       int totalNoOfSubjects ;
				   int totalNoOfLessons;
					
		    Public Science()
			{
			system.out.println("created no-arg constructor in science");
			}
			}
			
			class Physics extends Science{
			
			    public Physics()
			    {
				 super();   // calls parent constructor i.e Science
			      system.out.println("created no-arg const in physics")
			    }
			}
			
			output : when we create a copy
			    created no-arg constructor in science
			   created no-arg constructor in physics
			   
			   
11. Method : is a block of codes which contains a set of instructions 
        
		Types of method : 
		1.Static method  : can be accessed by using classname
		                   advantage os static method is there is no need to create an copy directly we can acceess by using classname
		2. Non-static method  : known as instance method
		                        can be accessed by using 4 types
								   1. using ref
				                   2.using literals
								   3.using method name
								   4.using constructor
								For non-static method we have to created an instance i.e we have to create a copy of an object   
		3.Abstract method : declared by abstract keyword
		                    abstract method does not has a body
							while inheriting abstract method should be overrided
		
12.Polymorphism : means same name is used in different forms
                  poly means many, morphism means diff forms
				  
	
	Types of polymorphism :
	1.Overloading : same method name but differ in parameters is called overloading 
	     2 types of overloading:
		     a. constructor overloading :same constructor name but differ in parameters
			                            constructor name should be same as class name
										
			class Food {
	          int price;
			  String name;
			  
			  public Food()       //constructor 
			  {
			  	system.out.println("Created constructor using no-arg constructor");

			  }
			  
			  public Food(int price , String name)       // constructor
			  {
			    this.price=price;
				this.name=name;
			    system.out.println("Created constructor using no-arg constructor");
			  }
	        }		

            b. method overloading :same method name but differ in parameters
			                            method name may or may not be same as class same
										
			class Food {
	          int price;
			  String name;
			  
			  public Food()
			  {
			  	system.out.println("Created constructor using no-arg constructor");

			  }
			  
			  public Food(int price , String name)
			  {
			    this.price=price;
				this.name=name;
			    system.out.println("Created constructor using no-arg constructor");
			  }
			  
			  public void order(int price)             // method
			  { 
			  System.out.println("Price : " + price);
			  }
			  
			   public void order(string name)          //method
			  {
			  System.out.println("Name : " + name);
			  }
	        }	

    2.Overriding : same method is there in parent/base/super class and child/derived/sub class	
	
	     ex :class Science{
			
			       int totalNoOfSubjects ;
				   int totalNoOfLessons;
					
		    Public Science()
			{
			system.out.println("created no-arg constructor in science");
			}
			
			public void display()
			{
			system.out.println("display method")
			}
			}
			
			class Physics extends Science{
			
			    public Physics()
			    {
			      system.out.println("created no-arg const in physics")
			    }
				
			@override	
			public void display()
			{
			system.out.println("display method")
			}
			}
			
13.Inheritance : one class inherits variables and methods from another class
                 Subclass/derivedclass/child class inherits method and variables from superclass/baseclass/parnetclass	
                It is inherited by suing keyword : extends 
				
				
		Types of Inheritance
        1.single inheritance : one subclass and one super class is called single inheritance
		ex :class Science{
			
			       int totalNoOfSubjects ;
				   int totalNoOfLessons;
					
		    Public Science()
			{
			system.out.println("created no-arg constructor in science");
			}
						
			public void display()
			{
			system.out.println("display method")
			}
			}
			
			class Physics extends Science{
			
			    public Physics()
			    {
			      system.out.println("created no-arg const in physics")
			    }
				
			@override	
			public void display()
			{
			system.out.println("display method")
			}
			}
			
		2.Multilevel inheritance : one subclass inherits from another superclass/baseclass/parnetclass
        ex : class Animal{              //superclass
                String name;
               
                public Animal()
				{
				system.out.println("created animal using no-arg constructor");
				}
				
			}
			
			class Dog extend Animal{            //su class
			
			       String breed;
				   
				public Dog()
				{
				system.out.println("created Dog using no-arg constructor");
				}
				   
	        }
			
			
			class puppy extend Dog{             // subchild class
			
			    String color;
				   
				public puppy()
				{
				system.out.println("created puppy using no-arg constructor");
				}
				   
	        }
			
	3.Hierarchial Inheritance : multiple subclass inherits from one superclass	\

        ex :class Science{                  //Superclass
			
			       int totalNoOfSubjects ;
				   int totalNoOfLessons;
					
		    Public Science()
			{
			system.out.println("created no-arg constructor in science");
			}
						
			public void display()
			{
			system.out.println("display method")
			}
			}
			
			class Physics extends Science{       // subclass
			
			    public Physics()
			    {
			      system.out.println("created no-arg const in physics");
			    }
				
			@override	
			public void display()
			{
			system.out.println("display method")
			}
			
			class Biology extends Science{        // subclass
			
			    public Biology()
			    {
			      system.out.println("created no-arg const in Biology");
			    }
				
			@override	
			public void display()
			{
			system.out.println("display method")
			}
			}

			class Chemistry extends Science{          // subclass
			
			    public Chemistry()
			    {
			      system.out.println("created no-arg const in Chemistry");
			    }
				
			@override	
			public void display()
			{
			system.out.println("display method")
			}
			}
			
14.


15.Interface : it is a media between 2 classes
        there is no constructor in interfaces
        every interface method should be implemented
        without implementing we cannot create a instance
		By default all methods are abstract and final
		one interface cannot extend anothe interface


    Diff bet abstract class and interface	    
                   Abstract class                                                                       Interface	

			 
		1. Abstract class means in-complete	class                                            1.Interface is a media between 2 classes
		2.Abstract class can be completed by using                                           2. Interface is completed by using implement
		     extend keyword
		3.Abstract class is declared by abstract keyword	                                 3.Interface is declared by interface keyword
		4.Abstract class can have both abstract method                                       4. one interface cannot extend another interface
		    and concrete method
		4.with Abstract class we cannot create a instance
        5.Abstract method is not having any body
		6.We have to override abstract method in subclass 
	
	ex : class abstract science{    // abstract class                                        ex: public interface subject{
	                                                                                               
	    public void branch();	// abstract method                                                       int noOfSubjects;
		                                                                                                 String names ;
			public void display()     // concrete method                                   
			{                                                                                       public void details()
			system.out.pritln("display method");                                                    {
			}                                                                                        system.out.println("details");
			                                                                                         }
			
			class Physic extend science{                                                         public Science implement Subject{
			                                                               
			@overide                                                                              public science()     
			public void branch()                                                                  {     
			{                                                                                      system.out.println("created science using no-arg const..");
			}                                                                                     }
			                                                                                    }
			public void show()
			{
			system.out.println("Laws in physics");
			}
        }
		
		
16.Default and static keyword	in interfaces 
   types of inetrfaces	
			
			
		
			
		
        				
			
                 	
				  
		


     			   
          	
        			 
		      
  