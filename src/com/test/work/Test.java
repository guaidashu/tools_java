package com.test.work;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String args[]) {
        Map<String, Object> map = new HashMap<>();
        map.put("targetHeight", 200);
        map.put("float", 0.5);
        float f = FilterTool.changeToFloat(map.get("float"));
        int result = FilterTool.changeToInteger(map.get("targetHeight"));
        System.out.println(result);
        System.out.println(f);
    }
}
