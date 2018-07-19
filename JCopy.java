import java.io.*;
public class JCopy {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try{
        	
            String Mike = args [0];
            String Prasin = args [1];
           
            RandomAccessFile SrcFile = new RandomAccessFile (Mike,"rw");
            File coppy = new File (Prasin);
            int x = args.length;
           
            if(x!=2){
                System.out.println("Usage : java jcoopy <src_File> <dst_File>");
               
                System.exit(0);
            }
            else if (coppy.exists()){
                System.out.println("Flie Name:"+args[1]+" has already been use");
                System.out.println("Plase Chang Name File :"+args[1]);
                System.exit(0);
            }
            else {
                RandomAccessFile CoppyFile = new RandomAccessFile(Prasin,"rw");
                long filePointer =0;
                long leght = Mike.length();
           
            while (filePointer < leght)
            {
                byte c = SrcFile.readByte();
                CoppyFile.write(c);
                filePointer = SrcFile.getFilePointer();
            }
            System.out.println("Original File ="+args[0]+"size :"+Mike.length());
            System.out.println("Copied File ="+args[1]+"size :"+Prasin.length());
            System.out.println("Complete");
            SrcFile.close();
            CoppyFile.close();
            }
            
            
        }
            catch (IndexOutOfBoundsException a)
        {
                System.err.println("Usage : java JCopy <src_file> <dst_file>");
                System.exit(0);
        }
            catch (FileNotFoundException b)
        {
                System.err.println("File Not Found");
                System.exit(0);
        }
            catch (Exception e){
           
                System.err.println("ERROR"+e.getMessage());
                System.out.println(e);
        }
       
    }  
}
//ภศิน ปรีชาธนาคุณ 5702041620115 CED2RA