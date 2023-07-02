import java.io.*;

public class Main {
    public static void main(String[] args) {
        String data = "JAVA OGRENIYORUM";

        File binder = new File("output.txt");
        try {
            FileWriter writerFile = new FileWriter(binder);
            BufferedWriter writerBuff = new BufferedWriter(writerFile);
            writerBuff.write(data);
            writerBuff.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }





       /* try {
            FileReader readerFile = new FileReader("test.txt");
            BufferedReader readBuff  = new BufferedReader(readerFile);
            String line;
            while ((line = readBuff.readLine()) != null){
                    System.out.print(line+" ####### ");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/
    }
}
