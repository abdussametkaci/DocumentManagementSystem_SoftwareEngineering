package softwareengineering;

// Originator
public abstract class File {
    private String version;
    
    public void SetVersion(String version) {
        this.version = version;
    }
    
    public String GetVersion() {
        return version;
    }
    
    public VersionFile CreateVersionFile() {
        return new VersionFile(version);
    }
    
    public void SetVersionFile(VersionFile versionFile) {
        version = versionFile.GetVersion();
    }
}
