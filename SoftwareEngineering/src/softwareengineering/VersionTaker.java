package softwareengineering;

import java.util.ArrayList;
import java.util.List;

// CareTaker
public class VersionTaker {
    private List<VersionFile> mementoList = new ArrayList<>();
    
    public void Add(VersionFile version) {
        mementoList.add(version);
    }
    
    public VersionFile Get(int index) {
        return mementoList.get(index);
    }
}
