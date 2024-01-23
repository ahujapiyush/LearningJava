public class P22CopyConstructor {
    int id;  
    String name;  
    //constructor to initialize integer and string  
    P22CopyConstructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    //constructor to initialize another object  
    P22CopyConstructor(P22CopyConstructor s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
        P22CopyConstructor s1 = new P22CopyConstructor(111,"Karan");  
        P22CopyConstructor s2 = new P22CopyConstructor(s1);  
    s1.display();  
    s2.display();  
   }  
}
