package model.exceptions;

public class AccountExceptions extends Exception{
    private static final long serialVersionUID;
    static {
        serialVersionUID = 1L;
    }

    public AccountExceptions(String msg) {
        super(msg);
    }
}
