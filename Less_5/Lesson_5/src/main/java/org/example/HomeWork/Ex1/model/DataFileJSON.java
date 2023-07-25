package org.example.HomeWork.Ex1.model;

public class DataFileJSON extends DataFile {

    private UserMap mapper = new UserMapJSON();
    private FileProcess fileOperation;

    public DataFileJSON(FileProcess fileProcess) {
        super(fileProcess);
        this.fileOperation = fileProcess;
    }

    public DataFileJSON(FileProcess fileProcess, UserMap userMap) {
        super(fileProcess, userMap);
        this.fileOperation = fileProcess;
    }
}