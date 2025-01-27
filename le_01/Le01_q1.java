class Mother { 
    int x; 
    void show() { 
    System.out.println("Hello world"); 
}}
class Child extends Mother { 

}
class Le01_q1 { 
    public static void main(String[] args) {
        Mother m = new Mother(); 
        m.show();
        Child ch = new Child(); 
        ch.show();
    }
    
}