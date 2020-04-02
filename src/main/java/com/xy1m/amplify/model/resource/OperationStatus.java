package com.xy1m.amplify.model.resource;

import java.util.List;

public class OperationStatus {
    private Status status;
    private List<String> reason;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<String> getReason() {
        return reason;
    }

    public void setReason(List<String> reason) {
        this.reason = reason;
    }

    public enum Status {
        Success,
        Failure
    }
}
