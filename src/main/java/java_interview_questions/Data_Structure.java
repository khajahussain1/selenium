package java_interview_questions;



    /*
  
      Array is a data structure in java that can hold one or more values in a single variable.
      Array in java is a collection of similar type of values.
      Java has two types of arrays – single dimensional and multidimensional arrays.
      Array index starts at 0.
      
  1)  ArrayType [] ArrayName = New ArrayType [Size of an Array]; 
      Ex:- String a[]=new String[10];
      Ex:- String [] a = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};

      ArrayType : This is the type of the array. An array can store different data types like integer, string, boolean etc.
      But the only condition with it is that all the values should be of same type in an array. If you try to assign string 
      value to an integer array, you would get compile time error.

      ArrayName : Array name can be any name you like to choose. Try making it more logical & meaningful. I always follow      
      a pattern in my code for naming variable. Like for string variables I name my variable starting with small ‘s‘, for 
      integer variable I start it with small ‘i‘ and for array I start it with small ‘a‘.

      For example: String sExample; int iExample; String[] aExample; Note: This may not be the best practice as ‘i’ denotes 
      for interfaces in Java.

      New : New is the Java keyword to create an object of a class. It locates a block of memory large enough to contain the 
      array.

      [Size of an Array] : This decides how big is the array is. At the time of creation, the length of the array must be
       specified and remains constant. [5] denotes that the array have 5 compartments in it. The first index value in the array
       is zero, thus, the index with value four is used to access the fifth element in the array.
 
  2)  The Dictionary class:-
      Dictionary is an abstract class that maps keys to values. Both keys and values can be objects of any type but 
      not null. An attempt to insert either a null key or a null value to a dictionary causes a NullPointerException exception.
      Therefore, it’s mandatory to provide a non-null value for both keys and values.
      
      The Dictionary class is an abstract class that associates keys with values.
      The HashTable extend the Dictionary class to implement the abstract methods including get, put, remove, containsKey 
      and containsValue.
      
  3)  What are Hash Tables in Data Structures?
      Hash tables are made up of two distinct parts:

      An array (something which we’re already familiar with)
      Hash function
      
   Q) What is Hash Function?
      Calculate index no where we should store 'Ada' in your array.
      Step-1:- Get ASCII code of each letter and add them
      
      ASCII CODE   A=65  D=100  a=97
      SUM          65+100+97 = 262
      
      Step-2:- Divide the sum of ASCII with length of the array.
      
      Divide 262/4
      
      step-3:- The remainder of the division is the index.
      
      remainder is 2
       
       
         ASCII Table
         Dec  = Decimal Value
        Char = Character

       '5' has the int value 53
        if we write '5'-'0' it evaluates to 53-48, or the int 5
        if we write char c = 'B'+32; then c stores 'b'


Dec  Char                           Dec  Char     Dec  Char     Dec  Char
---------                           ---------     ---------     ----------
  0  NUL (null)                      32  SPACE     64  @         96  `
  1  SOH (start of heading)          33  !         65  A         97  a
  2  STX (start of text)             34  "         66  B         98  b
  3  ETX (end of text)               35  #         67  C         99  c
  4  EOT (end of transmission)       36  $         68  D        100  d
  5  ENQ (enquiry)                   37  %         69  E        101  e
  6  ACK (acknowledge)               38  &         70  F        102  f
  7  BEL (bell)                      39  '         71  G        103  g
  8  BS  (backspace)                 40  (         72  H        104  h
  9  TAB (horizontal tab)            41  )         73  I        105  i
 10  LF  (NL line feed, new line)    42  *         74  J        106  j
 11  VT  (vertical tab)              43  +         75  K        107  k
 12  FF  (NP form feed, new page)    44  ,         76  L        108  l
 13  CR  (carriage return)           45  -         77  M        109  m
 14  SO  (shift out)                 46  .         78  N        110  n
 15  SI  (shift in)                  47  /         79  O        111  o
 16  DLE (data link escape)          48  0         80  P        112  p
 17  DC1 (device control 1)          49  1         81  Q        113  q
 18  DC2 (device control 2)          50  2         82  R        114  r
 19  DC3 (device control 3)          51  3         83  S        115  s
 20  DC4 (device control 4)          52  4         84  T        116  t
 21  NAK (negative acknowledge)      53  5         85  U        117  u
 22  SYN (synchronous idle)          54  6         86  V        118  v
 23  ETB (end of trans. block)       55  7         87  W        119  w
 24  CAN (cancel)                    56  8         88  X        120  x
 25  EM  (end of medium)             57  9         89  Y        121  y
 26  SUB (substitute)                58  :         90  Z        122  z
 27  ESC (escape)                    59  ;         91  [        123  {
 28  FS  (file separator)            60  <         92  \        124  |
 29  GS  (group separator)           61  =         93  ]        125  }
 30  RS  (record separator)          62  >         94  ^        126  ~
 31  US  (unit separator)            63  ?         95  _        127  DEL

      
   4)  What is Linked List in Data Structures?
       A linked list is a collection of multiple nodes where each node stores a reference to a data, 
       as well as a reference to the next node of the list
       
       Ex:-
       Gift + clue = combo of node
       Gift is data part of node
       clue is Address part of node
       
       Gift + Clue = Node

       So, each node is made up of up parts:

       1) Data part(gift)

       2) Memory Address part of Next Node In the List(the clue)
       
    What Is Doubly Linked List?
    Works just like the single linked list but just with one extra super power: Power to visit the past node.

    How is it done?

    Simply, by storing one additional piece of information for each node.

    In the Singly linked list, we had a reference /address of just next node. In the doubly linked list, we have reference 
    to next as well as previous node.

    So, here the Node contains:

    data as element
    address of next node as next pointer
    address of the previous node as prev pointer
* 
*/



import java.util.Hashtable;
 
class ContactBook {
	
	    Hashtable<String, String> contacts;
 
    ContactBook() {
            contacts = new Hashtable<String, String>();
    }
 
    /*
    * Has the contact added to the phone book
    * @param: String name
    * @return: true if the contact was added, false otherwise
    */
    public boolean hasName(String name) {
        
    	boolean phname =  contacts.containsKey(name);
    	
    	return phname;
    }
 
    /* Find a contact by email address
    * @param: String emailAddress
    * @return: true if the contact with the email address was added, or false if not
    */
    public boolean hasEmailAddress(String emailAddress) {
    	
        return contacts.containsValue(emailAddress);
        
    }
 
    /*
    * Find a contact
    * @param: String name
    * @return: the contact with the above name, or null if not found
    */
    public String findEmailAddress(String name) {
    	
        String emailAddress = contacts.get(name);
        
        if (emailAddress != null) {
        	
            System.out.println("[" + name + "]: [" + emailAddress + "]");
            
            return emailAddress;
            
        }else {
        	
            System.out.println("Contact for [" + name + "] not found");
            
            return null;
        }
    }
 
    /*
    * Add a new contact
    * @param: String name, String emailAddress
    * @return: 1 if a new contact is created, 0 otherwise
    */
    public int addContact(String name, String emailAddress) {
    	
        if (hasEmailAddress(emailAddress)) {
        	
            System.out.println("Cannot add [" + name + "] Email address [" + emailAddress+ "] existed");
            
            return 0;
            
        } else if (hasName(name)) {
        	
            System.out.println("Name [" + name + "] existed");
            
            return 0;
            
        } else {
        	
            contacts.put(name, emailAddress);
            
            System.out.println("A new contact for [" + name + "] added");
            
            return 1;
        }
    }
 
    /*
    * Delete a contact
    * @param: String name
    * @return: 1 if one contact was deleted, 0 otherwise
    */
    public int deleteContact(String name) {
    	
        if (hasName(name)) {
        	
            contacts.remove(name);
            
            System.out.println("Contact for [" + name + "] removed");
            
            return 1;
            
        } else {
        	
            System.out.println("Contact for [" + name + "] not found");
            
            return 0;
        }
    }
 
    /*
    * Print all contacts
    */
    public void listAllContacts() {
    	
        System.out.printf("> Current contact list\n");
        
        System.out.printf("%-10s|%-20s\n", "Name", "Email Address");
        
        for (String name : contacts.keySet()) {
        	
            String emailAddress = contacts.get(name);
            
            System.out.printf("%-10s|%-20s\n", name, emailAddress);
        }
    }
 
}

public class Data_Structure {
	 
    public static void main(String[] args) {
 
        ContactBook book = new ContactBook();
        book.addContact("Alice", "alice@example.com");
        book.addContact("Bob", "bob@example.com");
        book.addContact("Cathrine", "cathrine@example.com");
        book.addContact("Jane", "cathrine@example.com");
 
        System.out.println("> Find contact");
        book.findEmailAddress("Alice");
        book.findEmailAddress("Jane");
        book.listAllContacts();
 
        System.out.println("> Remove contact");
        book.deleteContact("Alice");
        book.listAllContacts();
    }
 
}
