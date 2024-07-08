package com.kby.student.common;

import lombok.Data;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/6/25 17:28
 */
@Data
public class Result<T> {

    private Integer code;

    private String msg;

    private T data;

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result() {
        this.code = 200;
        this.msg = "成功";
    }


    public Result(T data) {
        this.code = 200;
        this.msg = "成功";
        this.data = data;
    }

    public Result<T> success(){
       return new Result<>();
    }

    public Result<T> success(T data){
        return new Result<>(data);
    }

    public Result<T> fail(){
        return new Result<>(500, "失败", null);
    }

    public Result<T> fail(T data){
        return new Result<>(500, "失败", data);
    }



}
