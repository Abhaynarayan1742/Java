import java.io.*;
class EnumEx {
    
    enum Color {
        RED,
        GREEN,
        BLUE,
          Yellow;
    }
    public static void main(String[] args) 
    {
          Color var_1=Color.RED;
        
 
          switch(var_1){
          case RED:
            System.out.println("Red color observed");
            break;
          case GREEN:
            System.out.println("Green color observed");
            break;
          case BLUE:
            System.out.println("Blue color observed");
          default:
            System.out.println("Other color observed");
        }
    }
}
