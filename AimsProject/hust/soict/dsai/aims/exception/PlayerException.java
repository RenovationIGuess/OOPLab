package AimsProject.hust.soict.dsai.aims.exception;

public class PlayerException extends Exception {
    private String errMsg;
    public PlayerException(String msg) {
        this.errMsg = msg;
    }
}
