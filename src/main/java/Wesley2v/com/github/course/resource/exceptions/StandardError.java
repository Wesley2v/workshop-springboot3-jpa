package Wesley2v.com.github.course.resource.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd 'T' HH:mm:ss 'Z'", timezone = "GMT")
    private Instant timestemp;
    private Integer status;
    private String error;
    private String messege;
    private String path;

    public StandardError() {
    }

    public StandardError(Instant timestemp, Integer status, String error, String messege, String path) {
        this.timestemp = timestemp;
        this.status = status;
        this.error = error;
        this.messege = messege;
        this.path = path;
    }

    public Instant getTimestemp() {
        return timestemp;
    }

    public void setTimestemp(Instant timestemp) {
        this.timestemp = timestemp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
