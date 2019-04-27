package com.johnson.springbase2;

public class UseFunctionService {

    private FunctionService fs;

    public void setFs(FunctionService fs) {
        this.fs = fs;
    }

    public String SayHi(String word){
        return fs.sayHello(word);
    }
}
