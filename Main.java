class Main {
public static void main(String[]args) {
// code that generate exception
try{
int divideByZero = 5/0;
System.out.println("Rest of code in try block"+ divideByZero);
}
catch (Exception e) {
System.out.println("Exception => " + e.getMessage());
}
}
}
