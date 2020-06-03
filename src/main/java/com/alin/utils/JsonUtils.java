package com.alin.utils;

/**
 * Created by Administrator on 2019/4/2.
 */

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Json 工具
 */
public class JsonUtils {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static JsonNode str2JsonNode(String str) {

        try {
            return OBJECT_MAPPER.readTree(str);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
