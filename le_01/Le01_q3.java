
class Mother { 
    int x; 
    static void show() { 
    System.out.println("Show method of Mother class"); 
}}
class Child extends Mother { 
    static void show() { 
    System.out.println("Show method "); 
}
}
class Le01_q3 { 
    public static void main(String[] args) {
        Mother m = new Child(); 
        m.show();
      
    }
    
}