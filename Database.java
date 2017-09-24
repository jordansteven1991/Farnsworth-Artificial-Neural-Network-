import java.util.*;
import java.io.*;
//import java.nio.*;
/**
 * @Steven Jordan
 * @02/03/2015
 */
public class Database 
{
    
    private FileReader file;
    private Scanner scan;
    private File myFile = new File("weights.txt");
    private boolean writerReady = false;
    private PrintWriter writer;
    //private BufferedWriter bw = Files.newBufferedWriter(file, "US-ASCII");

   
    public Database() throws IOException
    {
        //myFile = new File("weights.txt");
        file = new FileReader(myFile);
        scan = new Scanner(file);
        //writer = new PrintWriter(new BufferedWriter(new FileWriter("weights.txt")));
        //writer = new FileWriter(file);
    }
    
    public Database(File newFile) throws IOException
    {
        //myFile = new File();
        myFile = newFile;
        file = new FileReader(myFile);
        scan = new Scanner(myFile);
        //writer = new PrintWriter(new BufferedWriter(new FileWriter(newFile)));
        //writer = new FileWriter(file);
    }
    
    public double getWeight()
    {
        double x = scan.nextDouble();
        return x;
    }
    
    public void saveWeight(double x) throws IOException
    {
        if(writerReady == false)
        {
            writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
            writerReady = true;
        }
        writer.println(x);
        writer.flush();
    }
    
   
    
}
