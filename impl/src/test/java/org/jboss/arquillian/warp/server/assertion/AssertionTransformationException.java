package org.jboss.arquillian.warp.server.assertion;

public class AssertionTransformationException extends Exception {

    private static final long serialVersionUID = 4893092835238942740L;

    public AssertionTransformationException() {
        super();
    }

    public AssertionTransformationException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public AssertionTransformationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AssertionTransformationException(String message) {
        super(message);
    }

    public AssertionTransformationException(Throwable cause) {
        super(cause);
    }

}
