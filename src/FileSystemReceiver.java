// reciever
public interface FileSystemReceiver {
void openFile();
void writeFile();
void closeFile();

}

class UnixFileSystemReceiver implements FileSystemReceiver
{
    @Override
    public void openFile()
    {
        System.out.println("Opening file in unix OS");
    }

    @Override
    public void writeFile()
    {
        System.out.println("Writing file in unix OS");
    }

    @Override
    public void closeFile()
    {
        System.out.println("Closing file in unix OS");
    }
}
class WindowsFileSystemReceiver implements FileSystemReceiver
{
    @Override
    public void openFile()
    {
        System.out.println("Opening file in windows OS");
    }

    @Override
    public void writeFile()
    {
        System.out.println("Writing file in windows OS");
    }

    @Override
    public void closeFile()
    {
        System.out.println("Closing file in windows OS");
    }
}