package com.kasyanov.vk.mvp.model.request;

public abstract class BaseRequest {
    private long id = 1;
    private String jsonrpc = "2.0";
    protected String method;
}