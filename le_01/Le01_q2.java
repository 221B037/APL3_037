class Mother { 
    int x; 
    void show() { 
    System.out.println("Hello world"); 
}}
class Child extends Mother { 
   void show() { 
    System.out.println("Hello juet"); 
}
}
class Le01_q2 { 
    public static void main(String[] args) {
        Mother m = new Mother(); 
        m.show();
        Child ch = new Child(); 
        ch.show();
    }
    
}