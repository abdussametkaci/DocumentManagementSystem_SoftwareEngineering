package softwareengineering;

// Test Class for Memento Design
public class Test {

    public static void main(String[] args) {
        File file = new File() {};
        VersionTaker versionTaker = new VersionTaker();
        file.SetVersion("Version 1.0");
        versionTaker.Add(file.CreateVersionFile());
        file.SetVersion("Version 1.4");
        versionTaker.Add(file.CreateVersionFile());
        file.SetVersion("Version 2.3");
        versionTaker.Add(file.CreateVersionFile());
        
        file.SetVersionFile(versionTaker.Get(0));
        System.out.println("First saved version: " + file.GetVersion());
        file.SetVersionFile(versionTaker.Get(1));
        System.out.println("Second saved version: " + file.GetVersion());
        file.SetVersionFile(versionTaker.Get(2));
        System.out.println("Third saved version: " + file.GetVersion());
    }
    
}
