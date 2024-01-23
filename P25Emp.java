class Address {  
    String city,state,country;  
      
    public Address(String city, String state, String country) {  
        this.city = city;  
        this.state = state;  
        this.country = country;  
    }  
      
    }  

class P25Emp {  
    int id;  
    String name;  
    Address address;  
      
    public P25Emp(int id, String name,Address address) {  
        this.id = id;  
        this.name = name;  
        this.address=address;  
    }  
      
    void display(){  
    System.out.println(id+" "+name);  
    System.out.println(address.city+" "+address.state+" "+address.country);  
    }  
      
    public static void main(String[] args) {  
    Address address1=new Address("gzb","UP","india");  
    Address address2=new Address("gno","UP","india");  
      
    P25Emp e=new P25Emp(111,"varun",address1);  
    P25Emp e2=new P25Emp(112,"arun",address2);  
          
    e.display();  
    e2.display();  
          
    }  
    }  