package proiect;

import java.util.List;

public interface ReadService {
    void setRecords(List<List<String>> records);
    List<String> getRecordsHelper(String line);
}
