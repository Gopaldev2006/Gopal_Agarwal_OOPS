import java.io.File;
import java.io.IOException; 
public class Creating{
    public static void main (String[]args){
        try{
            File obj=new File(  "myfile.txt");
            if(obj.createNewFile()){
                System.out.println("File created:"+obj.getName());
        }
    }
    catch(IOException e){
        System.out.println("An error occurred.");
        e.printStackTrace();
    }   
}
}
