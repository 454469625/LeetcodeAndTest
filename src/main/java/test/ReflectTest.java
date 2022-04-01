package test;

import leetcode.Solution1200;
import leetcode.Solution539;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Solution1200 solution1200 = new Solution1200();
        solution1200.setTestPrivate1200("private1200");
        solution1200.setTestPublic1200("public1200");
        Map<String, Object> stringObjectMap = javaBean2Map(solution1200);
        for (String s : stringObjectMap.keySet()) {
            System.out.println(s);
        }


    }

    public static Map<String, Object> javaBean2Map(Object javaBean) throws Exception {
        Map<String, Object> map = new HashMap<>();
        Method[] methods = javaBean.getClass().getMethods(); // 获取所有方法
        for (Method method : methods) {
            if (method.getName().startsWith("get")) {
                String field = method.getName(); // 拼接属性名
                field = field.substring(field.indexOf("get") + 3);
                field = field.toLowerCase().charAt(0) + field.substring(1);
                Object value = method.invoke(javaBean, (Object[]) null ); // 执行方法
                map.put(field, value);
            }
        }
        return map;
    }
}
