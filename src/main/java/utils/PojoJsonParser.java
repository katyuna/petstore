package utils;

import com.google.gson.Gson;

public class PojoJsonParser {
    private static final Gson gson = new Gson();

    // JSON в POJO
    public static <T> T parseToPojo(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }

    // POJO в JSON
    public static String parseToJson(Object object) {
        return gson.toJson(object);
    }
}
