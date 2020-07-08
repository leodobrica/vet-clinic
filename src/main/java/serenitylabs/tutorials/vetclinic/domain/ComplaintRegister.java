package serenitylabs.tutorials.vetclinic.domain;

import java.util.ArrayList;
import java.util.List;

public class ComplaintRegister {
    private final List<String> complains = new ArrayList<>();

    public List<String> getComplaints() {
        return new ArrayList<>(complains);
    }

    public void recordComplaint(String complaint) {
        complains.add(complaint);
    }
}
