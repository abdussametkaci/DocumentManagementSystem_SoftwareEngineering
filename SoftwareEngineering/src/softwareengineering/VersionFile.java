package softwareengineering;

// Memento
public class VersionFile {
    private String version; // state
    
    public VersionFile(String version) {
        this.version = version;
    }
    
    public String GetVersion() {
        return version;
    }
}
