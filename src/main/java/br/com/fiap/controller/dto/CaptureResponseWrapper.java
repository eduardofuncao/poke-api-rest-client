package br.com.fiap.controller.dto;

public class CaptureResponseWrapper<T> {
    private final T data;
    private final String message;

    // Constructor
    public CaptureResponseWrapper(T data, String message) {
        this.data = data;
        this.message = message;
    }

    // Getters
    public T getData() { return data; }
    public String getMessage() { return message; }
}
